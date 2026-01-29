/*
 *	Author: Cora deRidder
 *  Date: 9/12/25
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
			Scanner sc = new Scanner (System.in);
		System.out.print("Pick an integer:");
		int num1 = sc.nextInt();
		System.out.println(" ");
		System.out.print("Pick one more integer:");
		int num2 = sc.nextInt();
		System.out.println("");
	
		if(num1%2==0){
			System.out.println("Your first # is even!");
		}
		else if(num1%2!=0){
			System.out.println("Your first # is odd!");
		}
		
		if(num2%2==0){
			System.out.println("Your second # is even!");
		}
		else if(num2%2!=0){
			System.out.println("Your second # is odd!");
		}
		
		
		if(num1%3==0 && num1%4==0 && num1%5==0){
			System.out.println("Your first # is divisible by 3,4, and 5!");
		}
		else {
			System.out.println("Your first # is not divisible by 3,4, and 5!");
		}
		
		if(num2%3==0 && num2%4==0 && num2%5==0){
			System.out.println("Your second # is divisible by 3,4, and 5!");
		}
		else {
			System.out.println("Your second # is not divisible by 3,4, and 5!");
		}
	}
}
