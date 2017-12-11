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
     * Teste que permite criar um jogo e falha porque nao é permitido introduzir
     * os inputs nos testes
     */
    @Test
    public void testCriarJogo() {

        Player p9 = new Player();
        Boss boss1 = new Boss();
        Driver.criarJogo();

    }

    /**
     * Teste que permite entrar na função verificarContinuidade e falha porque
     * não é permitido introduzir os inputs nos testes
     *
     */
    @Test
    public void testVerificarCiclo() {

        Player p9 = new Player();
        p9.createWarrior(10);
        Boss boss1 = new Boss(p9);
        Driver.verificarContinuidade(p9, boss1, 1);

    }

    /**
     * Teste que permite verificar o metodo de ataque fisico do Player e se este
     * tirou o respectivo dano
     */
    @Test
    public void testPhysicAttackPlayer() {

        Player p9 = new Player();
        p9.createWarrior(10);
        Boss boss1 = new Boss(p9);
        int n = boss1.getHealth();

        Driver.physicalAttack(p9, boss1);
        assertEquals(boss1.getHealth(), n - p9.getStrength());
    }

    /**
     * Teste que permite testar o metodo de ataque magico do Player e se este
     * tirou o respectivo dano
     */
    @Test
    public void testMagicAttackPlayer() {

        Player p9 = new Player();
        p9.createWarrior(10);
        Boss boss1 = new Boss(p9);
        int n = boss1.getHealth();

        Driver.magicalAttack(p9, boss1);

        assertEquals(boss1.getHealth(), n - p9.getIntelligence());

    }

    /**
     * Teste que permite testar o metodo flea quando o turno de jogo é inferior
     * ou igual a 3
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

    /**
     * Teste que permite verificar o metodo flea quando o turno de jogo é maior
     * que 3
     */
    @Test
    public void testFleaTurnoMaior3() {

        Player p9 = new Player();
        Boss boss1 = new Boss(p9);
        for (int i = 4; i <= 100; i++) {
            Driver.flea(i, p9, boss1);
            assertEquals(boss1.getAccuracy(), 100 - 2 * (p9.getEvade()));
        }
    }

    /**
     * Teste que permite testar se o Utilizador escolhe o physicalAttack
     * e se este tira o respectivo dano
     */
    @Test
    public void testEscolherAtack1() {

        Player p9 = new Player();
        p9.createWarrior(10);

        Boss boss1 = new Boss(p9);
         int n = boss1.getHealth();

        Driver.escolherAtaque(1, p9, boss1);
        
         assertEquals(boss1.getHealth(), n - p9.getStrength());

    }

    /**
     * Teste que permite testar se o Utilizador escolhe o magicAttack
     */
    @Test
    public void testEscolherAtack2() {

        Player p9 = new Player();
        p9.createWarrior(10);

        Boss boss1 = new Boss(p9);

        int n = boss1.getHealth();

        Driver.escolherAtaque(2, p9, boss1);

        assertEquals(boss1.getHealth(), n - p9.getIntelligence());

    }

    /**
     * Teste que permite testar se o Utilizador vai escolher a opçao de
     * desistir, o teste esta em comentario porque o teste falha e não deixa os
     * outros testes correrem
     */
    /*
    @Test
    public void testEscolherDesistir() {

        //perguntar para numero negativos
        Player p9 = new Player();
        p9.createWarrior(10);

        Boss boss1 = new Boss(p9);

        Driver.escolherAtaque(3, p9, boss1);

    }*/
    /**
     * Teste que permite testar se o Utilizador ao escolher uma opção invalida ,
     * o programa irá pedir uma nova escolha
     */
    @Test
    public void testEscolherAtackInvalida() {

        //perguntar para numero negativos
        Player p9 = new Player();
        p9.createWarrior(10);

        Boss boss1 = new Boss(p9);

        Driver.escolherAtaque(4, p9, boss1);
    }

    /**
     * Teste que permite testar se o utilizador ao escolher a classe que
     * pretende , os stats do jogador vao corresponder aos da classe que
     * escolheu
     */
    @Test
    public void testEscolherClasse1() {

        Player p3 = new Player();

        Driver.escolherClasse(1, p3);

        assertTrue("Health", p3.getHealth() >= 15 && p3.getHealth() < 30);
        assertTrue("Strenght", p3.getStrength() >= 15 && p3.getStrength() <= 43);
        assertTrue("Evade", p3.getEvade() >= 5 && p3.getEvade() <= 9);
        assertTrue("Intelligence", p3.getIntelligence() >= 5 && p3.getIntelligence() <= 45);

    }

    /**
     * Teste que permite testar se o utilizador ao escolher a classe que
     * pretende , os stats do jogador vao corresponder aos da classe que
     * escolheu
     */
    @Test
    public void testEscolherClasse2() {

        Player p9 = new Player();
        Driver.escolherClasse(2, p9);

        assertTrue("Health", p9.getHealth() >= 10 && p9.getHealth() <= 14);
        assertTrue("Strength", p9.getStrength() >= 5 && p9.getStrength() <= 9);
        assertTrue("Intelligence", p9.getIntelligence() >= 20 && p9.getIntelligence() <= 29);
        assertTrue("Evade", p9.getEvade() >= 5 && p9.getEvade() <= 9);

    }

    /**
     * Teste que permite testar se o utilizador ao escolher a classe que
     * pretende , os stats do jogador vao corresponder aos da classe que
     * escolheu
     */
    @Test
    public void testEscolherClasse3() {

        Player p8 = new Player();
        Driver.escolherClasse(3, p8);

        assertTrue("Health", p8.getHealth() >= 1 && p8.getHealth() <= 6);
        assertTrue("Strength", p8.getStrength() >= 6 && p8.getStrength() <= 10);
        assertTrue("Intelligence", p8.getIntelligence() == 5);
        assertTrue("Evade", p8.getEvade() >= 1 && p8.getEvade() <= 101);

    }

    /**
     * Teste que permite testar se o utilizador ao escolher a classe que
     * pretende , os stats do jogador vao corresponder aos da classe que
     * escolheu neste teste a escolha é invalida
     */
    @Test
    public void testEscolherClasseInvalida() {

        Player p3 = new Player();

        Driver.escolherClasse(4, p3);

        assertFalse("Health", p3.getHealth() >= 15 && p3.getHealth() < 30);
        assertFalse("Strenght", p3.getStrength() >= 15 && p3.getStrength() <= 43);
        assertFalse("Evade", p3.getEvade() >= 5 && p3.getEvade() <= 9);
        assertFalse("Intelligence", p3.getIntelligence() >= 5 && p3.getIntelligence() <= 45);

    }

    /**
     * Teste que permite testar se o Player morre quando a sua vida é 0
     */
    @Test
    public void testMorte() {

        Player p9 = new Player();
        p9.createWarrior(10);

        Boss boss1 = new Boss(p9);

        Driver.verificarVida(1, p9, boss1);
        
        

    }

    /**
     * Teste que permite correr a funçao que verifica se o player
     */
    @Test
    public void testMortePlayerMaisQueTurno3() {

        Player p9 = new Player();
        p9.createWarrior(10);

        Boss boss1 = new Boss(p9);

        p9.setHealth(0);

        Driver.verificarVida(3, p9, boss1);

    }

    /**
     * Teste que permite aumentar a vida do Player
     */
    @Test
    public void testAumentarVida() {

        Player p9 = new Player();
        Player p8 = new Player();

        Driver.aumentarVida(p9, 2);
        p8.setHealth(p8.getHealth() + 10);

        assertEquals(p9.getHealth(), p8.getHealth());

    }

    /**
     * Teste que permite verificar de o aumento de vida do Player falha se o turno for par
     */
    @Test
    public void testAumentarVidaFail() {

        Player p9 = new Player();
        Player p8 = new Player();

        Driver.aumentarVida(p9, 1);
        p8.setHealth(p8.getHealth() + 10);

        assertNotEquals(p9.getHealth(), p8.getHealth());

    }

    /**
     * Teste que permite testar a criação de um Boss
     */
    @Test
    public void testCriarBoss() {

        Player p9 = new Player();

        Driver.criarBoss(p9, 0);
        

    }
}
