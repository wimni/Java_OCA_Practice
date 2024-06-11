package Uebungen._600_690._640_PersonStudentTeacher_Weisensee;

import java.util.ArrayList;

public class Test
{
    public static void main(String[] args)
    {
        // Part 1
        System.out.println("Part 1");
         Person ada = new Person("Ada Lovelace", "24 Maddox St. London W1S 2QN");
         Person esko = new Person("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki");
         System.out.println(ada);
         System.out.println(esko);

         // Part 2
        System.out.println("\nPart 2");
         Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
         System.out.println(ollie);
         System.out.println("Study credits " + ollie.credits());
         ollie.study();
         System.out.println("Study credits "+ ollie.credits());

         // Part 3
        System.out.println("\nPart 3");
         ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
         System.out.println(ollie);
         ollie.study();
         System.out.println(ollie);

         // Part 4
        System.out.println("\nPart 4");
         Teacher ada2 = new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200);
         Teacher esko2 = new Teacher("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki", 5400);
         System.out.println(ada2);
         System.out.println(esko2);

         ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");

         int i = 0;
         while (i < 25) {
           ollie.study();
           i = i + 1;
         }
         System.out.println(ollie);

         // Part 5
        System.out.println("\nPart 5");
         ArrayList<Person> persons = new ArrayList<Person>();
         persons.add(new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200));
         persons.add(new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028"));

         printPersons(persons);
    }

    public static void printPersons(ArrayList<Person> persons)
    {
        for (Person p : persons)
        {
            System.out.println(p);
        }
    }
}
