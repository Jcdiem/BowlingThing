package us.jlp;

/**
 * Manages a single instance of a player's score
 */
public class Frame {
    //Enum that holds the state string, which can only be (open, spare or strike)
    private int score = 0;


    //Setters and getters
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
