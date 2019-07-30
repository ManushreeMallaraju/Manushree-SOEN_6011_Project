/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author m_allara
 */
public class JavaApplication6Test {
    
    public JavaApplication6Test() {
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
     * Test of Calculation method, of class JavaApplication6.
     * For all the cases, constant values for variables, a and b are fixed
     * i.e., a=2 , b=2
     */
    @Test
    public void testCalculation() {
        
        double result = JavaApplication6.calculation(2.0);
        assertEquals(8.0, 8.0,0.0);
        
        double result1 = JavaApplication6.calculation(-2.8);
        assertEquals(32.0, 32.0,0.0);
        
         double result2 = JavaApplication6.calculation(0.0);
        assertEquals(4.0, 4.0,0.0);
        
         double result3 = JavaApplication6.calculation(18.8);
        assertEquals( 309485009821345100.0,  309485009821345100.0,0.0);
        
         double result4 = JavaApplication6.calculation(-0.9);
        assertEquals(7.200391,  7.200391,0.0);
        
        double result5 = JavaApplication6.calculation(-06.7);
        assertEquals(112589990684269.600000, 112589990684269.600000,0.0);
        
        double result6 = JavaApplication6.calculation(-0.001);
        assertEquals( 7.992000,  7.992000,0.0);       
       // TODO review the generated test code and remove the default call to fail.
    }
    /**
     * Test of power method, of class JavaApplication6.
     */
    @Test
    public void testPower() {
        double result = JavaApplication6.power(2,2.0);
        assertEquals(8.0, 8.0,0.0);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of nRoot method, of class JavaApplication6.
     */
    @Test
    public void testnRoot() {
        double result = JavaApplication6.nRoot(2,2.0);
        assertEquals(8.0, 8.0,0.0);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
