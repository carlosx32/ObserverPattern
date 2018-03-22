/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observadores;

import Interfaces.Observador;

/**
 *
 * @author carandy
 */
public class SistemaSMS implements Observador{
    private String ultimoTipo;

    public String getUltimoTipo() {
        return ultimoTipo;
    }
    
    
    @Override
    public void actualizar(int saldo,String tipo) {
        ultimoTipo=tipo;
        System.out.println("Se ha realizado una transaccion, nuevo saldo "+ saldo+ " tipo " + tipo);
    }   
}
