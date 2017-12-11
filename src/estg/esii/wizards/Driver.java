package estg.esii.wizards;

/**
 * @author Johnny Chung
 *
 * @author Erik Biederstadt (original)
 * @author Patrick Abou Gharib (original)
 *
 * Driver class to run game
 */
import static java.lang.System.exit;
import java.util.*;

/**
 * Classe Driver
 *
 * @author carlos .
 */
public class Driver {

    /**
     * setup game stats
     *
     *
     */
    public static void criarJogo() {

        int turn = 1;

        Player player = new Player();

        System.out.println("Welcome to the game!");
        Scanner input = new Scanner(System.in);

        promptClassSelection(input, player);

        player.displayAttributes();
        criarBoss(player, turn);
        //spawn boss

    }

    /**
     * Criar o boss
     * @param player player atraves do qual é criado o boss
     * @param turn turno
     */
    public static void criarBoss(Player player, int turn) {

        //spawn boss
        System.out.println("\nSpawning boss! Get Ready!");
        Boss boss = new Boss(player);
        verificarContinuidade(player, boss, turn);
    }

    /**
     * ataque com dan fisico
     *
     * @param player player
     * @param boss1 boss
     */
    public static void physicalAttack(Player player, Boss boss1) {
        System.out.printf("\nYou did %d damage!\n", player.getStrength());
        boss1.setHealth(boss1.getHealth() - player.getStrength());
        boss1.bossAttack(player);

    }

    /**
     * ataque magico
     *
     * @param player player
     * @param boss1 boss
     */
    public static void magicalAttack(Player player, Boss boss1) {
        System.out.printf("\nYou did %d damage!\n", player.getIntelligence());
        boss1.setHealth(boss1.getHealth() - player.getIntelligence());
        boss1.bossAttack(player);

    }

    /**
     * metodo que permite o player nao morrer nos 3 primeiros turnos
     *
     * @param turn turno
     * @param player player
     * @param boss1 boss
     */
    public static void flea(int turn, Player player, Boss boss1) {
        if (turn <= 3) {

            boss1.setAccuracy(0);
        } else {
            boss1.setAccuracy(100 - 2 * (player.getEvade()));

        }
    }

    /**
     * Escolher a classe que quer jogar
     *
     * @param escolha escolha introduzida pelo utilizador
     * @param player player
     * @param boss1 boss
     */
    public static void escolherAtaque(int escolha, Player player, Boss boss1) {

        if (escolha == 1) {
            physicalAttack(player, boss1);
        } else if (escolha == 2) {
            magicalAttack(player, boss1);

        } else if (escolha == 3) {
            System.out.println("quitting game...");
            exit(0);
        } else {
            System.out.print("Enter a valid integer:");
        }

    }

    public static void escolherClasse(int escolha, Player player) {
        if (escolha == 1) {
            //create warrior
            player.createWarrior(5);

        } else if (escolha == 2) {
            //create mage
            player.createMage();

        } else if (escolha == 3) {
            //create thief
            player.createThief(100);

        } else {
            System.out.println("Out of range");
        }
    }

    /**
     * increase health every 2 turns
     *
     * @param player player ao qual a vida vai ser aumentada
     * @param turn turno do jogo
     */
    public static void aumentarVida(Player player, int turn) {
        //increase health every 2 turns
        if ((turn % 2) == 0) {
            player.setHealth(player.getHealth() + 10);
        }

    }

    public static void verificarVida(int turn, Player player, Boss boss1) {
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
     * metodo que verifica a vida do player e do boss e determina se o jogo
     * continua
     *
     * @param player player em jogo
     * @param boss1 boss em jogo
     * @param turn turno inicial =1
     *
     */
    public static void verificarContinuidade(Player player, Boss boss1, int turn) {
        //keep playing while player and boss still alive
        Scanner input = new Scanner(System.in);
        int escolha = -1;

        while (player.getHealth() > 0 && boss1.getHealth() > 0) {
            System.out.println("------------------------------");
            System.out.println("\nTURN: " + turn);

            flea(turn, player, boss1);
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

            //utilizador escolhe o tipo de ataque
            escolherAtaque(escolha, player, boss1);

            //increase health every 2 turns
            aumentarVida(player, turn);
            turn++;
        }

        verificarVida(turn, player, boss1);

    }

    /**
     * //ask user for class selection
     *
     * @param input input
     * @param player jogador
     */
    public static void promptClassSelection(Scanner input, Player player) {
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

            escolherClasse(escolha, player);
            break;
        }
    }

    /**
     * metodo main
     *
     * @param args argumentos
     */
    public static void main(String[] args) {
        criarJogo();
    }
}
