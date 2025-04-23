package day7;

import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {
		//The computer picks a random number within a certain range (say, 1 to 100).
		//The player tries to guess what that number is.
		
		Scanner scanner = new Scanner(System.in);
		
		int attempts = 3;
		System.out.println("Welcome to the Number Guessing Game!");
		System.out.println("Guess a number from 1 to 10");
		System.out.println("You have " + attempts + "attempts. Good luck!");
		
		int randomNumber = (int) (Math.random() * 10);
		int guess;
		
		for (int i = 1; i <= attempts; i++) {
			System.out.println("Attempt" + i + ": ");
			guess = scanner.nextInt();
			if (guess == randomNumber) {
				System.out.println("You guessed correctly");
				return;
			}
			if (guess < randomNumber)
				System.out.println("Too Low");
			else
				System.out.println("Too high");				
		}
		
		System.out.println("The randomNumber is: " + randomNumber);
	}

}
