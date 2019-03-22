//Noor Moghul
//NJIT 2019 Spring
//March 21st, 2019

import java.util.Scanner;

public class DiceGame
{
   public static void main(String[] args)
   {
   
      Scanner scan = new Scanner(System.in);
      Die die1 = new Die();
      Die die2 = new Die();
      int yourScore = 0;
      int compScore = 0;
      int counter = 0;
      int guess = 0;
      int round = 1;
      
      
      while(yourScore < 100 && compScore < 100){
      
         System.out.println("*********************");
         System.out.println("       Scorecard      \n");
         System.out.println("Round #"+round+"\n");
         System.out.println(String.format("Your Score:%10d", yourScore));    
         System.out.println(String.format("Computer Score:%6d", compScore));  
         System.out.println("*********************");
         
         counter = 3;
         
         die1.roll();
         die2.roll();
         
         while(counter > 0){
                       
            //System.out.println("\nKey: "+die1.getFaceValue()+", "+die2.getFaceValue());   //Key
            
            do{
               System.out.print("\nEnter a guess inbetween  2 and 12 (inclusive): ");
               guess = scan.nextInt();
            }while(guess < 2 || guess >12);


            if(die1.getFaceValue()+die2.getFaceValue() == guess){
               yourScore += 5;
               System.out.println("\nNice! You guessed correctly!\n");
               break;
            }
            else if(counter == 1){
               compScore += 3;
               System.out.println("\nYou lose this round.\n");
               break;
            }
            System.out.println("\nTry again.");
            counter--;

         }
         System.out.println("The value of the die 1 & 2 were (respectively): "+die1.getFaceValue()+", "+die2.getFaceValue()+".\n");
         round++;
      }
      
      System.out.println("*********************");
      System.out.println("       Scorecard      \n");
      System.out.println("Round #"+round+"\n");
      System.out.println(String.format("Your Score:%10d", yourScore));    
      System.out.println(String.format("Computer Score:%6d", compScore));  
      System.out.println("*********************");
      
      if(yourScore > 99){
         System.out.println("You WIN!!!");
      }
      else{
         System.out.println("The Computer WINS!!!");
      }  
   }
}