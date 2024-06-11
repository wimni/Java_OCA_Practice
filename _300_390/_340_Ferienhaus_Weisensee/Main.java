package Uebungen._300_390._340_Ferienhaus_Weisensee;

public class Main
{
    public static void main(String[] args)
    {
        Wohnung w1 = new Wohnung("WOHNUNG IN KELLENHUSEN MIT GARTEN & TERRASSE",
                                "Kellenhusen, Schleswig-Holstein", 2, 50);
        Wohnung w2 = new Wohnung("APPARTEMENT IN GRÖMITZ MIT GRILL, GARTEN & TERRASSE",
                                "Grömitz, Schleswig-Holstein", 8);
        Wohnung w3 = new Wohnung("FERIENWOHNUNG URLAUBSLIEBE SCHARBEUTZ",
                                "Scharbeutz, Schleswig-Holstein", 87d);
        System.out.println(w1);

        System.out.println();

        System.out.println(w2);
        w2.setPreis(80);
        System.out.println(w2);

        System.out.println();
        
        System.out.println(w3.getBetten());
        w3.setBetten(4);
        System.out.println(w3.getBetten());
    }
}
