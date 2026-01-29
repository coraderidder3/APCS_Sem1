/*
 *	Author: Cora deRidder
 *  Date: 10/5/25
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		
		System.out.println("Slot Machine Rules:");
		System.out.println("1. Each player starts with $100");
		System.out.println("2. Input a wager less than your total amount of money");
		System.out.println("3. The slot machine will roll 3 numbers from 1 to 10");
		System.out.println("	a. If 2 #s match, you double your money!");
		System.out.println("	b. If 3 #s match, you triple your money!");
		System.out.println("	c. If none match, you lose your money.");
		System.out.println("--------------------------------------------------------------");
		System.out.println("Would you like to play Slots?");
		Scanner sc = new Scanner(System.in);
		String ans = sc.nextLine();
		System.out.println(" ");
		while (ans.equals("yes")||ans.equals("Yes")||ans.equals("Y")||ans.equals("y")){
			int money = 100;
			System.out.print("You have $"+money+", how much would you like to wager?");
			int wager = sc.nextInt();
			System.out.println(" ");
				if (wager>money){
					System.out.println("Please choose an amount less than or equal to $" + money);
					wager = sc.nextInt();
				}
			System.out.println("Lets play!!");
			int Rone = ((int)(Math.random()*10));
			int Rtwo = ((int)(Math.random()*10));
			int Rthree = ((int)(Math.random()*10));
			System.out.println("Your rolls are:");
			System.out.println("_________________________");
			System.out.println("|"+ Rone + " | " + Rtwo + " | " + Rthree + " | ");
			System.out.println("_________________________");
			
				
			if (Rone==Rtwo||Rone==Rthree||Rtwo==Rthree){
				if (Rone==Rtwo&&Rone==Rthree){
					System.out.println("Congrats! You tripled your money!");
					money = money*3;
				}
				System.out.println("Congrats! You doubled your money!");
				money = money*2;
			}
				else{
					System.out.println("Sorry, you didn't win.");
					money = money-wager;
			}
			
			if (ans.equals("no")||ans.equals("No")||ans.equals("N")||ans.equals("n")){
				break;
			}
		}
		
		
		
		
		
		
		
	}
}
