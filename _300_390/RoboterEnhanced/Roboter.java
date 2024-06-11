package Uebungen._300_390.RoboterEnhanced;

import Uebungen._300_390.RoboterEnhanced.direction;

public class Roboter
{
    private String name;
    int xpos;
    int ypos;
    private direction direction;

    public Roboter(Gridmap gridmap, String name, int xpos, int ypos, direction direction)
    {
        if (gridmap.setUnit(this, xpos, ypos))
        {
            if (name.length() > 10)
                this.name = name.substring(0, 10);
            else
                this.name = name;
            this.direction = direction;
            this.xpos = xpos;
            this.ypos = ypos;
        }
        else
            System.out.println("Robot could not be initialized");
    }

    public Roboter(Gridmap gridmap, String name)
    {
        this(gridmap, name, 0, 0, Uebungen._300_390.RoboterEnhanced.direction.north);
    }

    public Roboter(Gridmap gridmap, String name, int xpos, int ypos)
    {
        this(gridmap, name, xpos, ypos, Uebungen._300_390.RoboterEnhanced.direction.north);
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name.substring(0, 10);;
    }

    public direction getDirection()
    {
        return direction;
    }

    public void setDirection(direction direction)
    {
        this.direction = direction;
    }

    public int getXpos()
    {
        return xpos;
    }

    public int getYpos()
    {
        return ypos;
    }

    //Methoden

    public void move(Gridmap gridmap, int distance)
    {
        gridmap.removeUnit(xpos, ypos);
        switch (this.direction)
        {
            case direction.east:
                while (distance > 0)
                {
                    if (gridmap.getUnit(xpos + 1, ypos) == null)
                    {
                        if (!gridmap.checkPosition(xpos + 1, ypos))
                            distance = 0;
                        else
                        {
                            this.xpos++;
                            distance--;
                        }
                    }
                }
                break;
            case direction.west:
                while (distance > 0)
                {
                    if (gridmap.getUnit(xpos - 1, ypos) == null)
                    {
                        if (!gridmap.checkPosition(xpos - 1, ypos))
                            distance = 0;
                        else
                        {
                            this.xpos--;
                            distance--;
                        }
                    }
                }
                break;
            case direction.south:
                while (distance > 0)
                {
                    if (gridmap.getUnit(xpos, ypos + 1) == null)
                    {
                        if (!gridmap.checkPosition(ypos + 1, ypos))
                            distance = 0;
                        else
                        {
                            this.ypos++;
                            distance--;
                        }
                    }
                }
                break;
            case direction.north:
                while (distance > 0)
                {
                    if (gridmap.getUnit(xpos, ypos - 1) == null)
                    {
                        if (!gridmap.checkPosition(ypos - 1, ypos))
                            distance = 0;
                        else
                        {
                            this.ypos--;
                            distance--;
                        }
                    }
                }
                break;
        }
        gridmap.setUnit(this, xpos, ypos);
    }
}
