/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}
	
	public static void main(String args[]) {
		// Your code goes below here
		String oneName = randName();
		int oneAge = randAge();
		PooleDwarf dwarfOne = new PooleDwarf(oneName,oneAge);
		
		String twoName = randName();
		int twoAge = randAge();
		PooleDwarf dwarfTwo = new PooleDwarf(twoName,twoAge);
		
		String threeName = randName();
		int threeAge = randAge();
		PooleDwarf dwarfThree = new PooleDwarf(threeName,threeAge);
		
		String fourName = randName();
		int fourAge = randAge();
		PooleDwarf dwarfFour = new PooleDwarf(fourName,fourAge);
		
		String fiveName = randName();
		int fiveAge = randAge();
		PooleDwarf dwarfFive = new PooleDwarf(fiveName,fiveAge);
		
		String sixName = randName();
		int sixAge = randAge();
		PooleDwarf dwarfSix = new PooleDwarf(sixName,sixAge);
		
		String sevenName = randName();
		int sevenAge = randAge();
		PooleDwarf dwarfSeven = new PooleDwarf(sevenName,sevenAge);
		
		int duplicate = 0;
		if (dwarfOne.isSameName(twoName).equals(true){
			duplicate = duplicate + 1;
		}
		if (dwarfOne.isSameName(threeName).equals(true){
			duplicate = duplicate + 1;
		}
		if (dwarfOne.isSameName(fourName).equals(true){
			duplicate = duplicate + 1;
		}
		if (dwarfOne.isSameName(fiveName).equals(true){
			duplicate = duplicate + 1;
		}
		if (dwarfOne.isSameName(sixName).equals(true){
			duplicate = duplicate + 1;
		}
		if (dwarfOne.isSameName(sevenName).equals(true){
			duplicate = duplicate + 1;
		}
		
		System.out.println("There were " + duplicate + " duplicate dwarfs.");
	}
	
	public static int randAge(){
		int rand = (int)(Math.random()*100);
		return rand;
	}
}
