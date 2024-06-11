package Uebungen._700_790;

import java.util.ArrayList;

public class _740_Seitenzahlen_Weisensee
{

    /*
     * Seitenzahlen
     *
     * Ein Schriftsetzer musste bei einem Buch die Seitenzahlen mit Lettern drucken.
     * Lettern sind spiegelverkehrte Schriftzeichen,
     * die heute nur noch selten für den Buchdruck verwendet werden.
     * Dafür musste unser Schriftsetzer wissen,
     * wie viele solcher Lettern er für die Seitennummerierung benötigt.
     * Seitennummerierungen bestehen ausschließlich aus den Ziffern 0 bis 9.
     * In dieser Aufgabe werden Lettern und Ziffern synonym verwendet.
     * Ab Seite 5 waren die Seiten nummeriert.
     * Die Seite 10 benötigt als Erste zwei Ziffern (nämlich die Ziffer "1" und die Ziffer "0").
     * Die Lettern konnten für verschiedene Seiten nicht wiederverwendet werden,
     * da alle Seiten gleichzeitig für den Druck bereitstehen mussten.
     *
     * Schreibe ein Programm,
     * das für eine gegebene Anzahl Seiten die benötigten Anzahlen für jede Ziffer ausgibt.
     * Da die Nummerierung erst bei 5 beginnt,
     * hatte ein Buch mit 4 Seiten noch keine Ziffern.
     * Ein Buch mit 11 Seiten benötigte bereits die Ziffern
     * 5 (1x), 6 (1x), 7 (1x), 8 (1x), 9 (1x), 1 (3x) und 0 (1x).
     *
     * Zur Programmierung verwende eine ArrayList von [0] bis [9] (also mit 10 Einträgen),
     * worin je die Anzahl der benötigten Ziffern steht.
     *
     * 42 -> [0(4x), 1(14x), 2(14x), 3(13x), 4(6x), 5(4x), 6(4x), 7(4x), 8(4x), 9(4x)]
     */

    public static void main(String[] args)
    {
        getLettern(11);
        getLettern(42);
    }

    private static ArrayList<Integer> getLettern(int anzahl)
    {
        ArrayList<Integer> lettern = new ArrayList<>();

        for (int i = 0; i < 10; i++)
        {
            lettern.add(0);
        }

        for (int i = 5; i < 10; i++)
        {
            lettern.set(i, lettern.get(i) + 1);
        }

        for (int i = 10; i <= anzahl; i++)
        {
            lettern.set(i / 10, lettern.get(i / 10) + 1);
            lettern.set(i % 10, lettern.get(i % 10) + 1);
        }

        outputLettern(lettern, anzahl);
        return lettern;
    }

    private static void outputLettern(ArrayList<Integer> lettern, int anzahl)
    {

        System.out.print(anzahl + " -> [");

        for (int i = 0; i < lettern.size(); i++)
        {
            System.out.print(i + "(" + lettern.get(i) + "x)");
            if (i < lettern.size() - 1)
                System.out.print(", ");
        }
        System.out.println("]");
    }

}
