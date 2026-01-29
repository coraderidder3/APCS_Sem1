/*
 *	Author:  Cora deRidder
 *  Date: 12/3/25
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your first and last name?");
		String str = sc.nextLine();
		System.out.println(str.substring(str.indexOf(" "), str.length()));
	}
}
