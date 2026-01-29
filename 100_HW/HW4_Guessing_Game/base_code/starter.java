/*
 *	Author:
 *  Date:
 * 	Collaborator:
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		System.out.println("The goal of the game is to guess a word with two hints!");
		Scanner sc = new Scanner(System.in);
		
		int X = ((int)(Math.random()*3+1));
		
		if (X==1){
			System.out.println("It's a type of animal");
			System.out.println("What's your guess?");
			String dog = ("dog");
			String ans1 = sc.nextLine();
			
			if (!ans1.equals(dog)){
				System.out.println("Sadly, you didn't guess right, here's another hint!");
				System.out.println("I love to chew on bones");
				ans1 = sc.nextLine();
				if(!ans1.equals(dog)){
					System.out.println("The answer was dog, better luck next time!");
				}
			}
			if (ans1.equals(dog)){
				System.out.println("Yay! you got it!");
			}
		}
	
		if (X==2){
			System.out.println("It's a type of fruit");
			System.out.println("What's your guess?");
			String banana = ("banana");
			String ans2 = sc.nextLine();
			
			if (!ans2.equals(banana)){
				System.out.println("Sadly, you didn't guess right, here's another hint!");
				System.out.println("It's yellow");
				ans2 = sc.nextLine();
				if(!ans2.equals(banana)){
					System.out.println("The answer was banana, better luck next time!");
				}
			}
			if (ans2.equals(banana)){
				System.out.println("Yay! you got it!");
			}
		}
			
		if (X==3){
			System.out.println("It's a color");
			System.out.println("What's your guess?");
			String purple = ("purple");
			String ans3 = sc.nextLine();
			
			if (!ans3.equals(purple)){
				System.out.println("Sadly, you didn't guess right, here's another hint!");
				System.out.println("It's the color of lilacs");
				ans3 = sc.nextLine();
				if(!ans3.equals(purple)){
					System.out.println("The answer was purple, better luck next time!");
				}
			}
			if (ans3.equals(purple)){
				System.out.println("Yay! you got it!");
			}
		}
			
	}
}
