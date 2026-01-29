/*
 *	Author: Cora deRidder
 *  Date: 11/13/25
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
			int [] arr = new int[20];
			for(int i = 0; i<arr.length; i++){
				arr[i]=(int)(Math.random()*10);
			}
			
			// ----------------------------------------------
			
			int numDupes = 0;
			int target = (int)(Math.random()*10);
					System.out.print("Indexes of duplicates of "+ target + ": ");
					
					for(int i = 0; i < arr.length; i++){
						if (arr[i]==target){
							numDupes++;
							System.out.print(i + ", ");
						}
					}
					System.out.println("");
					System.out.println("# of duplicates: " + numDupes);
					
			// -----------------------------------------------
			System.out.println("");
			System.out.println("-----------------------------------------");
			System.out.println("");
			
			int previous = arr[0];
			for(int i = 1; i < arr.length; i++){
				if (arr[i]==previous){
					System.out.println("Consecutive indexes: "+ previous + ", " + i + ", ");
					System.out.println("^Consecutive #s: " + previous + ", " + arr[i]);
				}
				previous = arr[i];
			}

	}

}
