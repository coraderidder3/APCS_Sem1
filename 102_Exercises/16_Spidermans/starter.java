/*
	Author: Cora deRidder
	Date: 10/27/25
	Collaborator(s):
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Spiderman x = new Spiderman("Tobey Maguire", 48, "Green Goblin");
		System.out.println("Here are " + x.getActor() + "'s stats:");
		System.out.println("----------------------------------------------------------");
		System.out.println("Actor: " + x.getActor());
		System.out.println("Age: " + x.getAge());
		System.out.println("Villain: " + x.getVillain());
		System.out.println("----------------------------------------------------------");
		System.out.println(" ");
		
		Spiderman y = new Spiderman("Andrew Garfield", 40, "Electro");
		System.out.println("Here are " + y.getActor() + "'s stats:");
		System.out.println("----------------------------------------------------------");
		System.out.println("Actor: " + y.getActor());
		System.out.println("Age: " + y.getAge());
		System.out.println("Villain: " + y.getVillain());
		System.out.println("----------------------------------------------------------");
		System.out.println(" ");
		
		Spiderman z = new Spiderman("Tom Holland", 27, "The Vulture");
		System.out.println("Here are " + z.getActor() + "'s stats:");
		System.out.println("----------------------------------------------------------");
		System.out.println("Actor: " + z.getActor());
		System.out.println("Age: " + z.getAge());
		System.out.println("Villain: " + x.getVillain());
		System.out.println("----------------------------------------------------------");
		System.out.println(" ");
		
		Spiderman k = new Spiderman("Kaylee Kook", 14, "Evelyn the Destroyer");
		System.out.println("Here are " + k.getActor() + "'s stats:");
		System.out.println("----------------------------------------------------------");
		System.out.println("Actor: " + k.getActor());
		System.out.println("Age: " + k.getAge());
		System.out.println("Villain: " + k.getVillain());
		System.out.println("----------------------------------------------------------");
	}
}
