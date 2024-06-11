package Uebungen._600_690._640_PersonStudentTeacher_Weisensee;

public class Person
{
    String name;
    String adresse;

    public Person(String name, String addresse)
    {
        this.name = name;
        this.adresse = addresse;
    }

    @Override
    public String toString() {
        return name + "\n  " + adresse;
    }
}
