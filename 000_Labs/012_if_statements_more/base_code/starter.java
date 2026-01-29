/*
 *	Author:  Cora deRidder
 *  Date: 9/12/25
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
		if(num1==num2){
			System.out.println("You chose two numbers that are equal to eachother!");
		}
		else if(num1!=num2){
			System.out.println("Your numbers are not equal to eachother!");
		}
		
	}
}
