package us.jlp;

public class Player
{
    Set set = new Set();



public void bowl(int eventNum)
{

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
    }

}

}