/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Wizard [] wiz = new Wizard[100];
		Warrior [] war = new Warrior[100];
		for(int i=0; i<wiz.length; i++){
			wiz[i] = new Wizard();
		}
		for(int i=0; i<war.length; i++){
			war[i] = new Warrior();
		}
		
		int wizCount = 0;
		int warCount = 0;
		
		while(warCount<war.length && wizCount<wiz.length){
			war[warCount].attack(wiz[wizCount]);
			if(wiz[wizCount].isDead()){
				wizCount++;
				if(wizCount==wiz.length){
					break;
				}
			}
			
			wiz[wizCount].attack(war[warCount]);
			if(war[warCount].isDead()){
				warCount++;
				if(warCount==war.length){
					break;
				}
			}
		}
		
		if(wizCount>warCount){
			System.out.println("The Warriors won with " + (war.length-1-warCount) + " warriors left.");
		}
		else{
			System.out.println("The Wizards won with " + (wiz.length-1-wizCount) + " wizards left.");
		}
		
	}
}
