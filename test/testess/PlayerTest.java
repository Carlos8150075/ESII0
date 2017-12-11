/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testess;

import estg.esii.wizards.Player;
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
     * Teste do metodo createWarrior com o valor -1 nao pertencente ao
     * intervalo [0-10]
     */
    @Test
    public void testeWarrior1() {

        Player p1 = new Player();

        for (int i = 0; i < 100; i++) {

            p1.createWarrior(-1);

            assertTrue("Health:", p1.getHealth() >= 15 && p1.getHealth() < 23);
            assertTrue("Strenght:", p1.getStrength() >= 15 && p1.getStrength() < 37);
            assertTrue("Evade:", p1.getEvade() >= 3 && p1.getEvade() <= 5);
            assertTrue("Intelligence:", p1.getIntelligence() >= 5 && p1.getIntelligence() <= 39);
        }

    }

    /*
     * Teste do metodo createWarrior com o valor 0 pertencente ao
     * intervalo [0-10]
     * O teste falha sempre pois o valor tem de ser positivo
     */
    @Test
    public void testeWarrior2() {

        Player p2 = new Player();

        for (int i = 0; i < 100; i++) {

            p2.createWarrior(0);

            assertTrue(p2.getHealth() >= 15 && p2.getHealth() < 23);

        }
    }

    /*
     * Teste do metodo createWarrior com o valor 10 pertencente ao
     * intervalo [0-10]
     */
    @Test
    public void testeWarrior3() {

        Player p3 = new Player();

        for (int i = 0; i < 100; i++) {

            p3.createWarrior(10);

            assertTrue("Health:", p3.getHealth() >= 15 && p3.getHealth() < 30);
            assertTrue("Strenght", p3.getStrength() >= 15 && p3.getStrength() <= 43);
            assertTrue("Evade:", p3.getEvade() >= 10 && p3.getEvade() <= 19);
            assertTrue("Intelligence:", p3.getIntelligence() >= 5 && p3.getIntelligence() <= 45);
        }
    }

    /*
     * Teste do metodo createWarrior com o valor 15 nao pertencente ao
     * intervalo [0-10]
     */
    @Test
    public void testeWarrior4() {

        Player p4 = new Player();

        for (int i = 0; i < 100; i++) {

            p4.createWarrior(15);

            assertTrue("Health:", p4.getHealth() >= 15 && p4.getHealth() < 23);
            assertTrue("Strenght:", p4.getStrength() >= 15 && p4.getStrength() <= 41);
            assertTrue("Evade:", p4.getEvade() >= 3 && p4.getEvade() <= 5);
            assertTrue("Intelligence:", p4.getIntelligence() >= 5 && p4.getIntelligence() <= 40);
        }
    }

    /*
     * Teste do metodo createThief com o valor -1 nao pertencente ao
     * intervalo [0-5]
     */
    @Test
    public void testThief1() {
        Player p5 = new Player();

        for (int i = 0; i < 100; i++) {

            p5.createThief(-1);
            
            assertTrue("Health:", p5.getHealth() >= 1 && p5.getHealth() <= 6);
            assertTrue("Strenght:", p5.getStrength() >= 6 && p5.getStrength() <= 10);
            assertTrue("Intelligence:", p5.getIntelligence() == 5);
            assertTrue("Evade:", p5.getEvade() >= 1 && p5.getEvade() <= 101);
        }
    }

    /*
     * Teste do metodo createThief com o valor 0 pertencente ao
     * intervalo [0-5]
     */
    @Test
    public void testThief2() {
        Player p6 = new Player();

        for (int i = 0; i < 100; i++) {

            p6.createThief(0);

            assertTrue("Health:", p6.getHealth() >= 0 && p6.getHealth() <= 4);
            assertTrue("Strenght:", p6.getStrength() >= 5 && p6.getStrength() <= 9);
            assertTrue("Intelligence:", p6.getIntelligence() == 5);
            assertTrue("Evade:", p6.getEvade() >= 0 && p6.getEvade() <= 100);
        }
    }

    /*
     * Teste do metodo createThief com o valor 5 pertencente ao
     * intervalo [0-5]
     */
    @Test
    public void testThief3() {
        Player p7 = new Player();

        for (int i = 0; i < 100; i++) {
            p7.createThief(5);

            
            assertTrue("Health:", p7.getHealth() >= 5 && p7.getHealth() <= 14);
            assertTrue("Strenght:", p7.getStrength() >= 10 && p7.getStrength() <= 14);
            assertTrue("Intelligence:", p7.getIntelligence() == 5);
            assertTrue("Evade:", p7.getEvade() >= 5 && p7.getEvade() <= 105);
        }
    }

    /*
     * Teste do metodo createThief com o valor 7 nao pertencente ao
     * intervalo [0-5]
     */
    @Test
    public void testThief4() {
        Player p8 = new Player();

        for (int i = 0; i < 100; i++) {
            p8.createThief(7);

            assertTrue("Health:", p8.getHealth() >= 1 && p8.getHealth() <= 6);
            assertTrue("Strenght:", p8.getStrength() >= 6 && p8.getStrength() <= 10);
            assertTrue("Intelligence:", p8.getIntelligence() == 5);
            assertTrue("Evade:", p8.getEvade() >= 1 && p8.getEvade() <= 101);

        }
    }

    /**
     * Teste do metodo createMage 
     */
    @Test
    public void testMage1() {

        Player p9 = new Player();
        for (int i = 0; i < 100; i++) {
            p9.createMage();

            assertTrue("Health:", p9.getHealth() >= 10 && p9.getHealth() <= 14);
            assertTrue("Strenght:", p9.getStrength() >= 5 && p9.getStrength() <= 9);
            assertTrue("Intelligence:", p9.getIntelligence() >= 20 && p9.getIntelligence() <= 29);
            assertTrue("Evade:", p9.getEvade() >= 5 && p9.getEvade() <= 9);
        }
    }

    /**
     * Teste do metodo displayAttributes
     */
    @Test
    public void testDisplayAttributes() {

        
        Player instance = new Player();
        instance.displayAttributes();

    }

    /**
     * Teste do metodo getEvade
     */
    @Test
    public void testGetEvade() {
        
        for (int i = 0; i < 100; i++) {
            Player p1 = new Player();
            p1.setEvade(i);
            int result = p1.getEvade();
            assertEquals(i, result);
        }
    }

    /**
     * Teste do metodo getIntelligence
     */
    @Test
    public void testGetIntelligence() {
        
        for (int i = 0; i < 100; i++) {
            Player p1 = new Player();
            p1.setIntelligence(i);
            int result = p1.getIntelligence();
            assertEquals(i, p1.getIntelligence());

        }
    }

    /**
     * Teste do metodo setEvade
     */
    @Test
    public void testSetEvade() {
    
        for (int i = 0; i < 100; i++) {
            Player p1 = new Player();
            p1.setEvade(i);

            assertEquals(i, p1.getEvade());
        }
    }

    /**
     * Teste do metodo setIntelligence
     * 
     */
    @Test
    public void testSetIntelligence() {
        
        for (int i = 0; i < 50; i++) {
            Player p1 = new Player();
            p1.setIntelligence(i);
            assertEquals(i, p1.getIntelligence());
        }
    }

}
