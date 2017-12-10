package testess;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import estg.esii.wizards.Driver;
import estg.esii.wizards.Player;
import estg.esii.wizards.Boss;
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
    /**
     *
     */
    public void testCriarJogo() {

        Player p9 = new Player();
        Boss boss1 = new Boss();
          Driver.criarJogo();
        //Driver.promptClassSelection(, p9);

    }

    @Test
    public void testVerificarCiclo() {
        Player p9 = new Player();
        p9.createWarrior(10);
        Boss boss1 = new Boss(p9);
         Driver.verificarVida(p9, boss1, 1);

    }

    @Test
    public void testsSelecionarPlayer() {
        Player p9 = new Player();
        Boss boss1 = new Boss(p9);

    }

    @Test
    public void testPhysicAttackPlayer() {
        Player p9 = new Player();
        p9.createWarrior(10);
        Boss boss1 = new Boss(p9);
        int n = boss1.getHealth();

        Driver.physicalAttack(p9, boss1);

        assertEquals(p9.getStrength(), n - boss1.getHealth());

    }

    @Test
    public void testMagicAttackPlayer() {
        Player p9 = new Player();
        p9.createWarrior(10);
        Boss boss1 = new Boss(p9);
        int n = boss1.getHealth();

        Driver.magicalAttack(p9, boss1);

        assertEquals(p9.getIntelligence(), n - boss1.getHealth());

    }

    /*
    @Test
    public void testPhysicAttackBoss() {
        Player p9 = new Player();
        Boss boss1 = new Boss(p9);
        int n= boss1.getHealth();

        Driver.physicalAttack(p9, boss1);
        
        assertEquals(p9.getStrength(),n-boss1.getHealth());

    }

    @Test
    public void testMagicAttackBoss() {
        Player p9 = new Player();
        Boss boss1 = new Boss(p9);
        int n= boss1.getHealth();
        Driver.magicalAttack(p9, boss1);
        assertEquals(p9.getIntelligence(),n-boss1.getHealth());

    }
     */
    @Test
    public void testFleaTurnoMenor3() {
        Player p9 = new Player();
        Boss boss1 = new Boss(p9);
        for (int i = 0; i <= 3; i++) {
            Driver.flea(i, p9, boss1);

            assertEquals(boss1.getAccuracy(), 0);
        }
    }

    @Test
    public void testFleaTurnoMaior3() {

        //perguntar para numero negativos
        Player p9 = new Player();
        Boss boss1 = new Boss(p9);
        for (int i = 4; i <= 100; i++) {
            Driver.flea(i, p9, boss1);
            assertEquals(boss1.getAccuracy(), 100 - 2 * (p9.getEvade()));
        }
    }

    @Test
    public void testEscolherAtack1() {

        //perguntar para numero negativos
        Player p9 = new Player();
        p9.createWarrior(10);

        Boss boss1 = new Boss(p9);

        Driver.escolherAtaque(1, p9, boss1);

    }

    @Test
    public void testEscolherAtack2() {

        //perguntar para numero negativos
        Player p9 = new Player();
        p9.createWarrior(10);

        Boss boss1 = new Boss(p9);

        Driver.escolherAtaque(2, p9, boss1);

    }

    @Test
    public void testEscolherDesistir() {

        //perguntar para numero negativos
        Player p9 = new Player();
        p9.createWarrior(10);

        Boss boss1 = new Boss(p9);

        Driver.escolherAtaque(3, p9, boss1);

    }
    
    @Test
    public void testEscolherAtackInvalida() {

        //perguntar para numero negativos
        Player p9 = new Player();
        p9.createWarrior(10);

        Boss boss1 = new Boss(p9);

        //Driver.escolherAtaque(, p9, boss1);

    }
    
    @Test
    public void testEscolherClasse1() {

        //perguntar para numero negativos
        Player p9 = new Player();
        p9.createWarrior(10);

        Boss boss1 = new Boss(p9);

        Driver.escolherClasse(1, p9);

    }
    
    @Test
    public void testEscolherClasse2() {

        //perguntar para numero negativos
        Player p9 = new Player();
        p9.createWarrior(10);

        Boss boss1 = new Boss(p9);

        Driver.escolherClasse(2, p9);

    }
    
    @Test
    public void testEscolherClasse3() {

        //perguntar para numero negativos
        Player p9 = new Player();
        p9.createWarrior(10);

        Boss boss1 = new Boss(p9);

        Driver.escolherClasse(3, p9);

    }
    
    @Test
    public void testEscolherClasseInvalida() {

        //perguntar para numero negativos
        Player p9 = new Player();
        p9.createWarrior(10);

        Boss boss1 = new Boss(p9);
        
        Driver.escolherClasse(4, p9);

    }

}
