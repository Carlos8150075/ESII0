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
    
     @Test
    public void testFleaTurnoMenor3() {
        Player p9 = new Player();
        Boss boss1 = new Boss(p9);
        for(int i=0 ; i<=3; i++){
        Driver.flea(i, p9, boss1);
        
         assertEquals(boss1.getAccuracy(),0);
        }
    }
    
    @Test
    public void testFleaTurnoMaior3() {
        
        //perguntar para numero negativos
        Player p9 = new Player();
        Boss boss1 = new Boss(p9);
        for(int i=4 ; i<=100; i++){
        Driver.flea(i, p9, boss1);
        assertEquals(boss1.getAccuracy(), 100 - 2*(p9.getEvade()));
    }
    }
   
}
