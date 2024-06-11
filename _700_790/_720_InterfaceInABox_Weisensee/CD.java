package Uebungen._700_790._720_InterfaceInABox_Weisensee;

public class CD implements Packable
{
    private String artist;
    private String name;
    private int publicationYear;
    private final Double weight = 0.1;

    CD(String artist, String name, int year)
    {
        this.artist = artist;
        this.name = name;
        this.publicationYear = year;
    }

    @Override
    public double weight()
    {
        return weight;
    }

    @Override
    public String toString()
    {
        return artist + ": " + name + " (" + publicationYear + ")";
    }
}
