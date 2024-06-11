package Uebungen._300_390;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class _360_ScheineUndMuenzen_Weisensee
{
    public static void main(String[] args)
    {

                /*
        * Scheine und Münzen
        *
        * Gebe von einem Geldbetrag (in Euro und Cent) die nötigen
        * Scheine und Münzen aus.
        *
        * In Euro existieren die folgenden Beträge:
        + Münzen (in Cent): 1, 2, 5, 10, 20, 50
        * Münzen und Noten (in Euro): 1, 2, 5, 10, 20, 50, 100, 200, 500
        *
        * Beispiele:
        * System.out.println(betraege(53.28)); // 50.00, 2.00, 1.00, 0.20, 0.05, 0.02, 0.01
        * System.out.println(betraege(99.95)); // 50.00, 20.00, 20.00, 5.00,
        * 									   // 2.00, 2.00, 0.50, 0.20, 0.20, 0.05
        */

        betraege(53.28);
        betraege(99.95);

    }

    private static void betraege(double v)
    {
        double[] werte = new double[] {500, 200, 100, 50, 20, 10, 5, 2, 1, 0.5, 0.2, 0.1, 0.05, 0.02, 0.01};
        DecimalFormatSymbols seperator = new DecimalFormatSymbols();
        seperator.setDecimalSeparator('.');
        DecimalFormat df = new DecimalFormat("#0.00", seperator);

        for (int i = 0; i < werte.length;)
        {
            if (Math.round((v - werte[i]) * 100) > 0)
            {
                v -= werte[i];
                System.out.print(df.format(werte[i]) + ", ");
            }
            else if (Math.round((v - werte[i]) * 100) == 0)
            {
                v -= werte[i];
                System.out.println(df.format(werte[i]));
            }
            else
                i++;
        }
    }
}
