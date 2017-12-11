package testess;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import estg.esii.wizards.Player;
import estg.esii.wizards.Boss;
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
public class BossTest {

    public BossTest() {
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
     * Testa se o ataque do boss esta a funcionar se a sua accuracy for de 
     * 100 e se a vida do player diminui quando é atacado
     */
    @Test
    public void testBossAttack() {

            Player p1 = new Player();
            p1.createWarrior(10);
            Boss boss1 = new Boss(p1);
            int n = p1.getHealth();
            boss1.setAccuracy(100);
            boss1.bossAttack(p1);

            assertEquals(p1.getHealth(), n - boss1.getStrength());

    }

    /**
     * Teste do Construtor da classe Boss, que nao recebe nenhum argumento
     */
    @Test
    public void testConstructor1() {

        for (int i = 0; i < 100; i++) {
            Boss boss1 = new Boss();

            boss1.displayAttributes();
            assertTrue(boss1.getAccuracy() == -1);
            assertTrue(boss1.getHealth() == -1);
            assertTrue(boss1.getStrength() == -1);

        }
    }

    /**
     * Teste do Construtor da classe Boss, que recebe como argumento um Player
     */
    @Test
    public void testConstructor2() {

        // verificar
        for (int i = 1; i < 50; i++) {
            Player p1 = new Player();
            p1.createWarrior(i);
            Boss boss1 = new Boss(p1);
            assertTrue("Health:", boss1.getHealth() >= 300 && boss1.getHealth() <= 580);
            assertTrue("Strenght:", boss1.getStrength() >= 30 && boss1.getStrength() <= 86);
        }
    }

    /**
     * Teste do metodo setAcurracy
     */
    @Test
    public void testeBossSetAcurracy() {

        for (int i = 0; i < 20; i++) {
            Boss boss1 = new Boss();
            boss1.setAccuracy(i);

            assertTrue(boss1.getAccuracy() == i);
        }
    }

    /**
     * Teste do metodo getAccuracy
     */
    @Test
    public void testGetAccuracy() {
        for (int i = 0; i < 20; i++) {
            Boss boss1 = new Boss();
            boss1.setAccuracy(i);
            int result = boss1.getAccuracy();
            assertEquals(i, result);
        }
    }

    /**
     * Teste do metodo DisplayAttributes
     */
    @Test
    public void testBossDisplayAttributes() {

        Player p = new Player();
        Boss boss1 = new Boss(p);
        boss1.displayAttributes();

    }

}
