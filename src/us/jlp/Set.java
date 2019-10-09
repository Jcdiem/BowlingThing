package us.jlp;

import javax.swing.event.InternalFrameListener;
import java.nio.file.AccessDeniedException;

/**
 * Manages a player's sets and keeps track of strikes' scores (like turkeys0
 */
public class Set{
    private Frame[] frameList = new Frame[10]; //Assuming standard game of bowling
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

    public int getCurrentTotal(){
        int runningTotal = 0;
        for (Frame f : frameList){
            runningTotal =+ f.getScore();
        }
        return runningTotal;
    }
}
