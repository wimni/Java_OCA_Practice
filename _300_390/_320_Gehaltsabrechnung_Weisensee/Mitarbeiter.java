package Uebungen._300_390._320_Gehaltsabrechnung_Weisensee;

public class Mitarbeiter
{
    private static int idcounter = 1;

    private int id;
    private String name;

    Mitarbeiter(String name)
    {
        this.id = idcounter++;
        this.name = name;
    }

    public int getIdcounter() { return idcounter; }
    public int getid() { return id; }
    public String getName() {return name; }
    public void setName(String name){ this.name = name; }

    @Override
    public String toString()
    {
        return "ID: " + getid() + "\tName: " + getName() + "\n";
    }

    public boolean istKleiner(Mitarbeiter m)
    {
        for (int i = 0; i < name.length(); i++)
        {
            if (m.getName().length() == i + 1)
                return false;
            if (this.name.charAt(i) > m.getName().charAt(i))
                return true;
            else if (this.name.charAt(i) < m.getName().charAt(i))
                return false;
        }
        return false;
    }
}
