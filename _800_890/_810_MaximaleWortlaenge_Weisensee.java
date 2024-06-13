package Uebungen._800_890;

public class _810_MaximaleWortlaenge_Weisensee
{
    public static void main(String[] args)
    {

        /*
         * Maximale Wortlänge ermitteln
         *
         * Ermittel die maximale Wortlänge in einem String.
         * Gib auch das Wort dazu mit aus.
         */

        String s = "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor" +
                " invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et" +
                " accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata" +
                " sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing" +
                " elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat," +
                " sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd" +
                " gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet.";

        getMaximaleWortlaenge(s);
    }

    private static void getMaximaleWortlaenge(String s)
    {
        int laenge = 0;
        String wort = "";
        int lastWhitespace = 0;
        int currentWhitespace = 0;
        for (; currentWhitespace < s.length(); currentWhitespace++)
        {
            if (s.charAt(currentWhitespace) == ' ' || s.charAt(currentWhitespace) == '.' || s.charAt(currentWhitespace) == ',')
            {
                if (currentWhitespace - lastWhitespace - 1 > laenge)
                {
                    wort = s.substring(lastWhitespace + 1, currentWhitespace);
                    laenge = wort.length();
                    lastWhitespace = currentWhitespace;
                }
                else
                    lastWhitespace = currentWhitespace;
            }
        }
        System.out.println(laenge + "\n" + wort);
    }
}
