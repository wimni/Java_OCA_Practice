package Uebungen._600_690._640_PersonStudentTeacher_Weisensee;

public class Teacher extends Person
{
    int salary;

    public Teacher(String name, String addresse, int salary)
    {
        super(name, addresse);
        this.salary = salary;
    }

    public String toString()
    {
        return super.toString() + "\n  salary " + salary + " euro/month ";
    }
}
