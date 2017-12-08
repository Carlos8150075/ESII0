package WizardGame;

/**
 * @author Johnny Chung
 *
 * @author Erik Biederstadt (original)
 * @author Patrick Abou Gharib (original)
 *
 *
 * Boss class
 */
import java.util.*;
/**
 * Classe Boss
 * @author carlos .
 */
public class Boss extends Character{

    //boss attributes (unique from Character)
    private int accuracy;

    //
    /**
     * Constructor sem receber parametros
     */
    public Boss(){
        super();
        this.accuracy = -1;
    }

    //
    /**
     * constructor scaling with player
     * @param player player ja criado
     */
    public Boss(Player player) {
        this.setHealth( player.getHealth() * 5);
        this.setStrength(player.getStrength() * 2);
        this.accuracy = 100 - 2*(player.getEvade());

    }

    
    /**
     * 
     * @return get functions for Boss attributes
     */
    public int getAccuracy(){ return this.accuracy; }

    /**
     * defenir accuracy
     * @param accuracy a
     */
    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }


    /**
     * Imprimir os atributos
     */
    @Override
    public void displayAttributes(){
        System.out.println( "\nBoss \n"    +
                "HP : " + this.getHealth() + "\n" +
                "STR: " + this.getStrength());
    }

    /**
     * Ataque do boss
     * @param player Player a ser atacado
     * 
     */
    public void bossAttack(Player player){
        Random random = new Random();
        int chanceToHit = random.nextInt(100);
        if(chanceToHit < this.getAccuracy()) {
            System.out.printf("The boss retaliates and does %d damage!\n", this.getStrength());
            player.setHealth(player.getHealth() - this.getStrength());
        }
        else {
            System.out.println("The boss missed its counterattack!\n");
        }

    }

}
