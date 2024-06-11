package Uebungen._300_390.RoboterEnhanced;

class Node
{
    Roboter unitOnGrid;

    Roboter getUnit()
    {
        return unitOnGrid;
    }

    public boolean setUnit(Roboter roboter)
    {
        this.unitOnGrid = roboter;
        return true;
    }
}

public class Gridmap
{
    private int width;
    private int heigth;

    Node[][] grid;

    public Gridmap(int width, int heigth)
    {
        grid = new Node[width][heigth];
        for (int x = 0; x < width; x++)
        {
            for (int y = 0; y < heigth; y++)
            {
                grid[x][y] = new Node();
            }
        }
        this.width = width;
        this.heigth = heigth;
    }

    public boolean checkPosition(int xpos, int ypos)
    {
        if (xpos < 0 || xpos > this.width - 1 || ypos < 0 || ypos > this.heigth - 1)
        {
            System.out.println(xpos + ":" + ypos + " Out of Bounds");
            return false;
        }
        return true;
    }

    public boolean setUnit(Roboter roboter, int xpos, int ypos)
    {
        if (checkPosition(xpos, ypos))
            return grid[xpos][ypos].setUnit(roboter);
        else
            return false;
    }

    public Roboter getUnit(int xpos, int ypos)
    {
        if (checkPosition(xpos, ypos))
            return grid[xpos][ypos].getUnit();
        else
            return null;
    }

    public void drawGrid()
    {
        System.out.print("╔═");
        for (int i = 0; i < width; i++)
        {
            System.out.print("═══");
        }
        System.out.println("═╗");
        for (int y = 0; y < heigth; y++)
        {
            System.out.print("║ ");
            for (int x = 0; x < width; x++)
            {
                if (getUnit(x, y) != null)
                {
                    if (getUnit(x, y).getName().compareTo("player") == 0)
                        System.out.print(" o ");
                    else if (getUnit(x, y).getName().compareTo("enemy") == 0)
                        System.out.print(" x ");
                }
                else
                    System.out.print("   ");
            }
            System.out.println(" ║");
        }
        System.out.print("╚═");
        for (int i = 0; i < width; i++)
        {
            System.out.print("═══");
        }
        System.out.println("═╝");
    }

    public void removeUnit(int xpos, int ypos)
    {
        this.grid[xpos][ypos].setUnit(null);
    }
}
