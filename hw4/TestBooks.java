//Noor Moghul
//NJIT 2019 Spring
//March 21st, 2019

import java.util.Scanner;
import java.util.ArrayList;

public class TestBooks
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter the number books you read during the summer: ");
      int numofBooks = scan.nextInt();
      if(numofBooks < 1)
      {
         System.out.println("ok");
         System.exit(0);
      }
      double pageSum = 0;
      //int smallest = Integer.MAX_VALUE;
      //int smallIndex = 0;
      int set=0;
      ArrayList<Book> bookArray = new ArrayList<Book>();      
      
      for(int i = 0; i < numofBooks; i++)
      {
         int con= i+1;
         int pages=0;
         scan.nextLine();
         System.out.print("Enter book number " + con + " name: ");
         String name = scan.nextLine();
         do
         {
            System.out.print("Enter book number " + con + "\'s number of pages: ");
            pages = scan.nextInt();
         }while(pages < 1);
         bookArray.add(new Book(pages, name));
         pageSum += pages;
         con++;
         
         /*if(pages < smallest)
         {
            smallest = pages;
            smallIndex = i;
         }*/
      }
      
      //System.out.println(bookArray.get(smallIndex)+" It is the \"smallest\" book.");
      //I prefer my implementation of finding the lowest paged book but below I used compareTo.
      
      //This assumes books with same page numbers won't be entered, and it won't differentiate or acknowledge
      //beacuse nothing was specified
      if(numofBooks > 1)
      {
         for(int n = 0; n<numofBooks-1; n++)
         {
            int check = bookArray.get(set).compareTo(bookArray.get(n+1));
            
            if(check == 1)
            {
               set=n+1;
            }
         }
         System.out.println(bookArray.get(set)+" It is the \"smallest\" book.");
      }
      else
      {
         System.out.println(bookArray.get(0)+" It is the \"smallest\" book.");
      }
        
      System.out.println("The average number of pages per book read are "+(pageSum/numofBooks)+".");
   }
}
