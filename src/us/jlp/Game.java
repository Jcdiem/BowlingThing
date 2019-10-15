package us.jlp;

import java.nio.file.AccessDeniedException;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Controls and runs every aspect of the program
 * Manages the players
 */
public class Game {

    public static void main(String[] args) throws AccessDeniedException {
	    simulateGame();
    }

    /**
     * Used to provide random inputs to allow classes to be easily converted for actual program use
     */
    private static void simulateGame() throws AccessDeniedException {
        //TODO: Add parameters to run a pretend game through the command line
        Player player1 = new Player();

        for(int i = 10; i > 0; i--){ //Run ten games for player1
            System.out.println(i);
            Event cEvent;
            int rand = ThreadLocalRandom.current().nextInt(1,4); //Number between 1 and 3
            player1.bowl(rand);
        }
        //player1.report(); Report the final score



    }




}
