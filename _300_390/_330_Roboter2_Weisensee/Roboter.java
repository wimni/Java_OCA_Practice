package Uebungen._300_390._330_Roboter2_Weisensee;

import Uebungen._300_390._330_Roboter2_Weisensee.direction;

public class Roboter
{
    private String name;
    private int xpos;
    private int ypos;
    private direction direction;

    public Roboter(String name, int xpos, int ypos, direction direction)
    {
        if (name.length() > 10)
            this.name = name.substring(0, 10);
        else
            this.name = name;
        this.xpos = xpos;
        this.ypos = ypos;
        this.direction = direction;
    }

    public Roboter(String name)
    {
        this(name, 0, 0, Uebungen._300_390._330_Roboter2_Weisensee.direction.north);
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name.substring(0, 10);;
    }

    public int[] getPos()
    {
        return new int[]{xpos, ypos};
    }

    public void setXpos(int xpos)
    {
        this.xpos = xpos;
    }

    public void setYpos(int ypos)
    {
        this.ypos = ypos;
    }

    public direction getDirection()
    {
        return direction;
    }

    public void setDirection(direction direction)
    {
        this.direction = direction;
    }

    //Methoden

    public void move(int distance)
    {
        switch (this.direction)
        {
            case direction.north:
                this.xpos += distance;
                break;
            case direction.south:
                this.xpos -= distance;
                break;
            case direction.east:
                this.ypos += distance;
                break;
            case direction.west:
                this.ypos -= distance;
                break;
        }
    }

    public void outPos()
    {
        System.out.println(this.xpos + ":" + this.ypos);
    }
}
