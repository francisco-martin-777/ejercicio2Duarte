/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author duvbarte
 */
@RunWith(Parameterized.class)
public class E2ParamIT {
    private String cadenaEntrada;
    private String resultadoEsperado;
    
    public E2ParamIT(String candenaEntrada,String resultadoEsperado) {
        this.cadenaEntrada=candenaEntrada;
        this.resultadoEsperado=resultadoEsperado;
    }
    
    /**
     * ahora se generan los datos de prueba
     * @return 
     */
    @Parameters
	public static Iterable<Object> generarDatosTest() {
		List<Object> obj = new ArrayList<>();

		obj.add(new Object[] { "abuela","Cadena correcta. La aplicación permite el ingreso."});
		obj.add(new Object[] { "bisabuelas", "Cadena correcta. La aplicación permite el ingreso." });
		obj.add(new Object[] { "primo2", "Cadena incorrecta. No es alfabética."});
		obj.add(new Object[] { "consuegro7","Cadena incorrecta. No es alfabética."});

		return obj;
	}
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test parametrizado
     */
    @Test
    public void testIntroducirCadenaParametrizada() {
        System.out.println("cadena correcta con el valor:"+cadenaEntrada+"con el resultado esperado:"+ resultadoEsperado);
        //String miCadena = "";  no la usaremos,se borra
        Ejercicio2 instance = new Ejercicio2();
        //String expResult = ""; tampoco se usara, se borra
        String result = instance.IntroducirCadena(cadenaEntrada);
        assertEquals(resultadoEsperado, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
