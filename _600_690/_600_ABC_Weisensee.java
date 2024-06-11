package Uebungen._600_690;

/*
 * ABC
 *
 * Part 1: Creating classes
 *
 * Create the following three classes:
 *
 * Class A. Class should have no object variables nor should you specify a constructor for it.
 * It only has the method public void a(), which prints a string "A".
 * Class B. Class should have no object variables nor should you specify a constructor for it.
 * It only has the method public void b(), which prints a string "B".
 * Class C. Class should have no object variables nor should you specify a constructor for it.
 * It only has the method public void c(), which prints a string "C".
 */
// A a = new A();
// B b = new B();
// C c = new C();
//
// a.a();
// b.b();
// c.c();
/*
 * Sample output:
 * A
 * B
 * C
 *
 *
 * Part 2: Class inheritance
 *
 * Modify the classes so that class B inherits class A, and class C inherits class B.
 * In other words, class A will be a superclass for class B, and class B will be a superclass for class C.
 */
// C c = new C();
//
// c.a();
// c.b();
// c.c();
/*
 * Sample output:
 * A
 * B
 * C
 */

class A
{
    public void a()
    {
        System.out.println("A");
    }
}

class B extends A
{
    public void b()
    {
        System.out.println("B");
    }
}

class C extends B
{
    public void c()
    {
        System.out.println("C");
    }
}

public class _600_ABC_Weisensee
{
    public static void main(String[] args)
    {
//         A a = new A();
//         B b = new B();
//         C c = new C();
//
//         a.a();
//         b.b();
//         c.c();

         C c = new C();

         c.a();
         c.b();
         c.c();
    }
}
