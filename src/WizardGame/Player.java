package WizardGame;


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
    
    }
    
    

    /**
     * Criaçao do mago
     */
  public  void createMage() {

    }

  /**
   * Criaçao do ladrao
   * @param start valor inicial
   */
   public void createThief(int start) {

    }

    
   /** 
    * Criaçao de um guerreiro
    * @param start valor inicial
    */
  public  void createWarrior(int start) {
        

        if(start<0 && start>0){
            start=3;
        }

// super.setHealth(15  + rnd(start + 5)); 

 //super.setStrength(15 + rnd(super.getHealth()));

 //this.intelligence = 5 + rnd(getStrength());

 //this.evade = start + rnd(start);

    }

    @Override
  public  void displayAttributes() {

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
