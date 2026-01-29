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
		System.out.print("Please enter a phrase you would like to reverse: ");
		String phrase = sc.nextLine();
		String reverse = "";
		
		while(phrase.indexOf(" ")!=-1){
			int space = phrase.indexOf(" ");
			String word = phrase.substring(0, space+1);
			phrase = phrase.substring(space+1);
			reverse = word + reverse;
		}
		
		System.out.print(phrase + " " + reverse);
		
	//	for(int i=phrase.length()-1; i>=0; i--){
	//		System.out.print(phrase.substring(i,i+1));
	//	}
		
	}
}
