package Uebungen._700_790;

public class _700_BruecheKuerzen_Weisensee
{

    /*
     * Brüche kürzen
     *
     * Normalerweise darf man aus Brüchen nicht einfach einzelne Ziffern kürzen.
     * So ist 18/12 natürlich nicht gleich 8/2 (wenn ich die eins kürzen würde).
     * Bei einigen Zahlenpaaren funktioniert dies jedoch zufälligerweise.
     * So ist (65/26) dasselbe wie 5/2 (einfach die Ziffer 6 im Zählen und Nenner steichen).
     * Schreibe ein Programm, dass von allen
     * zweistelligen Zahlenpaaren (Paare aus jeweils zwei zweistelligen Zahlen) angibt,
     * ob die Zahl «ziffernkürzbar» ist.
     */

    public static void main(String[] args)
    {
        for (int i = 10; i < 100; i++)
        {
            if ( i % 10 == 0 && i != 10)
                System.out.println();
            for (int j = 10; j < 100; j++)
            {
                if (istZiffernkuerzbar(i, j))
                    System.out.print(i + "/" + j + "\t");
            }
        }
    }

    private static boolean istZiffernkuerzbar(int zaehler, int nenner)
    {
        if (zaehler == nenner) { return true; }
        int zaehlerZahlEinser = zaehler % 10;
        int zaehlerZahlZehner = zaehler / 10;
        int zaehlerGekuerzt = 0;
        int nennerZahlEinser = nenner % 10;
        int nennerZahlZehner = nenner / 10;
        int nennerGekuerzt = 0;
        int ggt = getGGT(zaehler, nenner);

        if (zaehlerZahlEinser == nennerZahlEinser)
        {
            zaehlerGekuerzt = zaehlerZahlZehner;
            nennerGekuerzt = nennerZahlZehner;
        }
        else if (zaehlerZahlEinser == nennerZahlZehner)
        {
            zaehlerGekuerzt = zaehlerZahlZehner;
            nennerGekuerzt = nennerZahlEinser;
        }
        else if (zaehlerZahlZehner == nennerZahlEinser)
        {
            zaehlerGekuerzt = zaehlerZahlEinser;
            nennerGekuerzt = nennerZahlZehner;
        }
        else if (zaehlerZahlZehner == nennerZahlZehner)
        {
            zaehlerGekuerzt = zaehlerZahlEinser;
            nennerGekuerzt = nennerZahlEinser;
        }

        if (zaehlerGekuerzt == 0 || nennerGekuerzt == 0 || ggt == 0) { return false; }

        return zaehler / ggt == zaehlerGekuerzt && nenner / ggt == nennerGekuerzt;
    }

    static int getGGT(int zaehler, int nenner)
    {
        int ggt = 0;
        for (int i = 10; i <= nenner; i++)
        {
            if (zaehler % i == 0 && nenner % i == 0)
                ggt = i;
        }
        return ggt;
    }

}
