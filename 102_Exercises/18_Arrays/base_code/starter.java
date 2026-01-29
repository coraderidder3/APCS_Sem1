/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		 int []arr = new int [1000];
		 int a = 0;
		 int b = 0;
		 while (a<1001){
		 	b = b+3;
		 	arr[a] = b;
		 	System.out.print(arr[a] + ", ");
		 	a++;
		 }
		
		System.out.println(" ");
		
		int []arr2 = new int [1000];
		int x = 0;
		int y = 1000;
		while (x<1001 && y>=0){
			arr2[x] = y;
			System.out.print(arr2[x] + ", ");
			y--;
		}
		 
	}
}
