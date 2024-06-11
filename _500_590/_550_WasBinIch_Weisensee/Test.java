package Uebungen._500_590._550_WasBinIch_Weisensee;

import java.util.ArrayList;

public class Test
{
    public static void main(String[] args)
    {
        Rakete r1 = new Rakete();
        Heissluftballon h1 = new Heissluftballon();
        Segelflugzeug s1 = new Segelflugzeug();

        ArrayList<Luftfahrzeug> luftfahrzeuge = new ArrayList<>();
        luftfahrzeuge.add(r1);
        luftfahrzeuge.add(h1);
        luftfahrzeuge.add(s1);

        for (int i = 0; i < luftfahrzeuge.size(); i++)
        {
            luftfahrzeuge.get(i).wasBinIch();
        }
    }
}
