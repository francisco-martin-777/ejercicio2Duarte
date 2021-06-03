/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author duvbarte
 */
public class Ejercicio2ACBCIT {
    private static Ejercicio2 instance;
    
    public Ejercicio2ACBCIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        instance=new Ejercicio2();
    }
    
    @AfterClass
    public static void tearDownClass() {
        instance=null;
    }
    
    /*@Before           no las necesito,se borran
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }*/

    /**
     * Caso 4.1: Datos de entrada: cadena de 6 caracteres, sólo caracteres
     * alfabéticos. Resultado esperado (Salida): La aplicación permite el
     * ingreso del dato.
     */
    @Test
    public void testCaso4_1() {
        System.out.println("Caso 4.1: Datos de entrada: cadena de 6 caracteres, sólo caracteres alfabéticos. Resultado\n"
                + "    esperado (Salida): La aplicación permite el ingreso del dato.");

        //Ejercicio1 instance = new Ejercicio1();
        String expResult = "Cadena correcta. La aplicación permite el ingreso.";
        String result = instance.IntroducirCadena("abuela");
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Caso 4.2: Datos de entrada: cadena de 10 caracteres, sólo caracteres
     * alfabéticos. Resultado esperado (Salida): La aplicación permite el
     * ingreso del dato.
     */
    @Test
    public void testCaso4_2() {
        System.out.println("Caso 4.2: Datos de entrada: cadena de 10 caracteres, sólo caracteres alfabéticos. Resultado\n"
                + "    esperado (Salida): La aplicación permite el ingreso del dato.");

        //Ejercicio1 instance = new Ejercicio1();
        String expResult = "Cadena correcta. La aplicación permite el ingreso.";
        String result = instance.IntroducirCadena("bisabuelas");
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Caso 4.3: Datos de entrada: cadena de 6 caracteres, con caracteres no
     * alfabéticos. Resultado esperado (Salida): La aplicación no permite el
     * ingreso del dato y muestra un mensaje de error.
     */
    @Test
    public void testCaso4_3() {
        System.out.println("Caso 4.3: Datos de entrada: cadena de 6 caracteres, con caracteres no alfabéticos. Resultado\n"
                + "    esperado (Salida): La aplicación no permite el ingreso del dato y muestra un mensaje de error.");

        //Ejercicio1 instance = new Ejercicio1();
        String expResult = "Cadena incorrecta. No es alfabética.";
        String result = instance.IntroducirCadena("primo2");
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Caso 4.4: Datos de entrada: cadena de 10 caracteres, con caracteres no
     * alfabéticos. Resultado esperado (Salida): La aplicación no permite el
     * ingreso del dato y muestra un mensaje de error.
     */
    @Test
    public void testCaso4_4() {
        System.out.println("Caso 4.4: Datos de entrada: cadena de 10 caracteres, con caracteres no alfabéticos.\n"
                + "    Resultado esperado (Salida): La aplicación no permite el ingreso del dato y muestra un\n"
                + "    mensaje de error.");

       //Ejercicio1 instance = new Ejercicio1();
        String expResult = "Cadena incorrecta. No es alfabética.";
        String result = instance.IntroducirCadena("consuegro7");
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
