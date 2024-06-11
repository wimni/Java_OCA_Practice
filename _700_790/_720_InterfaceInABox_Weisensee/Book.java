package Uebungen._700_790._720_InterfaceInABox_Weisensee;

public class Book implements Packable
{
    private String author;
    private String name;
    private Double weight;

    Book(String author, String name, Number weight)
    {
        this.author = author;
        this.name = name;
        this.weight = Double.valueOf(String.valueOf(weight));
    }

    @Override
    public double weight()
    {
        return weight;
    }

    @Override
    public String toString()
    {
        return author + ": " + name;
    }

}
