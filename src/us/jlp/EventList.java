package us.jlp;

/**
 * Updates player frame based on event (Open, Strike, or Spare)
 */

public class EventList
{

    public static Frame doOpen(int pins) //open score is pins
    {
        Frame frame = new Frame(pins, Event.OPEN);
        return frame;

    }

    public static Frame doStrike() //Strike will always be score 10
    {
        Frame frame = new Frame(12, Event.STRIKE)
        return frame;
    }

    public static Frame doSpare(int pins)
    {
        Frame frame = new Frame(pins + 10, Event.SPARE);
        return frame;
    }




}

