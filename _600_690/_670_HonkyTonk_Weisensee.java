package Uebungen._600_690;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class _670_HonkyTonk_Weisensee
{

    /*
     * Honky-Tonk
     *
     * Simuliere das Spiel Honky-tonk.
     * Bei diesem Spiel bezahlt der Spieler pro Runde einen Euro als Einsatz.
     * Er darf nun drei Würfel werfen.
     * Zeigt mindestens ein Würfel eine sechs,
     * so erhält er schonmal den Einsatz zurück.
     * Zusätzlich erhält er für jede geworfene Sechs einen Euro als Gewinn ausbezahlt.
     * Das heisst, dass er bei drei Sechsen 4 Euro bekommt.
     * Liegt keine Sechs, so verliert er den Einsatz.
     * Starte mit einem Kapital von 300 Euro und simuliere 1000 Runden.
     */

    public static void main(String[] args)
    {
        starteSpiel(300, 1000);
    }

    static void starteSpiel(int kapital, int runden)
    {
        ArrayList<Integer> wuerfel = new ArrayList<>();
        int einzigartigeSechsen = 0;
        int gesamtSechsen = 0;
        for (int i = 0; i < runden; i++)
        {
            kapital--;
            wuerfel.clear();
            wuerfel.add(wuerfeWuerfel());
            wuerfel.add(wuerfeWuerfel());
            wuerfel.add(wuerfeWuerfel());
            for (int j = 0; j < 3; j++)
            {
                if (wuerfel.get(j) == 6)
                {
                    einzigartigeSechsen++;
                    kapital++;
                    break;
                }
            }
            for (int j = 0; j < 3; j++)
            {
                if (wuerfel.get(j) == 6)
                {
                    gesamtSechsen++;
                    kapital++;
                }
            }
        }
        System.out.println("Kapital nach " + runden + " Runden: " + kapital + "\n" +
                            "Runden mit sechsen: " + einzigartigeSechsen + "\n" +
                            "Sechsen gesamt: " + gesamtSechsen);
    }

    private static int wuerfeWuerfel()
    {
        return (int)(Math.random() * 6 + 1);
    }
}
