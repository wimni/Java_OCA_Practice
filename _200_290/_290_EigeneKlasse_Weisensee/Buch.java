package Uebungen._200_290._290_EigeneKlasse_Weisensee;

import java.util.ArrayList;

public class Buch
{
    private static int counter;
    private static ArrayList<String> buecherList = new ArrayList<>();

    private String titel;
    private String verlag;
    private String isbn;
    private String[] autoren;

    //Konstruktoren
    Buch(String titel, String verlag, String isbn, String... autoren)
    {
        this.titel = titel;
        this.verlag = verlag;
        this.isbn = isbn;
        this.autoren = autoren;
        counter++;
        buecherList.add(titel);
    }

    Buch(String titel, String verlag, String isbn)
    {
        this(titel, verlag, isbn, "unbekannt");
    }

    //Getter + Setter
    public int getCounter()
    {
        return counter;
    }

    public String getTitel()
    {
        return titel;
    }

    public void setTitel(String titel)
    {
        this.titel = titel;
        buecherList.remove(this.titel);
        buecherList.add(titel);
    }

    public String getVerlag()
    {
        return verlag;
    }

    public void setVerlag(String Verlag)
    {
        this.verlag = verlag;
    }

    public String getIsbn()
    {
        return isbn;
    }

    public void setIsbn(String isbn)
    {
        this.isbn = isbn;
    }

    public StringBuilder getAutoren()
    {
        StringBuilder autoren = new StringBuilder();
        autoren.append(this.autoren[0]);
        for (int i = 1; i < this.autoren.length; i++)
        {
            autoren.append(", ").append(this.autoren[i]);
        }
        return autoren;
    }

    public void setAutoren(String[] autoren)
    {
        this.autoren = autoren;
    }

    @Override
    public String toString()
    {
        String string = (
                "Das Buch " +
                getTitel());
                if (autoren.length > 1)
                    string += (" wurde von den Autoren: ");
                else
                    string += (" wurde vom Autor ");
        string += (
                getAutoren() +
                " geschrieben und vom " +
                getVerlag() +
                " Verlag veröffentlicht.\nDie ISBN lautet: " +
                getIsbn() + "."
        );
        return string;
    }

    public String buecherListtoString()
    {
        String string = (buecherList.get(0));
        for (int i = 1; i < buecherList.size(); i++)
        {
            string += ("\n" + buecherList.get(i));
        }
        return string;
    }
}
