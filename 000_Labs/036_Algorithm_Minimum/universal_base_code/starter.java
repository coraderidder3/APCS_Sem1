/*
 *	Author:  Cora deRidder
 *  Date: 11/12/25
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		
		BaseClass test = new BaseClass();

		int [] arr = new int[(int)(Math.random()*201+51)];
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random()*101);
		}
		
		int min = Integer.MAX_VALUE;
		for(int i = 0;  i < arr.length; i++){
			if(arr[i] < min){
				min = arr[i];
			}
		}
		
		System.out.println("Min: " + min);
		
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++){
			if(arr[i] > max){
				max = arr[i];
			}
		}
		
		System.out.println("Max: " + max);
		
		int sum = 0;
		for(int i = 0; i < arr.length; i++){
			sum = sum + arr[i];
		}
		double average = sum/arr.length;
		
		System.out.println("Average: " + average);
		
		System.out.println("Elements: " + arr.length);
	}
}
