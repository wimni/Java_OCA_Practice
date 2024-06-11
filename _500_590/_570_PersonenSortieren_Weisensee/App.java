package Uebungen._500_590._570_PersonenSortieren_Weisensee;

import java.util.ArrayList;
import java.util.Collections;

public class App
{
    public static void main(String[] args)
    {
        ArrayList<Mitarbeiter2> mitarbeiterList = new ArrayList<>();

        Mitarbeiter2 m1 = new Mitarbeiter2("Harald", "Schmidt", 55);
        mitarbeiterList.add(m1);
        Mitarbeiter2 m2 = new Mitarbeiter2("Harald", "Schmiedt", 87);
        mitarbeiterList.add(m2);
        Mitarbeiter2 m3 = new Mitarbeiter2("Stefan", "Schmidt", 46);
        mitarbeiterList.add(m3);
        Mitarbeiter2 m4 = new Mitarbeiter2("Stefan", "Schmidt", 48);
        mitarbeiterList.add(m4);

        Collections.shuffle(mitarbeiterList);
        Collections.sort(mitarbeiterList);
        for (Mitarbeiter2 mitarbeiter : mitarbeiterList)
        {
            System.out.println(mitarbeiter.supertoString());
        }
    }
}
