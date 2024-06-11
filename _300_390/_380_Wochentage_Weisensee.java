package Uebungen._300_390;

import java.time.DayOfWeek;

public class _380_Wochentage_Weisensee
{
    public static void main(String[] args)
    {

        // Wochentage

        // Schreibe eine Methode, der man ein Array mit Wochentag-Objekten übergeben kann
        // und die überprüft, ob dieses Array alle Wochentage
        // in der richtigen Reihenfolge beinhaltet.

        DayOfWeek[] week1 = new DayOfWeek[]{DayOfWeek.MONDAY, DayOfWeek.TUESDAY, DayOfWeek.WEDNESDAY, DayOfWeek.THURSDAY,
                                        DayOfWeek.FRIDAY, DayOfWeek.SATURDAY, DayOfWeek.SUNDAY};
        System.out.println(istWoche(week1));

        DayOfWeek[] week2 = new DayOfWeek[]{DayOfWeek.MONDAY, DayOfWeek.TUESDAY, DayOfWeek.WEDNESDAY, DayOfWeek.THURSDAY,
                                        DayOfWeek.FRIDAY, DayOfWeek.SATURDAY};
        System.out.println(istWoche(week2));
    }

    static boolean istWoche(DayOfWeek... week)
    {
        if (week.length == 7)
        {
            for (int i = 0; i < 7; i++) {
                if (week[i] != DayOfWeek.values()[i])
                    return false;
            }
            return true;
        }
        return false;
    }
}
