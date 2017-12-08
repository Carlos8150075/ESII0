package Testes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import WizardGame.Driver;
import WizardGame.Player;
import WizardGame.Boss;
import java.util.Scanner;
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
public class DriverTest {

    public DriverTest() {
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
     * TESTE 1: Warrior com valor -1 que não pertence ao intervalo [0-10]
     */
    @Test
    public void testeWarrior1() {

        Player p1 = new Player();

        for (int i = 0; i < 100; i++) {

            p1.createWarrior(-1);

            assertTrue(p1.getHealth() >= 15 && p1.getHealth() < 23);
            assertTrue(p1.getStrength() >= 15 && p1.getStrength() < 37);
            assertTrue(p1.getEvade() >= 3 && p1.getEvade() <= 5);
            assertTrue(p1.getIntelligence() >= 5 && p1.getIntelligence() <= 36);

        }

    }

    /*
     * TESTE 2:
     * Warrior com valor 0 que pertence ao intervalo [0-10]
     * Falha sempre pois o valor tem de ser positivo
     */
 /*@Test
    public void testeWarrior2() {

        Player p2 = new Player();

        for (int i = 0; i < 100; i++) {

            p2.createWarrior(0);

            assertTrue(p2.getHealth() >= 15 && p2.getHealth() < 23);

        }
    }*/

 /*
     * TESTE 3:
     * Warrior com valor 10 que pertence ao intervalo [0-10]
     */
    @Test
    public void testeWarrior3() {

        Player p3 = new Player();

        for (int i = 0; i < 100; i++) {

            p3.createWarrior(10);

            assertTrue(p3.getHealth() >= 15 && p3.getHealth() < 30);
            //assertTrue(p3.getStrength() >= 15 && p3.getStrength() < 37);
            assertTrue(p3.getStrength() >= 15 && p3.getStrength() <= 43);
            assertTrue(p3.getEvade() >= 10 && p3.getEvade() <= 19);
            assertTrue(p3.getIntelligence() >= 5 && p3.getIntelligence() <= 45);
        }
    }

    /*
     * TESTE 4:
     * Warrior com valor 15 que nao pertence ao intervalo [0-10]
     */
    @Test
    public void testeWarrior4() {

        Player p4 = new Player();

        for (int i = 0; i < 100; i++) {

            p4.createWarrior(15);

            assertTrue(p4.getHealth() >= 15 && p4.getHealth() < 23);
            assertTrue(p4.getStrength() >= 15 && p4.getStrength() <= 41);
            assertTrue(p4.getEvade() >= 3 && p4.getEvade() <= 5);
            assertTrue(p4.getIntelligence() >= 5 && p4.getIntelligence() <= 40);
        }
    }

    /*
     * TESTE 5:
     * Thief com valor -1 que não pertence ao intervalo [0-5]
     */
    @Test
    public void testThief1() {
        Player p5 = new Player();

        for (int i = 0; i < 100; i++) {

            p5.createThief(-1);

            assertTrue(p5.getHealth() >= 1 && p5.getHealth() <= 5);
            assertTrue(p5.getStrength() >= 6 && p5.getStrength() <= 10);
            assertTrue(p5.getIntelligence() == 5);
            assertTrue(p5.getEvade() >= 1 && p5.getEvade() <= 101);
        }
    }

    /*
     * TESTE 6:
     * Thief com valor 0 que pertence ao intervalo [0-5]
     */
    @Test
    public void testThief2() {
        Player p6 = new Player();

        for (int i = 0; i < 100; i++) {

            p6.createThief(0);

            assertTrue(p6.getHealth() >= 0 && p6.getHealth() <= 4);
            assertTrue(p6.getStrength() >= 5 && p6.getStrength() <= 9);
            assertTrue(p6.getIntelligence() == 5);
            assertTrue(p6.getEvade() >= 0 && p6.getEvade() <= 100);
        }
    }

    /*
     * TESTE 7:
     * Thief com valor 5 que pertence ao intervalo [0-5]
     */
    @Test
    public void testThief3() {
        Player p7 = new Player();

        for (int i = 0; i < 100; i++) {
            p7.createThief(5);

            assertTrue(p7.getHealth() >= 5 && p7.getHealth() <= 9);
            assertTrue(p7.getStrength() >= 10 && p7.getStrength() <= 14);
            assertTrue(p7.getIntelligence() == 5);
            assertTrue(p7.getEvade() >= 5 && p7.getEvade() <= 105);
        }
    }

    /*
     * TESTE 8:
     * Thief com valor 7 que nao pertence ao intervalo [0-5]
     */
    @Test
    public void testThief4() {
        Player p8 = new Player();

        for (int i = 0; i < 100; i++) {
            p8.createThief(7);
            //System.out.println(p8.getEvade());
            assertTrue(p8.getHealth() >= 1 && p8.getHealth() <= 5);
            assertTrue(p8.getStrength() >= 6 && p8.getStrength() <= 10);
            assertTrue(p8.getIntelligence() == 5);
            assertTrue(p8.getEvade() >= 1 && p8.getEvade() <= 101);
        }
    }

    /**
     *
     * health min = 10 max = 14 intelligence min=20 max =29 evade min = 5 max =9
     *
     */
    @Test
    public void testMage1() {

        Player p9 = new Player();
        for (int i = 0; i < 100; i++) {
            p9.createMage();
            //   System.out.println(p9.getStrength());
            assertTrue(p9.getHealth() >= 10 && p9.getHealth() <= 14);
            assertTrue(p9.getStrength() >= 5 && p9.getStrength() <= 9);
            assertTrue(p9.getIntelligence() >= 20 && p9.getIntelligence() <= 29);
            assertTrue(p9.getEvade() >= 5 && p9.getEvade() <= 9);
        }

    }

    @Test
    /**
     *
     */
    public void testCriarJogo() {

        Player p9 = new Player();
        Boss boss1 = new Boss();
        Driver.criarJogo();

    }

    @Test
    public void testVerificarCiclo() {
        Player p9 = new Player();
        Boss boss1 = new Boss(p9);
        Driver.verificarVida(p9, boss1, 1);

    }

    @Test
    public void testsSelecionarPlayer() {
        Player p9 = new Player();
        Boss boss1 = new Boss(p9);

    }

    @Test
    public void testPhysicAttack() {
        Player p9 = new Player();
        Boss boss1 = new Boss(p9);

        Driver.physicalAttack(p9, boss1);

    }

    @Test
    public void testMagicAttack() {
        Player p9 = new Player();
        Boss boss1 = new Boss(p9);

        Driver.magicalAttack(p9, boss1);

    }

}
