/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Dog winter = new Dog("Winter", 8);
		Dog chloe = new Dog("Chloe", "German Shepard");
		
		boolean sleep1 = winter.isSleeping();
		if (sleep1==true){
			System.out.println( winter.getName() + " is sleeping");
		}
		else{
			winter.bark();
		}
		
		boolean sleep2 = chloe.isSleeping();
		if (sleep2==true && sleep1==false){
			chloe.bark();
		}
		if (sleep2==false && sleep1==false){
			chloe.bark();
		}

	}
}
