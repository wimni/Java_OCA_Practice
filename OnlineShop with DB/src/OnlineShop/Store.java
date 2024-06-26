package OnlineShop;

import java.util.Scanner;

public class Store
{
     private Warehouse warehouse;
     private Scanner scanner;

     public Store(Warehouse warehouse, Scanner scanner)
     {
         this.warehouse = warehouse;
         this.scanner = scanner;
     }

     // the method that handles the customers visit to the store.
     public void shop(String customer)
     {
         ShoppingCart cart = new ShoppingCart();
         System.out.println("Welcome to the store " + customer);

         while (true)
         {
             System.out.println("our selection:");

             for (String product : this.warehouse.products())
             {
                 System.out.println(product);
             }


             System.out.print("What to put in the cart (press enter to go to the register): ");
             String product = scanner.nextLine();
             System.out.println();
             if (product.isEmpty())
             {
                 break;
             }

             if (warehouse.stock(product) > 0)
             {
                 cart.add(product, warehouse.price(product));
                 warehouse.take(product);
             }
         }

         System.out.println("your shopping cart contents:");
         cart.print();
         System.out.println("total: " + cart.price() + "€");
     }
 }