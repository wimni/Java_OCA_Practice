package Uebungen._300_390;

public class _390_Frosch_Weisensee
{
    public static void main(String[] args)
    {

        /*
         *  Frosch
         *
         *  In dieser Aufgabe lernen wir einen besonderen Frosch kennen,
         *  so wie ihn sich nur Mathematiker ausdenken können.
         *  Besonders seine Art, eine Straße zu überqueren, macht es zweifelhaft,
         *  ob er in der realen Welt lange überleben könnte.
         *  Er überquert eine 2,50 Meter breite Straße wie folgt:
         *  Mit dem ersten Sprung legt er
         *  die erstaunliche Distanz von einem Meter zurück,
         *  dann springt er wegen zunehmender Erschöpfung mit jedem weiteren Schritt
         *  immer nur noch halb so weit wie vorher.
         *  Die Entfernung, die er dabei zurücklegt,
         *  berechnet sich also als Summe der Werte
         *  1 + 0,5 + 0,25 + 0,125 und so weiter.
         *
         *  Versuche, mittels eines Programms herauszubekommen, ob der Frosch
         *  es auf die andere Straßenseite schafft.
         *
         * 	Zusatz:
         * 	Was ist der niedrigste Startwert des Frosches,
         * 	um die 2,5 Meter zu schaffen?
         *
         * 	Zusatz 2:
         * 	Ermittle, wie oft der Frosch springen muss um 1,99 Meter zu erreichen.
         *  Einmal per while und einmal durch eine rekursive Funktion.
         */

        System.out.println(springFrosch(0, 2.5));
        System.out.printf("niedrigster Startwert: %.2f\n", startDistanz(0, 2.5));
        System.out.println(springFroschWhile(1.99)); // wird nicht ausgegeben
        System.out.println(springFroschRekursiv(1.99));
    }

    private static boolean springFrosch(double startwert, double breite)
    {
        double sprungweite = 1;
        double distanz = startwert;
        for (int i = 0; i < 10; i++)
        {
            if (distanz < breite)
            {
                distanz += sprungweite;
                sprungweite /= 2;
            }
            else
                return true;
        }
        System.out.printf("Zurückgelegte Distanz nach 10 Sprüngen: %.5f meter.\n" +
                        "Sprungweite nach 10 Sprüngen: %.10f meter\n", distanz, sprungweite);
        return false;
    }

    private static double startDistanz(double startwert, double breite)
    {
        if (springFrosch2(startwert, breite)) return startwert;
        return startDistanz(startwert + 0.01, breite);
    }

    private static boolean springFrosch2(double startwert, double breite)
    {
        double sprungweite = 1;
        double distanz = startwert;
        for (int i = 0; i < 10; i++)
        {
            if (distanz < breite)
            {
                distanz += sprungweite;
                sprungweite /= 2;
            }
            else
                return true;
        }
        return false;
    }

    private static int springFroschWhile(double breite)
    {
        double sprungweite = 1;
        double distanz = 0;
        int anzahl = 0;

        while (distanz < breite)
        {
            distanz += sprungweite;
            sprungweite /= 2;
            anzahl++;
        }
        return anzahl;
    }

    private static int springFroschRekursiv(double breite)
    {
        return sprung(0, breite, 1, 0);
    }

    private static int sprung(double distanz, double breite, double sprungweite, int spruenge)
    {
        if (distanz > breite) return spruenge;
        return sprung(distanz + sprungweite, breite, sprungweite / 2, ++spruenge);
    }
}
