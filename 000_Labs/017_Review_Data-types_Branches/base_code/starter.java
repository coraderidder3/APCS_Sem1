/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		System.out.println("What is your name?");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		
		System.out.println("What is your title? Ex: Slayer of Dragons");
		String title = sc.nextLine();
			
		System.out.println("Would you like to be a Wizard, Warrior, or Rogue?");
		String type = sc.nextLine();
		
			if (((type).equals("Wizard"))||((type).equals("Warrior"))||((type).equals("Rogue"))){
				System.out.println("You chose " + type + "! Excellent!");
				}
				else if (((type).equals("wizard"))||((type).equals("warrior"))||((type).equals("rogue"))){
					System.out.println("You chose " + type + "! Excellent!");
					}
					else {
						System.out.println("Please choose one of the roles.");
						type = sc.nextLine();
					}
		
		System.out.println(" ");
		System.out.println("You have 20 skill points, and can spend them on the following: Strength, Dexterity, Intelligence, and Charisma! Make sure you spend them wisely.");
		System.out.println(" ");
		System.out.print("Strength (1-10): ");
		int strength = sc.nextInt();
			if (strength<1){
				System.out.println("Please choose a number between 1-10");
				strength = sc.nextInt();
			}
				else if (strength>10){
					System.out.println("Please choose a number between 1-10");
					strength = sc.nextInt();
			}
		System.out.println(" ");
			System.out.println("You have " + (20-(strength)) + " points left to spend.");
		System.out.print("Dexterity (1-10): ");
		int dexterity = sc.nextInt();
			if (dexterity<1){
				System.out.println("Please choose a number between 1-10:");
				dexterity = sc.nextInt();
			}
				else if (dexterity>10){
					System.out.println("Please choose a number between 1-10");
					dexterity = sc.nextInt();
			}
		System.out.println("You have " + (20-(dexterity)-(strength)) + " points left to spend.");
		System.out.println(" ");
		System.out.print("Intelligence (1-10): ");
		int intelligence = sc.nextInt();
			if (intelligence<1){
				System.out.println("Please choose a number between 1-10:");
				intelligence = sc.nextInt();
			}
				else if (intelligence>10){
					System.out.println("Please choose a number between 1-10");
					intelligence = sc.nextInt();
			}
		System.out.println("You have " + (20-(dexterity)-(strength)-(intelligence)) + " points left to spend.");
		System.out.println(" ");
		System.out.print("Charisma (1-10): ");
		int charisma = sc.nextInt();
			if (charisma<1){
				System.out.println("Please choose a number between 1-10:");
				charisma = sc.nextInt();
			}
				else if (charisma>10){
					System.out.println("Please choose a number between 1-10");
					charisma = sc.nextInt();
			}
		System.out.println("You have " + (20-(dexterity)-(strength)-(intelligence)-(charisma)) + " points left to spend.");
		
		System.out.println("--------------------------------------------------------------------------------------------");
		System.out.println("You are " + name + ", the " + title + " of CVHS!");
		System.out.println("You are a " + type + ", and have the following stats:");
	
		System.out.println("Strength: " + strength);
		System.out.println("Dexterity: " + dexterity);
		System.out.println("Intelligence: " + intelligence);
		System.out.println("Charisma: " + charisma);
		System.out.println(" ");
		System.out.println("Goodluck on your quest " + name + " the " + title + "!");
	
	}
}
