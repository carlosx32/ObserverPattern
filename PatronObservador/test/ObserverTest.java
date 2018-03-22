/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Observadores.SistemaCorreoElectronico;
import Observadores.SistemaSMS;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import sistema.CuentaBancaria;

/**
 *
 * @author carandy
 */

public class ObserverTest {
    
    public ObserverTest() {
        consignartest();
    }
    
    @Test
    public void consignartest() {
        SistemaCorreoElectronico correo= new SistemaCorreoElectronico();
        SistemaSMS sms= new SistemaSMS();
        
        CuentaBancaria cuenta1= new CuentaBancaria("carlos ","cc: 123", 30000);
        cuenta1.nuevoObservador(sms);
        cuenta1.nuevoObservador(correo);
        cuenta1.consignar(10);
        assertEquals(sms.getUltimoTipo(),correo.getUltimoTipo() );
    }
}
