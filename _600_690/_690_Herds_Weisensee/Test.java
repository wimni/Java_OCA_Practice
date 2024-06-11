package Uebungen._600_690._690_Herds_Weisensee;

public class Test
{
    public static void main(String[] args)
    {
        //Part 1
        System.out.println("Part 1");
        Organism organism = new Organism(20, 30);
        System.out.println(organism);
        organism.move(-10, 5);
        System.out.println(organism);
        organism.move(50, 20);
        System.out.println(organism);

        // Part 2
        System.out.println("\nPart 2");
        Herd herd = new Herd();
        herd.addToHerd(new Organism(57, 66));
        herd.addToHerd(new Organism(73, 56));
        herd.addToHerd(new Organism(46, 52));
        herd.addToHerd(new Organism(19, 107));
        System.out.println(herd);
        herd.move(100, 200);
        System.out.println(herd);
    }
}
