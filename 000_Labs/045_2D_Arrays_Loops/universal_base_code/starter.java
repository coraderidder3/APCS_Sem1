/*
 *	Author:  Cora deRidder
 *  Date: 1/14/26
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How wide do you want your array to be?");
		int width = sc.nextInt();
		System.out.println("How tall do you want your array to be?");
		int height = sc.nextInt();
		
		int [][]arr = new int[height][width];
		
		for(int r = 0; r < arr.length; r++){
			for(int c = 0; c < arr[0].length; c++){
				arr[r][c] = (int)(Math.random()*10+1);
			}
		}
		
		print(arr);
		
		System.out.println("What row would you like to get the average of?");
		int rowaverage = sc.nextInt();
		System.out.println(numaverage(arr, rowaverage));
		
		System.out.print("Here is the average of all of the values:" + totalaverage(arr));
		
	}
	
	public static String print(int [][]arr){
		System.out.println("------------------------------------");
		for(int r = 0; r < arr.length; r++){
			for(int c = 0; c < arr[0].length; c++){
				System.out.print(arr[r][c]+" ");
			}
			System.out.println(" ");
		}
		System.out.println("------------------------------------");
		return " ";
	}
	
	public static String numaverage(int [][]arr, int row){
		int sum = 0;
		int av = 0;
		for(int c = 0; c < arr[0].length; c++){
			sum = sum + arr[row][c];
		}
		av = sum/arr[0].length;
		return ("The average row "+ row + " is " + av);
	}
	
	public static int totalaverage(int [][]arr){
		int sum = 0;
		int av = 0;
		for(int r = 0; r < arr.length; r++){
			for(int c = 0; c < arr[0].length; c++){
				sum = sum + arr[r][c];
			}
		}
		av = sum/(arr.length*arr[0].length);
		return av;
	}
}
