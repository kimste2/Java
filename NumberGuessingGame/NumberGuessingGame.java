// number guessing game 
import java.util.Scanner;
public class NumberGuessingGame
{
    public static void main(String[] args) 
    {
        int guess_counter;
        int guesses[]=new int[10];
     	int random_number = 42;  // TODO: make actual random number
     	int guess = -1;

     	Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Number Guessing Game!");
        System.out.println("You have ten tries to guess the number between 0 and one hundred inclusive.  Good luck!");
		
        for(guess_counter = 0; guess_counter <= 9; guess_counter++)
        {
        	System.out.print("Guess_counter is: " + (guess_counter + 1) +"\n");
   			System.out.print("Enter a number: ");
        	guess = reader.nextInt();
        	if(guess == random_number)
        	{
        		System.out.println("You win!");
        		break;
        	}
        	else
        	{
        		guesses[guess_counter] = guess;
        		System.out.println("Incorrect! Try again!");
        	}

        }
      
	      if(guess_counter > 9)
	      {
	      	  System.out.println("The correct number is 42. You guessed: ");
	         for(guess_counter = 0; guess_counter <= 9; guess_counter++)
	        {
	        	System.out.print(guesses[guess_counter]);
	        	System.out.print(", ");
	        }
	      }

	      System.out.println("\nThe End!");

    }
}
