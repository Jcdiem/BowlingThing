package us.jlp;

import java.nio.file.AccessDeniedException;
import java.util.Arrays;

/**
 * Manages a player's sets and keeps track of strikes' scores (like turkeys)
 */
public class Set{
    private static final int GAMELENGTH = 10;
    private Frame[] frameList = new Frame[GAMELENGTH]; //Assuming standard game of bowling
    private int currentFrame = 0;

    /**
     * Adds a frame to the set
     * @param f The frame you want to be added
     * @throws AccessDeniedException will be thrown if max number of frames has been reached for a game
     */
    public void addFrame(Frame f) throws AccessDeniedException{
        if(currentFrame++ >= 10){
            throw new AccessDeniedException("There is already the max number of frames");
        }
        frameList[currentFrame] = f;
        currentFrame++;
    }

    /**
     * Gets the total score for the game so far
     * @return Returns the total for that moment in the game
     */
    public int getCurrentTotal(){
        int runningTotal = 0;
        for (Frame f : frameList){
            if (f.getType().equals(Event.STRIKE) && f.getScore() == 10){ //If frame is unedited and strike/spare
                int scoreRun = 0;
                int fStart = Arrays.asList(frameList).indexOf(f);
                //TODO: Try and fix the for loop to be more readable
                for (int i = fStart++;i - fStart >= 2; i++){ //Adds frames infront of a strike
                    scoreRun += frameList[i].getScore();
                    if(i >= GAMELENGTH) break;//Exit the loop if about to break
                }
                //Try adding score
                try {
                    f.addScore(scoreRun);
                }
                catch (AccessDeniedException e) {
                    System.out.println("Non spare/strike frame was edited, frame not changed");
                }
                //Add to the running total
                runningTotal += f.getScore();
            }
            else runningTotal += f.getScore();
        }
        return runningTotal;
    }
}
