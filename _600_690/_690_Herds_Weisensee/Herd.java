package Uebungen._600_690._690_Herds_Weisensee;

import java.util.ArrayList;

public class Herd implements Movable
{
    ArrayList<Organism> herd = new ArrayList<>();

    public String toString()
    {
        String string = "";
        for (int i = 0; i < herd.size(); i++)
        {
            string += herd.get(i).toString() + "\n";
        }
        return string;
    }

    public void addToHerd(Movable movable)
    {
        herd.add((Organism) movable);
    }

    public void move(int dx, int dy)
    {
        for (int i = 0; i < herd.size(); i++)
        {
            herd.get(i).move(dx, dy);
        }
    }
}
