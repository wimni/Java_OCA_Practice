package Uebungen._300_390;

public class _370_HohlesRechteck_Weisensee
{
    public static void main(String[] args)
    {

        // Hohles Rechteck

        // Schreibe eine Methode, die ein hohles Rechteck als String zurück gibt.

        // System.out.println(hohlesRechteck(5, 20, '*'));
        // ********************
        // *                  *
        // *                  *
        // *                  *
        // ********************

        System.out.println(hohlesRechteck(5, 20, '*'));
    }

    static String hohlesRechteck(int hoehe, int breite, char zeichen)
    {
        return linie(breite, zeichen) + "\n" + rechteck(hoehe - 1, breite, zeichen) + linie(breite, zeichen);
    }

    static String rechteck(int hoehe, int breite, char zeichen)
    {
        if (hoehe <= 1) return "";
        return zeichen + hohl(breite - 1) + zeichen + "\n" + rechteck(hoehe - 1, breite, zeichen);
    }

    static String hohl (int breite)
    {
        if (breite == 1) return "";
        return " " + hohl(breite - 1);
    }

    static String linie (int breite, char zeichen)
    {
        if (breite == 0)return "";
        return zeichen + linie(breite - 1, zeichen);
    }
}
