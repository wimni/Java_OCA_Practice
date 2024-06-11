package Uebungen._500_590;

import java.util.Date;

public class _590_Tage_Weisensee
{
    public static void main(String[] args)
    {

        /*
         * Tage
         *
         * Berechne wieviele Tage zwischen dem 13.8.1961 und
         * dem 9.11.1989 vergangen sind (jeweils inklusive).
         */
        Date d1 = new Date(1961, 8, 13);
        Date d2 = new Date(1989, 11, 9);
        System.out.println(tageVergangen(d1, d2));
    }

    static int tageVergangen(Date d1, Date d2)
    {
        // Überprüfen ob d2 > d1
        if (d2.getYear() <= d1.getYear())
            if (d2.getMonth() <= d1.getMonth())
                if (d2.getDate() <= d1.getDate())
                {
                    Date dtemp = new Date(d1.getYear(), d1.getMonth(), d1.getDate());
                    d1 = new Date(d2.getYear(), d2.getMonth(), d2.getDate());
                    d2 = new Date(d1.getYear(), d1.getMonth(), d1.getDate());
                }

        int tage = 0;

        // Tage des angefangen Monats
        if (d1.getYear() != d2.getYear())
            if (d1.getMonth() != d2.getMonth())
            {
                tage += getTageDesMonats(d1.getYear(), d1.getMonth()) - d1.getDate() + 1;
                tage += d2.getDate();
            }
        else
            {
                tage += d2.getDate() - d1.getDate() + 1;
            }

        // Tage der restlichen Monate
        if (d1.getYear() != d2.getYear())
        {
            for (int i = d1.getMonth() + 1; i <= 12; i++)
            {
                tage += getTageDesMonats(d1.getYear(), i);
            }
            for (int i = d2.getMonth() - 1; i >= 1; i--)
            {
                tage += getTageDesMonats(d2.getYear(), i);
            }
        }
        else
        {
            for (int i = d1.getMonth() + 1; i < d2.getMonth(); i++)
            {
                tage += getTageDesMonats(d1.getYear(), i);
            }
        }

        //Tage der Jahre
        if (d1.getYear() + 1 != d2.getYear())
        {
            for (int i = d1.getYear() + 1; i < d2.getYear(); i++)
            {
                for (int j = 1; j <= 12; j++)
                {
                    tage += getTageDesMonats(i, j);
                }
            }
        }

        return tage;
    }

    static int getTageDesMonats(int year, int month)
    {
        switch (month)
        {
            case 1, 3, 5, 7, 8, 10, 12:
                return 31;
            case 4, 6, 9, 11:
                return 30;
            case 2:
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
                    return 29;
                else
                    return 28;
        }
        return -1;
    }


}
