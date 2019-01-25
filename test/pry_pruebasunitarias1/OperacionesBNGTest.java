/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pry_pruebasunitarias1;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author DELL
 */
public class OperacionesBNGTest {
    
    public OperacionesBNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of Suma method, of class OperacionesB.
     */
    @Test
    public void testSuma() {
        System.out.println("Suma");
        float num1 = 2.0F;
        float num2 = 7.0F;
        OperacionesB instance = new OperacionesB();
        float expResult = 4.0F;
        float result = instance.Suma(num1, num2);
        assertEquals(result, expResult, 4.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Restar method, of class OperacionesB.
     */
    @Test
    public void testRestar() {
        System.out.println("Restar");
        float num1 = 0.0F;
        float num2 = 0.0F;
        OperacionesB instance = new OperacionesB();
        float expResult = 0.0F;
        float result = instance.Restar(num1, num2);
        assertEquals(result, expResult, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Multiplicar method, of class OperacionesB.
     */
    @Test
    public void testMultiplicar() {
        System.out.println("Multiplicar");
        float num1 = 0.0F;
        float num2 = 0.0F;
        OperacionesB instance = new OperacionesB();
        float expResult = 0.0F;
        float result = instance.Multiplicar(num1, num2);
        assertEquals(result, expResult, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Dividir method, of class OperacionesB.
     */
    @Test
    public void testDividir() {
        System.out.println("Dividir");
        float num1 = 0.0F;
        float num2 = 0.0F;
        OperacionesB instance = new OperacionesB();
        float expResult = 0.0F;
        float result = instance.Dividir(num1, num2);
        assertEquals(result, expResult, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
