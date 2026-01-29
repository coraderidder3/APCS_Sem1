/*
 *	Author:  Cora deRidder
 *  Date: 10/24/25
*/

package pkg;
import java.util.*;

public class BankAccount {
	// GLOBAL VARIABLES
		String owner;
		int number = (int)(Math.random()*50+(1000-50));
		double balance;
		boolean isActive;
	
	// CONSTRUCTORS
		public BankAccount(){
			owner = "Unknown";
			number++;
			balance = 0;
			isActive = false;
		}
	
		public BankAccount(String ow){
			owner = ow;
			number++;
			balance = 0;
			isActive = true;
		}
		
		public BankAccount(String ow, double bal){
			owner = ow;
			number++;
			balance = bal;
			isActive = true;
		}
	
		public BankAccount(String ow, int num, double bal, boolean act){
			owner = ow;
			number = num;
			balance = bal;
			isActive = act;
		}
	
		//METHODS
		public void checkBalance(){
			System.out.println("Total balance: $"+ balance);
		}
		
		public void displayAccountInfo(){
			System.out.println("Owner: " + owner);
			System.out.println("Account number: " + number);
			System.out.println("Total balance: $" + balance);
			System.out.print("Status: ");
				 if (isActive==true){
				 	System.out.println("Active");
				 }
				 else {
				 	System.out.println("Inactive");
				 }
		}
		
		public String getOwner(){
			return owner;
		}
		
		public String setOwner(String owner){
			this.owner=owner;
		}
		
		public double getBalance(){
			return balance;
		}
		
		
	}
	