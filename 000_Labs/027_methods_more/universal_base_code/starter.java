/*
 *	Author:  Cora deRidder
 *  Date: 10/22/25
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		BankAccount x;
		System.out.println("Welcome to Cora's ATM!");
		System.out.println("We are going to create an account, what info do we know?");
		System.out.println("1. Nothing");
		System.out.println("2. Owner");
		System.out.println("3. Owner and Intial Desposit");
		Scanner sc = new Scanner(System.in);
		int ans = sc.nextInt();
		sc.nextLine();
			if (ans==1){
				x = new BankAccount();
				System.out.println("");
				System.out.println("Account created!");
				System.out.println("");
				System.out.println("-- Account Info --");
				x.displayAccountInfo();
				System.out.println("------------------");
				x.checkBalance();
			}
			else if (ans==2){
				System.out.println("What name would the account be under?");
				String accOwner = sc.nextLine();
				x = new BankAccount(accOwner);
				System.out.println("");
				System.out.println("Account created!");
				System.out.println("");
				System.out.println("-- Account Info --");
				x.displayAccountInfo();
				System.out.println("------------------");
				x.checkBalance();
			}
			else if (ans==3){
				System.out.println("What name would the account be under?");
				String accOwner = sc.nextLine();
				System.out.println("How much would you like to deposit?");
				double deposit = sc.nextDouble();
				x = new BankAccount(accOwner, deposit);
				System.out.println("");
				System.out.println("Account created!");
				System.out.println("");
				System.out.println("-- Account Info --");
				x.displayAccountInfo();
				System.out.println("------------------");
				x.checkBalance();
			}
		
	}
}
