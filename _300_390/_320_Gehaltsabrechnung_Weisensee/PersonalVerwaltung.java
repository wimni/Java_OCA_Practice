package Uebungen._300_390._320_Gehaltsabrechnung_Weisensee;

import java.util.ArrayList;
import java.util.Collections;

public class PersonalVerwaltung
{
    private static ArrayList<Mitarbeiter> mitarbeiterList = new ArrayList<>();

    public static void addMitarbeiter(String... name)
    {
        for (String value : name)
        {
            Mitarbeiter mb = new Mitarbeiter(value);
            mitarbeiterList.add(mb);
        }
    }

    public static void listMitarbeiter()
    {
        String string = new String();
        for (Mitarbeiter mitarbeiter : mitarbeiterList) {
            string += (mitarbeiter.toString());
        }
        System.out.println(string);
    }

    public static void shuffleMitarbeiterList()
    {
        Collections.shuffle(mitarbeiterList);
    }

    public static void sortMitarbeiter()
    {
        boolean repeat = true;
        Mitarbeiter mtemp;
        Mitarbeiter m1;
        Mitarbeiter m2;
        while (repeat)
        {
            repeat = false;
            for (int i = 0; i < mitarbeiterList.size() - 1; i++)
            {
                m1 = mitarbeiterList.get(i);
                m2 = mitarbeiterList.get(i + 1);
                if (m1.istKleiner(m2))
                {
                    mtemp = m1;
                    mitarbeiterList.set(i, m2);
                    mitarbeiterList.set(i + 1, mtemp);
                    repeat = true;
                }
            }
        }
    }
}
