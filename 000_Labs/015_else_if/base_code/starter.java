/*
 *	Author:  Cora deRidder
 *  Date: 9/17/25
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
	System.out.println("Guess a number between 1 and 1000!");
	int answer = sc.nextInt();
		if (answer==999){
			System.out.println("Yay! You got it!");
		}
		else if (answer>999){
			System.out.println("Your guess what higher than my number. Guess again!");
			answer = sc.nextInt();
		}
		else if (answer<999){
			System.out.println("Your guess what lower than my number. Guess again!");
			answer = sc.nextInt();
		}
		
		
		
		
		
	}
}
