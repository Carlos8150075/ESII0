package wizardgamee;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author carlos
 */

public abstract class Character {
    
    private int health;
    private int strenght;

    /**
     * Construtor de caracter
     * 
     */
    public Character() {
        this.health = -1;
        this.strenght = -1;
    }
    
    
/**
 * Imprimir os atributos
 */
   public abstract void displayAttributes() ;
    
   public int getHealth() {
        return this.health;

    }

   public int getStrength() {
        return this.strenght;
    }

 public   void setHealth(int health) {
        this.health=health;

    }

 public   void setStrength(int strength) {
        this.strenght=strength;

    }

}
