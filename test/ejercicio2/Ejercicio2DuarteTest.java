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
public class Ejercicio2DuarteTest {
    
    public Ejercicio2DuarteTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("este se ejecuta arriba adel todo y solo 1 vez");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("este se ejecuta abajo del todo ");
    }
    
    @Before
    public void setUp() {
        System.out.println("este se ejecuta antes de cada test");
    }
    
    @After
    public void tearDown() {
        System.out.println("este se ejecuta al final y limpia ");
    }

   

    /**
     * Test of IntroducirCadena method, of class Ejercicio2.
     
    @Test
    public void testIntroducirCadena() {
        System.out.println("IntroducirCadena");
        String miCadena = "";
        Ejercicio2 instance = new Ejercicio2();
        String expResult = "";
        String result = instance.IntroducirCadena(miCadena);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    */
    @Test
    public void test2_1() {
        System.out.println("caso2.1:(valores limite):cadena alfabetica y cuya longitud sea =6"
                + "la respuesta seria(salida):Cadena correcta. La aplicación permite el ingreso.");
        String miCadena = "primos";
        Ejercicio2 instance = new Ejercicio2();
        String expResult = "Cadena correcta. La aplicación permite el ingreso.";
        String result = instance.IntroducirCadena(miCadena);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void test2_2() {
        System.out.println("caso2.2:(valores limite):cadena alfabetica y cuya longitud sea =10"
                + "la respuesta seria(salida):Cadena correcta. La aplicación permite el ingreso.");
        String miCadena = "esosprimos";
        Ejercicio2 instance = new Ejercicio2();
        String expResult = "Cadena correcta. La aplicación permite el ingreso.";
        String result = instance.IntroducirCadena(miCadena);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void test2_3() {
        System.out.println("caso2.3:(valores limite):cadena no alfabetica solo y cuya longitud sea =6"
                + "la respuesta seria(salida):Cadena correcta. La aplicación permite el ingreso.");
        String miCadena = "1primo";
        Ejercicio2 instance = new Ejercicio2();
        String expResult = "Cadena incorrecta. No es alfabética.";
        String result = instance.IntroducirCadena(miCadena);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void test2_4() {
        System.out.println("caso2.4:(valores limite):cadena no alfabetica solo y cuya longitud sea =10"
                + "la respuesta seria(salida):Cadena correcta. La aplicación permite el ingreso.");
        String miCadena = "son2primos";
        Ejercicio2 instance = new Ejercicio2();
        String expResult = "Cadena incorrecta. No es alfabética.";
        String result = instance.IntroducirCadena(miCadena);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
