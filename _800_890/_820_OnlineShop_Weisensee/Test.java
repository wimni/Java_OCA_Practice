package Uebungen._800_890._820_OnlineShop_Weisensee;

import java.util.Scanner;

public class Test
{
    public static void main(String[] args)
    {
        // Part 1 Warehouse
        System.out.println("Part 1 Warehouse");

        Warehouse warehouse1 = new Warehouse();
        warehouse1.addProduct("milk", 3, 10);
        warehouse1.addProduct("coffee", 5, 7);

        System.out.println("prices:");
        System.out.println("milk: " + warehouse1.price("milk"));
        System.out.println("coffee: " + warehouse1.price("coffee"));
        System.out.println("sugar: " + warehouse1.price("sugar"));

        // Part 2: Products stock balance
        System.out.println("\nPart 2: Products stock balance");
         Warehouse warehouse2 = new Warehouse();
         warehouse2.addProduct("coffee", 5, 1);

         System.out.println("stock:");
         System.out.println("coffee:  " + warehouse2.stock("coffee"));
         System.out.println("sugar: " + warehouse2.stock("sugar"));

         System.out.println("taking coffee " + warehouse2.take("coffee"));
         System.out.println("taking coffee " + warehouse2.take("coffee"));
         System.out.println("taking sugar " + warehouse2.take("sugar"));

         System.out.println("stock:");
         System.out.println("coffee:  " + warehouse2.stock("coffee"));
         System.out.println("sugar: " + warehouse2.stock("sugar"));

         // Part 3: Listing the products
        System.out.println("\nPart 3: Listing the products");
         Warehouse warehouse3 = new Warehouse();
         warehouse3.addProduct("milk", 3, 10);
         warehouse3.addProduct("coffee", 5, 6);
         warehouse3.addProduct("buttermilk", 2, 20);
         warehouse3.addProduct("yogurt", 2, 20);

         System.out.println("products:");

         for (String product: warehouse3.products()) {
             System.out.println(product);
         }

         // Part 4: Item
        System.out.println("\nPart 4: Item");
         Item item = new Item("milk", 4, 2);
         System.out.println("an item that contains 4 milks has the total price of " + item.price());
         System.out.println(item);
         item.increaseQuantity();
         System.out.println(item);

         // Part 5: Shopping cart
        System.out.println("\nPart 5: Shopping cart");
         ShoppingCart cart1 = new ShoppingCart();
         cart1.add("milk", 3);
         cart1.add("buttermilk", 2);
         cart1.add("cheese", 5);
         System.out.println("cart price: " + cart1.price());
         cart1.add("computer", 899);
         System.out.println("cart price: " + cart1.price());

         // Part 6: Printing the cart
        System.out.println("\nPart 6: Printing the cart");
        cart1.print();

        // Part 7: One item per product
        System.out.println("\nPart 7: One item per product");
         ShoppingCart cart2 = new ShoppingCart();
         cart2.add("milk", 3);
         cart2.print();
         System.out.println("cart price: " + cart2.price() + "\n");

         cart2.add("buttermilk", 2);
         cart2.print();
         System.out.println("cart price: " + cart2.price() + "\n");

         cart2.add("milk", 3);
         cart2.print();
         System.out.println("cart price: " + cart2.price() + "\n");

         cart2.add("milk", 3);
         cart2.print();
         System.out.println("cart price: " + cart2.price() + "\n");

         // Part 8: Store
        System.out.println("\nPart 8: Store");
         Warehouse warehouse4 = new Warehouse();
         warehouse4.addProduct("coffee", 5, 10);
         warehouse4.addProduct("milk", 3, 20);
         warehouse4.addProduct("cream", 2, 55);
         warehouse4.addProduct("bread", 7, 8);

         Scanner scanner = new Scanner(System.in);

         Store store = new Store(warehouse4, scanner);
         store.shop("John");
    }
}
