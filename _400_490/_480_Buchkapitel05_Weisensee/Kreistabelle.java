package Uebungen._400_490._480_Buchkapitel05_Weisensee;

import java.text.DecimalFormat;

public class Kreistabelle
{
    public static void tabelleAusgeben(double r)
    {
        Kreis kreis = new Kreis();
        DecimalFormat dc =  new DecimalFormat("#.00000000000000");
        System.out.println("Kreis \tUmfang\t\t\tFläche");
        for (int i = 1; i <= 30; i++)
        {
            kreis.setRadius(r * i);
            System.out.print(kreis.getRadius() + "\t");
            if (r * i < 10)
                System.out.print("\t");
            System.out.println(dc.format(kreis.getUmfang()) + "\t\t" + dc.format(kreis.getFlaeche()));
        }
    }
}
