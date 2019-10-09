package us.jlp;

/**
 * Manages a single instance of a player's score
 */
public class Frame {
    Event type;
    //Enum that holds the state string, which can only be (open, spare or strike)
    private int score = 0;

//Setters and getters

    //Score
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    //Type
    public Event getType() {
        return type;
    }
    public void setType(Event type) {
        this.type = type;
    }
}
