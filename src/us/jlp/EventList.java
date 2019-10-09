package us.jlp;

public class EventList
{

    public static void doOpen(int pins) //open score is pins
    {
        Frame Frame = new Frame();

    }

    public static void doStrike() //Strike will always be score 10
    {

    }

    public static Frame doSpare(int pins)
    {
        Frame frame = new Frame(pins + 10, Event.SPARE);
        return frame;
    }




}

