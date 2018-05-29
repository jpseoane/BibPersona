/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.bibpersona;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author juanpab
 */
public class PersonasTest {
    
    public PersonasTest() {
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
     * Test of getApellidos method, of class Personas.
     */
    @Test
    public void testGetApellidos() {
        System.out.println("getApellidos");
        Personas instance = new Personas();
        String expResult = "";
        String result = instance.getApellidos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of setApellidos method, of class Personas.
     */
    @Test
    public void testSetApellidos() {
        System.out.println("setApellidos");
        String apellidos = "";
        Personas instance = new Personas();
        instance.setApellidos(apellidos);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of getNombres method, of class Personas.
     */
    @Test
    public void testGetNombres() {
        System.out.println("getNombres");
        Personas instance = new Personas();
        String expResult = "";
        String result = instance.getNombres();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of setNombres method, of class Personas.
     */
    @Test
    public void testSetNombres() {
        System.out.println("setNombres");
        String nombres = "";
        Personas instance = new Personas();
        instance.setNombres(nombres);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getEdad method, of class Personas.
     */
    @Test
    public void testGetEdad() {
        System.out.println("getEdad");
        Personas instance = new Personas();
        int expResult = 0;
        int result = instance.getEdad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
     
    }

    /**
     * Test of setEdad method, of class Personas.
     */
    @Test
    public void testSetEdad() {
        System.out.println("setEdad");
        int edad = 0;
        Personas instance = new Personas();
        instance.setEdad(edad);
        // TODO review the generated test code and remove the default call to fail.
        //  fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Personas.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Personas instance = new Personas();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Personas.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Personas instance = new Personas();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Personas.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Personas instance = new Personas();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
