package pkg;
import java.util.Scanner;
import java.util.Random;


public class Spiderman {
	String actor;		// What's the actors name?
	int age;			// What's the age of the actor?
	String villain;		// Who's the arch nemesis of this Spiderman?

	// Create constructors for each combination of actor/age/villain. Use the defaults above if not an input parameter.
	public Spiderman() {
		actor = "unknown";
		age = 0;
		villain = "unknown";
		}// Default constructor! 				Actor - Unknown, Age - 0, Villain - Unknown
	
	public Spiderman(String a) {
		actor = a;
		age = 0;
		villain = "unknown";
	}
	// String Actor constructor! 			Age - 0, Villain Unknown 
	
	public Spiderman(int n){
		actor = "unknown";
		age = 0;
		villain = "unknown";
	}
	// int Age constructor! 				Actor - Unknown, Villain Unknown
	
	public Spiderman(String a, int n){
		actor = a;
		age = n;
		villain = "unkown";
	}
	// String Actor, int Age constructor! 	Villain Unknown
	
	public Spiderman(String a, int n, String v){
		actor = a;
		age = n;
		villain = v;
	}
	// String Actor, int Age, String Villain constructor!		
	
	// ---------------------------------------
	// Create accessor and mutator methods for actor, age, and villain (6 total methods)
	// Ex: getAge and setAge
	
	public void setAge(int n){
		age = n;
	}
	public int getAge(){
		return age;
	}
	
	public void setActor(String a){
		actor = a;
	}
	public String getActor(){
		return actor;
	}
	
	public void setVillain(String v){
		villain = v;
	}
	public String getVillain(){
		return villain;
	}


	// ---------------------------------------
	public void fight(){
		System.out.println("Spidey shoots his web at " + villain);
	}

	public void printArt(){				// Prints out Spidey!
	System.out.println("           :              ");  
    System.out.println("           ;              ");   
    System.out.println("          :               ");   
    System.out.println("          ;               ");   
    System.out.println("         /                ");   
    System.out.println("       o/                 ");   
    System.out.println("     ._/\\___,             ");    
    System.out.println("         \\                ");   
    System.out.println("         /    			  "); 
	}
}
