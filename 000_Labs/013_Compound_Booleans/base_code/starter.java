/*
 *	Author:  Cora deRidder
 *  Date: 9/17/25
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose in an integer: ");
		int numb1 = sc.nextInt();
		System.out.println("Choose another integer: ");
		int numb2 = sc.nextInt();
		System.out.println("Choose one more integer: ");
		int numb3 = sc.nextInt();
		
		System.out.println("Here is your biggest #: ");
		if ((numb1>numb2)&&(numb1>numb3)){
			System.out.println(numb1);
		}
		
		if ((numb2>numb1)&&(numb2>numb3)){
			System.out.println(numb2);
		}
		
		if ((numb3>numb1)&&(numb3>numb2)){
			System.out.println(numb3);
		}
		
		
		System.out.println("Here is your smallest #: ");
		if ((numb1<numb2)&&(numb1<numb3)){
			System.out.println(numb1);
		}
		
		if ((numb2<numb1)&&(numb2<numb3)){
			System.out.println(numb2);
		}
		
		if ((numb3<numb1)&&(numb3<numb2)){
			System.out.println(numb3);
		}
		
		
		
	}
}
