package olivia.mitchell.guessmynumber;
import java.util.*;

public class GuessingGame {

	public GuessingGame() {
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		int guess;
		
		int the_number = random.nextInt(10+1);
		
		System.out.println("Welcom to the Number Guessing Game");         
		System.out.println("Im thingking of a number between 1 and 10");         
		System.out.println("You have three guesses good luck!");  
		
		System.out.println("Pick a number between 1 and 10 and press enter: ");   
		if (input.hasNextInt() ) {
			guess = input.nextInt();
			if (guess == the_number) {
				System.out.println("you guessed it good job you win!");
			}
			else if (guess < the_number) {
				System.out.println("You guessed wrong; guess a higher number: ");
			}
			else {
				System.out.println("You guessed wrong; guess a lower number: ");
			}
		}
		else {
			System.out.print("Not a good value");
			input.nextLine();
		}
  
		if (input.hasNextInt() ) {
			guess = input.nextInt();
			if (guess == the_number) {
				System.out.println("you guessed it good job you win!");
			}
			else if (guess < the_number) {
				System.out.println("You guessed wrong; guess a higher number: ");
			}
			else {
				System.out.println("You guessed wrong; guess a lower number: ");
			}
		}
		else {
			System.out.print("Not a good value");
			input.nextLine();
		}
		   
		if (input.hasNextInt() ) {
			guess = input.nextInt();
			if (guess == the_number) {
				System.out.println("you guessed it good job you win!");
			}
			else if (guess < the_number) {
				System.out.println("You guessed wrong; guess a higher number: ");
			}
			else {
				System.out.println("You guessed wrong; guess a lower number: ");
			}
		}
		else {
			System.out.print("Not a good value");
			input.nextLine();
		}
		
		input.close();
	}

	public static void main(String[] args) {
		new GuessingGame();
	}

}
