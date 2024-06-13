package Uebungen._700_790._760_PersonIllegal_Weisensee;

class IllegalArgumentException extends Exception
{
    IllegalArgumentException()
    {
        super();
    }
}

public class Person
{
    int alter;

    Person(int alter)
    {
        try
        {
            if (alter < 0 || alter >= 120) { throw new IllegalArgumentException(); }
            else { this.alter = alter; }
        }
        catch (IllegalArgumentException iae)
        {
            System.out.println("Age " + alter + " is not in Range of 0 - 120!");
        }
    }
}
