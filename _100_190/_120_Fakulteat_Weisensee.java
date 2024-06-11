package Uebungen._100_190;

public class _120_Fakulteat_Weisensee
{
    public static void main(String[] args)
    {
        /*
         * Fakultät
         *
         * Schreibe ein Programm,
         * das ermittelt, welche Zahl möglichst groß ist
         * ohne dass ihre Fakultät über 1.000.000.000 ist.
         *
         * Gib zum Beweiß auch alle kleineren Fakultäten aus.
         *
         * Hinweis:
         * Fakultät von 5 (Kurzschreibweise: 5!):
         * 1 * 2 * 3 * 4 * 5 = 120
         */

        int fakultaet = 1;
        int counter = 0;
        do
        {
            counter++;
            fakultaet *= counter;
            System.out.print(counter + "! = 1");
            for (int j = 2; j <= counter; j++)
            {
                System.out.print(" * " + j);
            }
            System.out.println(" = " + fakultaet);
        }while(fakultaet < 1000000000);
        counter--;
        System.out.println("größte Fakultät: " + counter + "!");
    }
}
