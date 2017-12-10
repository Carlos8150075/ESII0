package estg.esii.wizards;

import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author carlos
 */
public class Player extends Character {

    private int evade;
    private int intelligence;

    /**
     * Construtor de player
     */
    public Player() {
        
        // Do nothing because of needs to chose a category and Y.

    }

    /**
     * Criaçao do mago
     */
    public void createMage() {
        
        Random rand = new Random();

        setHealth((rand.nextInt(4))+10);

        setStrength(rand.nextInt(4)+5);

        intelligence = rand.nextInt(9)+20;

       evade = rand.nextInt(4)+5;

    }

    /**
     * Criaçao do ladrao
     *
     * @param start valor inicial
     */
    public void createThief(int start) {

        if (start < 0 || start > 5) {
            start = 1;
        }
        Random rand = new Random();

        setHealth(start + (rand.nextInt(start + 5)));

        setStrength(5 + start + rand.nextInt(5));

        intelligence = 5;

        evade = start + rand.nextInt(100);

    }

    /**
     * Criaçao de um guerreiro
     *
     * @param start valor inicial
     */
    public void createWarrior(int start) {

        if (start < 0 || start > 10) {
            start = 3;
        }

        Random rand = new Random();

        setHealth(15 + (rand.nextInt(start + 5)));

        setStrength(15 + rand.nextInt(super.getHealth()));

        intelligence = 5 + rand.nextInt(super.getStrength());

        evade = start + rand.nextInt(start);

    }

    @Override
    public void displayAttributes() {
        System.out.println("\nPlayer \n"
                + "HP : " + this.getHealth() + "\n"
                + "STR: " + this.getStrength() + "\n"
                + "INT: " + getIntelligence() + "\n"
                + "EVD: " + getEvade() + "\n ");

    }

    public int getEvade() {
        return evade;

    }

    public int getIntelligence() {
        return intelligence;

    }

    public void setEvade(int evade) {
        this.evade = evade;

    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;

    }

}
