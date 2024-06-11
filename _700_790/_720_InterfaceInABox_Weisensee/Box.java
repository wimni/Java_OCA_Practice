package Uebungen._700_790._720_InterfaceInABox_Weisensee;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Box implements Packable
{
    private Double maxWeight;
    ArrayList<Packable> packables;

    Box(Number maxWeight)
    {
        this.maxWeight = Double.valueOf(String.valueOf(maxWeight));
        packables = new ArrayList<>();
    }

    public void add(Packable pck)
    {
        if (weight() + pck.weight() < maxWeight)
        {
            packables.add(pck);
        }
    }

    public double weight() {
        double weight = 0;
        for (int i = 0; i < packables.size(); i++)
        {
            weight += packables.get(i).weight();
        }
        return weight;
    }

    @Override
    public String toString()
    {
            return "Box: " + packables.size() + " items, total weight " + weight() + " kg";
    }
}
