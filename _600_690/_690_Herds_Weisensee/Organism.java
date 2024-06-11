package Uebungen._600_690._690_Herds_Weisensee;

public class Organism implements Movable
{
    int x;
    int y;

    public Organism(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString()
    {
        return "x: " + x + "; y: " + y;
    }

    public void move(int dx, int dy)
    {
        x += dx;
        y += dy;
    }
}
