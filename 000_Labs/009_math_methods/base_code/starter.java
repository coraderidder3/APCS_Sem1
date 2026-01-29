/*
 *	Author:  Cora deRidder
 *  Date: 9/4/2025
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		double aPrep1 = 13-6*11;
		double aPrep2 = 30 % 7 * (-2);
		System.out.println(Math.max(aPrep1,aPrep2));
		
		double bPrep = 3 * 8 + 31 % 7;
		System.out.println(Math.sqrt(bPrep));
		
		double cPrep1 = 37 / 3;
		double cPrep2 = 35 % 21;
		System.out.println(Math.pow(cPrep1,cPrep2));
		
		double dPowPrep = 14 % 3;
		double dP = Math.pow(2,dPowPrep);
		double dSqrtPrep = 2 * 6;
		double dSP = Math.sqrt(dSqrtPrep);
		System.out.println(Math.max(dP,dSP));
	
		
	}
}
