package Uebungen._500_590._520_BuchKapitel06_Weisensee;

public class Anteil extends Bruch
{
    static Bruch verteilt = new Bruch(0, 1);

    Anteil()
    {
        super(0, 1);
    }

    Anteil (int x, int y)
    {
        super(x, y);
        verteilt = verteilt.addiere(new Bruch(x, y));
    }

    double getVerteilt()
    {
        return verteilt.dezimalwert();
    }

    Bruch getRest()
    {
        return new Bruch(1, 1).subtrahiere(verteilt);
    }
}
