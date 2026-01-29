/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose one: Wizard, Warrior, or Rogue");
		String x = sc.nextLine();
		
		if (!((x).equals("Wizard"))||((x).equals("Warrior"))||((x).equals("Rogue"))){
			System.out.println("Please choose one of the given roles.");
			x = sc.nextLine();
		}
			else if (!((x).equals("wizard"))||((x).equals("warrior"))||((x).equals("rogue"))){
			System.out.println("Please choose one of the given roles.");
			x = sc.nextLine();
			}
			

	}
}
