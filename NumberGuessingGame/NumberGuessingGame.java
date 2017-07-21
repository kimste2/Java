// number guessing game 
import java.util.Scanner;
import java.util.Locale;
import java.util.Random;
public class NumberGuessingGame
{
    public static void main(String[] args) 
    {
        int guess_counter;
        int guesses[]= new int[10];
     	int guess = -1;

     	Random randomGenerator = new Random();

     	String continue_response = "yes"; 

     	Scanner int_reader = new Scanner(System.in);  
     	Scanner string_reader= new Scanner(System.in);
        
     	int random_number = randomGenerator.nextInt(100);

		while(continue_response.equals("yes") )
		{
			System.out.println("Number Guessing Game!");
        	System.out.println("You have ten tries to guess the number between zero and one hundred inclusive.  Good luck!");
			for(guess_counter = 0; guess_counter <= 9; guess_counter++)
	        {
	        	System.out.print("Guess_counter is: " + (guess_counter + 1) +"\n");
	   			System.out.print("Enter a number: ");
	        	guess = int_reader.nextInt();
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
		     	System.out.print("The correct number is 42.\nYou guessed: ");
		        for(guess_counter = 0; guess_counter <= 9; guess_counter++)
		        {
		        	System.out.print(guesses[guess_counter]);
		        	System.out.print(", ");
		        }
	      	}
	      

		    System.out.print("\nDo you want to play again? Please enter \"yes\" or \"no\": ");
		    continue_response = string_reader.nextLine();
	      	continue_response = continue_response.toLowerCase();
		}		
		System.out.println("Thank you for playing");
	}

}
