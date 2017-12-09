/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testess;

import wizardgamee.Player;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author carlos
 */
public class PlayerTest {
    
    public PlayerTest() {
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
     * Test of createMage method, of class Player.
     */
    @Test
    public void testCreateMage() {
        System.out.println("createMage");
        Player instance = new Player();
        instance.createMage();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createThief method, of class Player.
     */
    @Test
    public void testCreateThief() {
        System.out.println("createThief");
        int start = 0;
        Player instance = new Player();
        instance.createThief(start);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createWarrior method, of class Player.
     */
    @Test
    public void testCreateWarrior() {
        System.out.println("createWarrior");
        int start = 0;
        Player instance = new Player();
        instance.createWarrior(start);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayAttributes method, of class Player.
     */
    @Test
    public void testDisplayAttributes() {
        System.out.println("displayAttributes");
        Player instance = new Player();
        instance.displayAttributes();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEvade method, of class Player.
     */
    @Test
    public void testGetEvade() {
        System.out.println("getEvade");
        Player instance = new Player();
        int expResult = 0;
        int result = instance.getEvade();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIntelligence method, of class Player.
     */
    @Test
    public void testGetIntelligence() {
        System.out.println("getIntelligence");
        Player instance = new Player();
        int expResult = 0;
        int result = instance.getIntelligence();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEvade method, of class Player.
     */
    @Test
    public void testSetEvade() {
        System.out.println("setEvade");
        int evade = 0;
        Player instance = new Player();
        instance.setEvade(evade);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIntelligence method, of class Player.
     */
    @Test
    public void testSetIntelligence() {
        System.out.println("setIntelligence");
        int intelligence = 0;
        Player instance = new Player();
        instance.setIntelligence(intelligence);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
