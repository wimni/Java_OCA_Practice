package Uebungen._400_490;

public class _410_Sternenmuster_Weisensee
{
    public static void main(String[] args)
    {
                /*
        * Sternenmuster
        *
        * Schreibe ein Programm,
        * das folgende Sternchen-Muster in der Konsole ausgibt:
        *
        * Zusatz:
        * Schreibe alternative Lösungen per Rekursion.

        * * * *
        * * * *
        * * * *

        *
        * *
        * * *
        * * * *
        * * * * *

            *
          * * *
        * * * * *
      * * * * * * *

        */

        System.out.println(muster1(4, 3, '*'));
        System.out.println(muster2(1, 5, '*'));
        System.out.println(muster3(1, 4, '*'));
    }

    private static String muster1(int breite, int hoehe, char zeichen)
    {
        if (hoehe == 0) return "";
        return linie(breite, zeichen) + "\n" + muster1(breite, hoehe - 1, zeichen);
    }

    private static String muster2(int startbreite, int zielbreite, char zeichen)
    {
        if (startbreite == zielbreite + 1) return "";
        return linie(startbreite, zeichen) + "\n" + muster2(startbreite + 1, zielbreite, zeichen);
    }

    private static String muster3(int startbreite, int hoehe, char zeichen)
    {
        if (hoehe == 0) return "";
        return linieLeer(hoehe - 1) + linie(startbreite, zeichen) + linieLeer(hoehe - 1) +
                "\n" + muster3(startbreite + 2, hoehe - 1, zeichen);
    }

    private static String linie(int breite, char zeichen)
    {
        if (breite == 0) return "";
        return zeichen + " " + linie(breite - 1, zeichen);
    }

    private static String linieLeer(int breite)
    {
        if (breite == 0) return "";
        return "  " + linieLeer(breite - 1);
    }
}
