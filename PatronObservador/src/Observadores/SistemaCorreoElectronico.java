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
public class SistemaCorreoElectronico implements Observador {

   private String ultimoTipo;

    public String getUltimoTipo() {
        return ultimoTipo;
    }
    
    @Override
    public void actualizar(int saldo,String tipo) {
        ultimoTipo=tipo;
        System.out.println("Se ha modificado la cuenta, enviar correo electronico "+tipo +"nuevo saldo "+ saldo);
    }
    
}
