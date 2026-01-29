/*
 *	Author: Cora deRidder
 *  Date: 11/20/25
 * 	Collaborator(s): 
*/

import java.util.*;
import pkg.*;

class starter {
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a difficulty level: 1, 2, or 3");
        int diff = sc.nextInt();
        sc.nextLine();

        if(diff == 1){
            boolean x = true;
            int attempts = 1;
            int yay = 0;
            int nay = 0;
            
            while(x){
                String [] colors = new String[attempts];
                
                System.out.println("---------------------------------------------");
                
                    for(int i = 0; i<attempts; i++){
                        colors[i] = getColorWord();
                }
                printArray(colors);
                
                System.out.println("---------------------------------------------");
                
                System.out.println("Memorize the words above!");
                System.out.print("You have: ");
                delay(5);
                Colors.println();
                Colors.println();
                Colors.println();
                Colors.println();
                Colors.println();
                Colors.println();
                Colors.println();
                Colors.println();
                Colors.println();
                Colors.println();
                Colors.println();
                Colors.println();
                Colors.println();
                Colors.println();
                Colors.println();
                
                System.out.println("Please enter the words that you saw on separate lines!");
                
                    for(int i=0; i<attempts; i++){
                        String ans = sc.nextLine();
                        if(ans.equals(colors[i])){
                            yay++;
                    }
                        else{
                            nay++;
                    }
            }
                    if(nay>0){
                        System.out.println("You got it wrong!");
                        break;
                    }
                    else{
                        System.out.println("You got it! Onto the next level!");
                    }
                attempts++;
            }
    
        }
        else if(diff == 2){
            boolean x = true;
            int attempts = 1;
            int yay = 0;
            int nay = 0;
            
            while(x){
                String [] colors = new String[attempts];
                String [] bg = new String[attempts];
                
                System.out.println("---------------------------------------------");
                
                    for(int i = 0; i<attempts; i++){
                        colors[i] = getColorWord();
                        bg[i] = getColorWord();
                        Colors.println(colors[i],bg[i]);
                }
                
                System.out.println("---------------------------------------------");
                
                System.out.println("Memorize the words above!");
                System.out.print("You have: ");
                delay(5);
                Colors.println();
                Colors.println();
                Colors.println();
                Colors.println();
                Colors.println();
                Colors.println();
                Colors.println();
                Colors.println();
                Colors.println();
                Colors.println();
                Colors.println();
                Colors.println();
                Colors.println();
                Colors.println();
                Colors.println();
                
                int check = (int)(Math.random()*2+1);
                if(check==1){
                System.out.println("Please enter the words that you saw on separate lines!");
                
                    for(int i=0; i<attempts; i++){
                        String ans = sc.nextLine();
                        if(ans.equals(colors[i])){
                            yay++;
                    }
                        else{
                            nay++;
                    }
            }
                    if(nay>0){
                        System.out.println("You got it wrong!");
                        break;
                    }
                    else{
                        System.out.println("You got it! Onto the next level!");
                    }
                attempts++;
                }
                if(check==2){
                System.out.println("Please enter the colors that you saw on separate lines!");
                
                    for(int i=0; i<attempts; i++){
                        String ans = sc.nextLine();
                        if(ans.equals(bg[i])){
                            yay++;
                    }
                        else{
                            nay++;
                    }
            }
                    if(nay>0){
                        System.out.println("You got it wrong!");
                        break;
                    }
                    else{
                        System.out.println("You got it! Onto the next level!");
                    }
                attempts++;
                }
            }
        }
        else if(diff == 3){
            boolean x = true;
            int attempts = 1;
            int yay = 0;
            int nay = 0;
            
            while(x){
                String [] colors = new String[attempts];
                String [] bg = new String[attempts];
                String [] wordColor = new String[attempts];
                
                System.out.println("---------------------------------------------");
                
                    for(int i = 0; i<attempts; i++){
                        colors[i] = getColorWord();
                        bg[i] = getColorWord();
                        wordColor[i] = getColorWord();
                        Colors.println(colors[i], wordColor[i], bg[i]);
                }
                
                System.out.println("---------------------------------------------");
                
                System.out.println("Memorize the words above!");
                System.out.print("You have: ");
                delay(5);
                Colors.println();
                Colors.println();
                Colors.println();
                Colors.println();
                Colors.println();
                Colors.println();
                Colors.println();
                Colors.println();
                Colors.println();
                Colors.println();
                Colors.println();
                Colors.println();
                Colors.println();
                Colors.println();
                Colors.println();
                
                int check = (int)(Math.random()*3+1);
                if(check==1){
                System.out.println("Please enter the words that you saw on separate lines!");
                
                    for(int i=0; i<attempts; i++){
                        String ans = sc.nextLine();
                        if(ans.equals(colors[i])){
                            yay++;
                    }
                        else{
                            nay++;
                    }
            }
                    if(nay>0){
                        System.out.println("You got it wrong!");
                        break;
                    }
                    else{
                        System.out.println("You got it! Onto the next level!");
                    }
                attempts++;
                }
                if(check==2){
                System.out.println("Please enter the colors that you saw on separate lines!");
                
                    for(int i=0; i<attempts; i++){
                        String ans = sc.nextLine();
                        if(ans.equals(wordColor[i])){
                            yay++;
                    }
                        else{
                            nay++;
                    }
            }
                    if(nay>0){
                        System.out.println("You got it wrong!");
                        break;
                    }
                    else{
                        System.out.println("You got it! Onto the next level!");
                    }
                attempts++;
                }
                if(check==3){
                System.out.println("Please enter the background colors that you saw on separate lines!");
                
                    for(int i=0; i<attempts; i++){
                        String ans = sc.nextLine();
                        if(ans.equals(bg[i])){
                            yay++;
                    }
                        else{
                            nay++;
                    }
            }
                    if(nay>0){
                        System.out.println("You got it wrong!");
                        break;
                    }
                    else{
                        System.out.println("You got it! Onto the next level!");
                    }
                attempts++;
                }
            }
        }
        else {
            System.out.println("Wrong number, try again.");
        }
    }

    // This method should take in a String array as a parameter and print out each element in the array.
    public static void printArray(String[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
	}


    // This method can be called to return a random color. This syntax is the correct syntax for the Colors class. 
    public static String getColorWord(){
        int rand = (int)(Math.random()*5);
        switch (rand){
            case 0: return "Purple";
            case 1: return "Red";
            case 2: return "Green";
            case 3: return "Yellow";
            case 4: return "Blue";
            default: return "White";
        }
    }

    // This method can be called to delay for a certain number of seconds.
    // The parameter count represents the number of seconds to delay.
    public static void delay(int count){
        for (int i = 0; i < count; i++) {
			System.out.print(count-i);
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
        }
    }
}
