/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Guess a number between 1 and 1000!");
	int answer = sc.nextInt();
		while (answer!=999){
			System.out.println("Close, keep on guessing!");
			answer = sc.nextInt();
		}
		if (answer==999){
			System.out.println("Yay! You got it!");
		}
	}
}
