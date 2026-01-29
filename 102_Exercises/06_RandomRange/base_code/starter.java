/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		System.out.println("Enter 2 numbers to create a range for your random number");
		System.out.println("Please enter an integer:");
		Scanner sc = new Scanner (System.in);
		int numb1 = sc.nextInt();
		System.out.println("Please enter another integer:");
		int numb2 = sc.nextInt();
			while (numb1>numb2){
				System.out.println("Please choose an integer bigger than your first:");
				numb2 = sc.nextInt();
			}
				System.out.println("Your range is " +numb1+ " to " +numb2+ ".");
				System.out.println("Here are 5 numbers generate in that range:");
				System.out.print((int)(Math.random()*(numb2-numb1)+numb1)+", ");
					System.out.print((int)(Math.random()*(numb2-numb1)+numb1)+", ");
					System.out.print((int)(Math.random()*(numb2-numb1)+numb1)+", ");
						System.out.print((int)(Math.random()*(numb2-numb1)+numb1)+", ");
							System.out.print((int)(Math.random()*(numb2-numb1)+numb1)+", ");
	
	}
}
