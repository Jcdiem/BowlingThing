package us.jlp;

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
        type = event;
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
}
