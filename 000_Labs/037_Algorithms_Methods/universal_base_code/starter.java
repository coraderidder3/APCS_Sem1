/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		int [] arr = new int[100];
		for(int i=0; i<arr.length; i++){
			arr[i]=(int)(Math.random()*100+1);
		}
		System.out.print("Elements: ");
		toStringArray(arr);
		System.out.println("");
		System.out.println("Average: " + getArrayAverage(arr));
		System.out.println("Minimum: " + getArrayMin(arr));
		System.out.println("Maximum: " + getArrayMax(arr));

		
	}
	
	public static void toStringArray(int [] arr){
		for(int i= 0; i < arr.length; i++){
			System.out.print(arr[i] + ", ");
		}
	}
	
	public static int getArrayAverage(int [] arr){
		int sum = 0;
		for(int i = 0; i<arr.length; i++){
			sum = arr[i] + sum;
		}
		int average = sum/arr.length;
		return average;
	}
	
	public static int getArrayMax(int [] arr){
		int max = arr[0];
		for(int i = 0; i < arr.length; i++){
			if(arr[i] > max){
				max = arr[i];
			}
		}
		return max;
	}
	
	public static int getArrayMin(int [] arr){
		int min = arr[0];
		for(int i = 0; i < arr.length; i++){
			if(arr[i] < min){
				min = arr[i];
			}
		}
		return min;
	}

}
