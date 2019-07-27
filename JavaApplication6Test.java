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
     * Test of power method, of class JavaApplication6.
     */
    @Test
    public void testCalculation() {
        double result = JavaApplication6.calculation(2.0);
        assertEquals(8.0, 8.0,0.0);
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

    
}
