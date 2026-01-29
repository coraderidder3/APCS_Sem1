/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Give me a word");
		String str = sc.nextLine();
		for(int i=0; i<str.length(); i++){
		System.out.println(str.substring(i, i+1));
		}
	}
}
