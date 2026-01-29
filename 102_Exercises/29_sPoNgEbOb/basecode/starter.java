/*
	Author:
	Date:
*/
import java.util.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		System.out.println("Please enter a word or phrase:");
		
		Scanner sc = new Scanner(System.in);
		String phrase = sc.nextLine();
		boolean upcase = false;
		
		for(int i = 0; i<phrase.length();i++){
			
			if((phrase.substring(i, i+1)).equals(" ")){
				System.out.print(" ");
				upcase = false;
			}
			
			if(upcase){
				System.out.print((phrase.substring(i, i+1)).toUpperCase());
				upcase = false;
			}
			
			else{
				System.out.print((phrase.substring(i, i+1)).toLowerCase());
				upcase = true;
			}
			
		}
	}
}
