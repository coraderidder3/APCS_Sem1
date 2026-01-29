/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter your name:");
		String name = sc.nextLine();
		System.out.println(" ");
		System.out.print("Please enter an integer:");
		int x = sc.nextInt();
		System.out.println("");
		int y = 0;
		while (x!=y){
			if (x==y){
				break;
			}
			System.out.println(y + ". " + name);
			y++;
		}


		
	}
}
