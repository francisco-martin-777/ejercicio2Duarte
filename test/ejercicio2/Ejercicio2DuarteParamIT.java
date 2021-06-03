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

/**
 *
 * @author duvbarte
 */
@RunWith(Parameterized.class)
public class Ejercicio2DuarteParamIT {

    private String cadenaEntrada;
    private String resultadoEsperado;

    public Ejercicio2DuarteParamIT(String cadenaEntrada, String resultadoEsperado) {
        this.cadenaEntrada = cadenaEntrada;
        this.resultadoEsperado = resultadoEsperado;
    }

//ahora generamos los datos de prueba:
    @Parameterized.Parameters
    public static Iterable<Object> generarDatosTest() {
        List<Object> obj = new ArrayList<>();

        obj.add(new Object[]{"primos", "Cadena correcta. La aplicación permite el ingreso."});
        obj.add(new Object[]{"esosprimos", "Cadena correcta. La aplicación permite el ingreso."});
        obj.add(new Object[]{"1primo", "Cadena incorrecta. No es alfabética."});
        obj.add(new Object[]{"son2primos", "Cadena incorrecta. No es alfabética."});

        return obj;
    }

    @Test
    public void testIntroducirCadenaParametrizada() {
        System.out.println("Introduciremos la cadena:"+ cadenaEntrada+"dandonos como resultado esperado:"
                +resultadoEsperado);
        //String miCadena = "";
        Ejercicio2 instance = new Ejercicio2();
        //String expResult = "";
        String result = instance.IntroducirCadena(cadenaEntrada);
        assertEquals(resultadoEsperado, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
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
}
