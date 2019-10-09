package us.jlp;

public class Player
{
    Set set = new Set();



public int bowl(int eventNum)
{

    switch(eventNum) {
        case 1:
            EventList.doOpen();
            break;
        case 2:
            EventList.doStrike();
            break;
        case 3:
            EventList.doSpare();
            break;
    }


}

}