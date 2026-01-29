package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog {
		String name;
		int age;
		String breed;
		
	public Dog() {
		name = "Clifford";
		age = 3;
		breed = "Big Red Dog";
		}
	public Dog(String name){
		this.name = name;
		age = 1;
		breed = "dog dog";
	}
	public Dog(String name, String breed){
		this.name = name;
		age = 1;
		this.breed = breed;
	}
	public Dog(String name, int age){
		this.name = name;
		this.age = age;
		breed = "dog dog";
	}
	
	public String setName(String name){
		this.name = name;
	}
	public int setAge(int age){
		this.age = age;
	}
	public String setBreed(String breed){
		this.breed = breed;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public String getBreed(){
		return breed;
	}
	public boolean isSleeping(){
		int sleep = (int)(Math.random()*2+1);
		if (sleep==1){
			return true;
		}
		else {
			return false;
		}
	}
	public String bark(){
		System.out.println(name + " barks!");
	}
	
}
