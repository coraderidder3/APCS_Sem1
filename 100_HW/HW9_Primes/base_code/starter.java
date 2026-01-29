/*
 *	Author: Cora deRidder
 *  Date: 10/26/25
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		System.out.print("Input a number and we will print out every prime number until that number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		printPrimes(num);
//		System.out.println(checkPrime(num));
	}
	
		public static boolean checkPrime(int x){
			int a = x-1;
			int b;
			while (a>1){
				b = x%a;
//				System.out.println(b);
					if (b==0){
						return false;
					}
				a--;
//				System.out.println(a);
			}
			return true;
	}

		public static void printPrimes(int x){
			x--;
			while (x!=1){
				if (checkPrime(x)==true){
					System.out.println(x);
			}
				x--;
			}
			return;
		}
}
