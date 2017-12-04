
/**
 * @author Johnny Chung
 *
 * @author Erik Biederstadt (original)
 * @author Patrick Abou Gharib (original)
 *
 * Driver class to run game
 */
import java.util.*;

/**
 * Classe Driver
 *
 * @author carlos .
 */
public class Driver {
    /**
     * setup game stats
     * @param player player
     * @param boss boss
     */
    public static void criarJogo(Player player, Boss boss) {

        int turn = 1;
        int choice = -1;

        System.out.println("Welcome to the game!");
        Scanner input = new Scanner(System.in);

        promptClassSelection(input, choice, player);

        player.displayAttributes();

        //spawn boss
        System.out.println("\nSpawning boss! Get Ready!");
        Boss boss1 = new Boss();
        boss1=boss;
        boss1 = new Boss(player);
        verificarVida(player, boss1, turn);

    }

    /**
     * metodo que verifica a vida do player e do boss e determina se o jogo
     * continua
     *
     * @param player player em jogo
     * @param boss1 boss em jogo
     * @param turn turno inicial =1
     * 
     */
    public static void verificarVida(Player player, Boss boss1, int turn) {
        //keep playing while player and boss still alive
   Scanner input = new Scanner(System.in);
        int escolha = -1;

        while (player.getHealth() > 0 && boss1.getHealth() > 0) {
            System.out.println("------------------------------");
            System.out.println("\nTURN: " + turn);

            if (turn <= 3) {

                boss1.setAccuracy(0);
            } else {
                boss1.setAccuracy(100 - 2 * (player.getEvade()));

            }
            boss1.displayAttributes();
            player.displayAttributes();
            System.out.println("NOTE: every 2 turns survived increases your HP");

            System.out.println("\n1| Physical Attack\n"
                    + "2| Magical Attack\n"
                    + "3| Quit game");
            System.out.print("Enter a choice: ");

            while (!input.hasNextInt()) {
                input.next();
                System.out.print("Enter a valid integer: ");
            }
            escolha = input.nextInt();

            if (escolha == 1) {
                System.out.printf("\nYou did %d damage!\n", player.getStrength());
                boss1.setHealth(boss1.getHealth() - player.getStrength());
                boss1.bossAttack(player);
            } else if (escolha == 2) {
                System.out.printf("\nYou did %d damage!\n", player.getIntelligence());
                boss1.setHealth(boss1.getHealth() - player.getIntelligence());
                boss1.bossAttack(player);
            } else if (escolha == 3) {
                System.out.println("quitting game...");
                break;
            } else {
                System.out.print("Enter a valid integer:");
            }

            //increase health every 2 turns
            if ((turn % 2) == 0) {
                player.setHealth(player.getHealth() + 10);
            }
            turn++;
        }

        if (player.getHealth() <= 0) {
            System.out.println("YOU DIED");
            if (turn <= 3) {
                System.out.println("lol git gud");
            }

        } else if (boss1.getHealth() <= 0) {
            System.out.printf("You won the game in %d turns!", turn);
        }

    }

    /**
     * //ask user for class selection
     *
     * @param input input
     * @param choice escolha introduzida pelo player
     * @param player jogador
     */
    private static void promptClassSelection(Scanner input, int choice, Player player) {
        int escolha = -1;
        while (true) {

            System.out.println("1| Select Warrior Class\n"
                    + "2| Select Mage Class\n"
                    + "3| Select Thief Class");

            System.out.print("Enter a choice: ");

            //check if integer input
            while (!input.hasNextInt()) {
                input.next();
                System.out.print("Enter a valid integer: ");
            }

            escolha = input.nextInt();

            if (escolha == 1) {
                //create warrior
                player.createWarrior(5);
                break;
            } else if (escolha == 2) {
                //create mage
                player.createMage();
                break;
            } else if (escolha == 3) {
                //create thief
                player.createThief(100);
                break;
            } else {
                System.out.println("Out of range");
            }
        }
    }

    /**
     * metodo main
     *
     * @param args argumentos
     */
    public static void main(String[] args) {
        Player player = new Player();
        Boss boss = new Boss();
        criarJogo(player, boss);
    }
}
