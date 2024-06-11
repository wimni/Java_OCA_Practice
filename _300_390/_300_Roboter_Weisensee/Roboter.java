package Uebungen._300_390._300_Roboter_Weisensee;

public class Roboter
{
    private String name;

    public Roboter(String name)
    {
        if (name.compareTo("Bernd") == 0)
            this.name = "Herbert";
        else
            this.name = name;
    }

    public String getName() { return name; }

    public void setName(String name)
    {
        if (name.compareTo("Bernd") == 0)
            this.name = "Herbert";
        else
            this.name = name;
    }
}
