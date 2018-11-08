/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.amu.dino.classes5cbe;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jsiwek
 */
public class MultiplyTest {
    
    public MultiplyTest() {
    }

    @Test
    public void testMultiply() {
        System.out.println("multiply");
        String a = "2";
        String b = "3";
        String expResult = "1";
        String result = Multiply.multiply(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testMultiply1() {
        System.out.println("multiply");
        String a = "2";
        String b = "3";
        String expResult = "6";
        String result = Multiply.multiply(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testMultiply2() {
        System.out.println("multiply");
        String a = "2";
        String b = "3";
        String expResult = "7";
        String result = Multiply.multiply(a, b);
        assertNotEquals(expResult, result);
    }
    @Test
    public void testMultiply3() {
        System.out.println("multiply");
        String a = "2";
        String b = "a";
        String expResult = null;
        String result = Multiply.multiply(a, b);
        assertEquals(expResult, result);
    }
}
