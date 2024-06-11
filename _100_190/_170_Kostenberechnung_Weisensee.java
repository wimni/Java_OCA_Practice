package Uebungen._100_190;

import java.text.DecimalFormat;

public class _170_Kostenberechnung_Weisensee
{
    public static void main(String[] args)
    {
        /*
         * Kostenberechnung
         *
         * Erstelle eine Methode zur Kostenberechnung.
         * Dieser wird Preis, Anzahl und Währung als Argument übergeben
         * und sie soll daraus die Kosten berechnen und zurück geben.
         * Standardmäßig soll die Anzahl 100 betragen und die Währung Euro sein.
         * Die Rückgabe soll formatiert mit zwei Stellen hinterm Komma erfolgen.
         */
        System.out.println(berechneKosten(20, 20, "$"));  // 400 $
        System.out.println(berechneKosten(20, 50));                // 1000 €
        System.out.println(berechneKosten(20, "$"));             // 2000 $
        System.out.println(berechneKosten(20));                           // 2000 €
    }

    static String berechneKosten(double preis, int anzahl, String waerung)
    {
        DecimalFormat dc = new DecimalFormat("#.00");
        return dc.format(preis * anzahl) + " " + waerung;
    }

    static String berechneKosten(double preis, int anzahl)
    {
        return berechneKosten(preis, anzahl, "€");
    }

    static String berechneKosten(double preis, String waerung)
    {
        return berechneKosten(preis, 100, waerung);
    }

    static String berechneKosten(double preis)
    {
        return berechneKosten(preis, 100, "€");
    }
}
