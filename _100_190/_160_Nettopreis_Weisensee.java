package Uebungen._100_190;

public class _160_Nettopreis_Weisensee
{
    public static void main(String[] args)
    {
        /*
         * Nettopreis
         *
         * Schreibe Methoden zum Berechnen des Nettopreises.
         * Den Methoden soll der Bruttopreis übergeben werden
         * und sie sollen den Nettopreis zurück geben.
         * Der Mehrwertsteuersatz soll als zweiter Parameter
         * übergeben werden können.
         * Der Standardwert des Mehrwertsteuersatzes soll 19 sein.
         * Der Algorithmus zum Berechnen des Nettopreises soll nur in einer Methode vorkommen.
         */

        System.out.println(berechneNettoPreis(116, 16));  // 100.0
        System.out.println(berechneNettoPreis(119));      // 100.0
    }

    static double berechneNettoPreis(double preis, int prozent)
    {
        return preis * 100 / (100 + prozent);
    }

    static double berechneNettoPreis(double preis)
    {
        return berechneNettoPreis(preis, 19);
    }
}
