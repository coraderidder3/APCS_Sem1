/*
 *	Author:  Cora deRidder
 *  Date: 1/20/26
*/

import java.util.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		/*
			Create a program that creates a crossword puzzle hiding 1 word given by the user!

			1. Take a word from the user
			2. Create a 2D String array with a size of 5 larger than the word size in both directions
			3. Choose what direction the word should hide in
				- Vertical, Horizontal, Diagonal
				- EXTRA: Choose if the word should hide forward or backwards
			4. For each letter in the word, hide it into a spot in the 2D array
				- This spot should be chosen randomly within the bounds of the 2D array
			5. Once the word is stored in the array, fill up the rest of the array
				- Note what value is stored in the String array and replacing non-filled values with random letters
				- Given the letters array, choose a random letter to populate it with
			6. Print out the crossword puzzle!
			7. Ask a friend to find the word!
		*/
	
		String[] letters = {
            "a","b","c","d","e","f","g","h","i","j",
            "k","l","m","n","o","p","q","r","s","t",
            "u","v","w","x","y","z"
        };
		
		System.out.println("What word do you want to use?");
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		
		int size = (word.length())+5;
		String [][]arr = new String[size][size];
		int direction = (int)(Math.random()*3+1);
		
		int row = (int)(Math.random()*arr.length)-1;
		int column = (int)(Math.random()*arr[0].length)-1;
		int i;
		
		if(direction==1){ // vert
			System.out.println("1");
			while((row-word.length())>(arr.length-word.length()))
				row--;
			i = 0;
			for(int r=row; r<row+word.length(); r++){
				arr[r][column] = word.substring(i,i+1);
				i++;
			}
		}
		
		else if(direction==2){ //horiz
			System.out.println("2");
			while((column-word.length())>(arr[0].length-word.length()))
				column--;
			i = 0;
			for(int c=column; c<column+word.length(); c++){
				arr[row][c] = word.substring(i,i+1);
				i++;
			}
		}
		
		else if(direction==3){ //diagonal
			System.out.println("3");
			while((column-word.length())>(arr[0].length-word.length()))
				column--;
			while((row-word.length())>(arr.length-word.length()))
				row--;
			i = 0;
			int c = column;
			for(int r=row; r<row+word.length(); r++){
				if(c<column+word.length()){
					arr[r][c] = word.substring(i,i+1);
					i++;
					c++;
				}
			}
		}
	
		else
			System.out.println("Invalid");
		
		for(int r = 0; r<arr.length; r++){
			for(int c = 0; c<arr[0].length; c++){
				if(arr[r][c]==(null)){
					int x = (int)(Math.random()*26);
					arr[r][c] = letters[x];
				}
				System.out.print(arr[r][c]);
				}
				System.out.println("");
			}
		}
		
	}