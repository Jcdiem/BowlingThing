package us.jlp;
import java.nio.file.AccessDeniedException;

public class Player
{
    Set set = new Set();

    /**
     * Simulates player bowling
     * @param eventNum number for type of event
     * @throws AccessDeniedException thrown when given a number not in the event list
     */

public void bowl(int eventNum) throws AccessDeniedException {//TODO: Add set and add frames from events to set

    switch(eventNum) {
        case 1:
            EventList.doOpen(3);
            break;
        case 2:
            EventList.doStrike();
            break;
        case 3:
            EventList.doSpare(3);
            break;
        default:
            throw new AccessDeniedException("Event should be 1, 2 or 3.");
    }


}

}