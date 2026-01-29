import java.util.*;
import java.io.*;

class starter {
	public static void main(String args[]) throws Exception {
		//Creating File instance to reference text file in Java
        File text = new File("./passwords.txt");			// This file must be in the same folder as your java/class files.
     
        //Creating Scanner instance to read File in Java
        Scanner numLines = new Scanner(text);			// Scanner for counting number of lines
        Scanner sc = new Scanner(text);					// New Scanner for taking in the lines.
     
	 	// Count number of lines in text file.
		int count = 0; 
        while(numLines.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
			numLines.nextLine();
            count++;
        }  
		
		String [] passwords = new String[count];		// This is the array you will be using.

        //Reading each line of the file using Scanner class
		int j = 0;
        while(sc.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
            String line = sc.nextLine();
            passwords[j] = line;
			j++;
        }  

		/* ----------------------------------------------------------------------------------------- */
		// Start here, use the array passwords

        int one = 0;//8+ chars
        int two = 0;//!@#$%^&* chars
        int three = 0;//both
        int none = 0;
		for(int i=0; i<passwords.length; i++){
		    if(passwords[i].length()>=8){
		        if(passwords[i].contains("!")||passwords[i].contains("@")||passwords[i].contains("#")||passwords[i].contains("$")||passwords[i].contains("%")||passwords[i].contains("^")||passwords[i].contains("&")||passwords[i].contains("*")){
		            three++;
		        }
		        else{
		            one++;
		        }
		    }
		    else if(passwords[i].contains("!")||passwords[i].contains("@")||passwords[i].contains("#")||passwords[i].contains("$")||passwords[i].contains("%")||passwords[i].contains("^")||passwords[i].contains("&")||passwords[i].contains("*")){
		        two++;
		}
		else{
		    none++;
		}
	}
	    System.out.println("There are "+ one +" passwords of strength 1 with 8 or more characters");
	    System.out.println("There are "+ two +" passwords of strength 2 with a sepcial symbol");
	    System.out.println("There are "+ three +" passwords of strength 3 with both strength 1 and 2");
	    System.out.println("There are "+ none +" passwords with no strength");
}
}
