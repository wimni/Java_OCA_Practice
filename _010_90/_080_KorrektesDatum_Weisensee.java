package Uebungen._010_90;

class Date
{
    int year;
    int month;
    int day;

    Date(int year, int month, int day)
    {
        this.year = year;
        this.month = month;
        this.day = day;
    }
}

public class _080_KorrektesDatum_Weisensee
{
    static boolean datok;

    public static void main(String[] args)
    {
        /*
         * Korrektes Datum
         *
         * Die Meyer GmbH benötigt ein Modul,
         * das ein Datum auf Korrektheit prüft.
         * Ist das zu prüfende Datum korrekt,
         * so ist die Variable datok auf 1, andernfalls auf 0
         * zu setzen.
         *
         * Beispiele:
         *
         * 29.02.1999 - datok: 0
         * 29.02.2000 - datok: 1
         * 13.05.2000 - datok: 1
         * 32.05.2000 - datok: 0
         * 24.13.2000 - datok: 0
         *
         * Für die Jahre gilt: jahr > 1900 && jahr < 2100
         */

        Date date1 = new Date(1999, 2, 29);
        Date date2 = new Date(2000, 2, 29);
        Date date3 = new Date(2000, 5, 13);
        Date date4 = new Date(2000, 5, 32);
        Date date5 = new Date(2000, 13, 24);

        pruefeDatum(date1);
        pruefeDatum(date2);
        pruefeDatum(date3);
        pruefeDatum(date4);
        pruefeDatum(date5);
    }

    private static void pruefeDatum(Date date)
    {
        datok = false;
        if (date.year > 1900 && date.year < 2100)
        {
            switch(date.month)
            {
                case 1, 3, 5, 7, 8, 10, 12:
                    if (date.day > 0 && date.day <= 31)
                        datok = true;
                    break;
                case 4, 6, 9, 11:
                    if (date.day > 0 && date.day <= 30)
                        datok = true;
                    break;
                case 2:
                    if (date.day > 0 && date.day <= 28)
                        datok = true;
                    else if(isSchaltjahr(date.year) && date.day > 0 && date.day <= 29)
                        datok = true;
                    break;
            }
        }
        System.out.print(date.day + "." + date.month + "." + date.year + " - datok: ");
        if (datok)
            System.out.println("1");
        else
            System.out.println("0");
    }

    private static boolean isSchaltjahr(int year)
    {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
}
