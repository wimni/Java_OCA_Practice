package Uebungen._600_690._640_PersonStudentTeacher_Weisensee;

public class Student extends Person
{
    int credit;

    public Student(String name, String addresse)
    {
        super(name, addresse);
        credit = 0;
    }

    public String credits()
    {
        return Integer.toString(credit);
    }

    public void study()
    {
        credit++;
    }

    public String toString()
    {
        return super.toString() + "\n  Study credits " + credit;
    }
}
