/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Give me one integer:");
	int num1 = sc.nextInt();
	System.out.println();
	System.out.println("Give me one more integer:");
	int num2 = sc.nextInt();
	System.out.println();
	int powerOf = pow(num1, num2);
	System.out.println( num1 + " to the power of " + num2 + " is " + powerOf);
	}
	
	public static int pow(int a,int b){
	//	int power = (int)(Math.pow(a, b));
		int power = 1;
		while (b>0){
			power = a*a;
			b--;
		}
		return power;
	}
}
