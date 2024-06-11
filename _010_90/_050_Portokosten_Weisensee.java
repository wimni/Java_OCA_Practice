package Uebungen._010_90;

import java.util.Random;

public class _050_Portokosten_Weisensee
{
    public static void main(String[] args)
    {
        /*
         * Portokosten
         *
         * Die Portokosten sind wie folgt festgelegt:
         *  0 - 39.99€ Bestellwert kosten 3.99€ Porto
         * 40 - 69.99€ Bestellwert kosten 2.99€ Porto
         * 70 - 99.99€ Bestellwert kosten 1.99€ Porto
         * ab 100€ ist portofrei
         *
         * Es soll eine Zufallszahl (bestellwert)
         * von 0.01 - 130.00 erzeugt werden (z.B. 40.47, 123.78)
         * Dann soll ermittelt werden,
         * wie hoch die entsprechenden Portokosten sind.
         * Am Ende sollen der Bestellwert,
         * die Portokosten und der Gesamtbetrag
         * ausgegeben werden:
         * "Bei einem Bestellwert von 67,54 € betragen die
         *  Portokosten 2,99 €. Der Gesamtbetrag beträgt somit 70,53 €."
         */

        Random r = new Random();
        double bestellwert;

        bestellwert = (double)(r.nextInt(12999) + 1) / 100;

        if (bestellwert <= 39.99)
            ausgabe (3.99, bestellwert);
        else if (bestellwert <= 69.99)
            ausgabe (2.99, bestellwert);
        else if (bestellwert <= 99.99)
            ausgabe (1.99, bestellwert);
        else
            ausgabe ( 0, bestellwert);
    }

    private static void ausgabe(double porto, double bestellwert)
    {
        System.out.printf("Bei einem Bestellwert von " + bestellwert + " € betragen die\n" +
                            "Portokosten " + porto + " €. Der Gesamtbetrag beträgt somit %.2f €.", (bestellwert + porto));
    }
}
