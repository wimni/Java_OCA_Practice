package Uebungen._500_590._520_BuchKapitel06_Weisensee;

public class BruchMitSeriennummer extends Bruch
{
    private static int counter = 1;
    private final int seriennummer;

    BruchMitSeriennummer()
    {
        super();
        seriennummer = counter++;
    }

    BruchMitSeriennummer(int x)
    {
        super(x);
        seriennummer = counter++;
    }

    BruchMitSeriennummer(int x, int y)
    {
        super(x, y);
        seriennummer = counter++;
    }

    int getSeriennummer()
    {
        return seriennummer;
    }
}
