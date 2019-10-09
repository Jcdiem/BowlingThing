package us.jlp;

import java.util.Arrays;

/**
 * Manages a player's sets and keeps track of strikes' scores
 */
public class Set {
    private Frame[] frameList = new Frame[10]; //Assuming standard game of bowling
    private int currentFrame = 0;

    public void addFrame(Frame f){
        //TODO: Throw exception if the currentFrame +1 is more than 9
        frameList[currentFrame] = f;
        currentFrame++;
    }
}
