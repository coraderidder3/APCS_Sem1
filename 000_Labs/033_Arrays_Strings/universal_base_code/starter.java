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
		BaseClass test = new BaseClass();
		String []arr = new String [10];
		arr[0] = "Come a little bit closer";
		arr[1] = "Hear what I have to say";
		arr[2] = "Just like children sleepin'";
		arr[3] = "We could dream this night away";
		arr[4] = "But there's a full moon risin'";
		arr[5] = "Let's go dancin' in the light";
		arr[6] = "We know where the music's playin'";
		arr[7] = "Let's go out and feel the night";
		arr[8] = "Because I'm still in love with you";
		arr[9] = "I want to see you dance again";
		
		int i = 0;
		while (i<10){
			System.out.println(arr[i]);
			i++;
		}

		
	}
}
