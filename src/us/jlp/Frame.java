package us.jlp;
import java.nio.file.AccessDeniedException;
/**
 * Manages a single instance of a player's score
 */
public class Frame {
    private Event type;
    private int score;

    /**
     * @param endingScore Ending score player got for that frame (Every strike is counted as a 10 score)
     * @param event How the frame ended (Can only be spare, open or strike)
     */
    public Frame(int endingScore, Event event){
        score = endingScore;
    }

//getters

    //Score
    public int getScore() {
        return score;
    }

    //Type
    public Event getType() {
        return type;
    }

      /** Used to add points after creation, intended for use with strikes and spares
      * @param s The score to be added
      * @throws AccessDeniedException is thrown when the frame is open
      */
    public void addScore(int s)throws AccessDeniedException {
        if (score != 10) throw new AccessDeniedException("Frame should not be edited unless Strike"); //Basic checking to help stop accidental edits
        else score += s;
    }



}
