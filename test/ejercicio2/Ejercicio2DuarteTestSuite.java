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
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author duvbarte
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({ejercicio2.Ejercicio2ABIT.class, ejercicio2.Ejercicio2Test.class, ejercicio2.Ejercicio2DuarteParamIT.class, ejercicio2.Alltest.class, ejercicio2.Ejercicio2ACBCIT.class, ejercicio2.E2ParamIT.class, ejercicio2.Ejercicio2DuarteABIT.class, ejercicio2.Ejercicio2DuarteACBCIT.class, ejercicio2.Ejercicio2DuarteTest.class})
public class Ejercicio2DuarteTestSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
