/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
		public static void main(String args[]) {
		System.out.println("----------------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year = sc.nextInt();
		System.out.println();
		if(isLeapYear(year))
			System.out.println(year + " is a leap year!");
		else
			System.out.println(year + " is not a leap year!");
	}
	
	public static boolean isLeapYear(int year){
		if (year%4==0){
			if (year%100==0){
				if (year%400==0){
					return true;
				}
			}
			return true;
		}
		else {
			return false;
		}
	}
}