/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import Interfaces.Observador;
import Interfaces.SujetoObservado;
import java.util.ArrayList;

/**
 *
 * @author carandy
 */
public class CuentaBancaria implements SujetoObservado {
    private  ArrayList<Observador> observadores;
    private String nombre;
    private String cedula;
    private int saldo;
    
    public CuentaBancaria(String nombre, String cedula, int saldo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.saldo = saldo;
        this.observadores = new ArrayList<Observador>();
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getSaldo() {
        return saldo;
    }
/*
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
*/  
    public int consignar(int valor){
        if(valor>0){
            saldo=saldo+valor;
            notificar("consignacion");
        }
        return saldo;
    }
    public int pago(int valor){
        if(valor<=saldo && valor>1){
            saldo=saldo-valor;
            notificar("retiro");
        }
        return saldo;
    }
    public void nuevoObservador(Observador obs){
        this.observadores.add(obs);
    }
/*
    @Override
    public void notificar(String tipo) {
        //avisar el estado a los observadores
        observadores.forEach((o) -> {
            o.actualizar(saldo,tipo);
        });
        
    }
  */  
    
    @Override
    public void notificar(String tipo) {
        //Este metodo esta mal puesto que solo notifica al primer observador
        observadores.get(0).actualizar(saldo, tipo);
    }
}
