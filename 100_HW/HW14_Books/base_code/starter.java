/*
 *	Author:Cora deRidder
 *  Date:12/4/25
*/

import java.util.*;
import java.io.*;

class starter {
	public static void main(String args[]) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the file name of one of the text files in the \'books\' folder: (Ex: test.txt)");
		String textFile = sc.nextLine();		// This is one of the files in the 'books' folder. It MUST exist.
		String[] arr = fillArray(textFile);		// Uses the fillArray method that has been built below. This fills the array 'arr' with each word individually in the text file.
		System.out.println();


		/*
			The only time you should use Scanner with (System.in) is within the 'main' method.
			At no point should any other method use Scanner(System.in)
		*/
		while(true){
			System.out.println("What action would you like to take?");
			System.out.println("1. Check text file (file)");
			System.out.println("2. Print the text given (print)");
			System.out.println("3. Print the text backwards (printBack)");
			System.out.println("4. Print a certain number of words (printNum)");
			System.out.println("5. Change the text file (change)");
			System.out.println("6. Check the number of words in a text (check)");
			System.out.println("7. Most common word (common)");
			String choice = sc.nextLine();
			System.out.println();

			if(choice.equals("file")){
				System.out.println(textFile);
			}
			else if(choice.equals("print")){
				printsArray(arr);
			}
			else if(choice.equals("printBack")){
				printsArrayBack(arr);
			}
			else if(choice.equals("printNum")){
				System.out.println("How many words would you like to print out?");
				int num = sc.nextInt();
				printsNumber(arr,num);
			}
			else if(choice.equals("change")){
				System.out.println("Please enter the file name of one of the text files in the \'books\' folder: (Ex: test.txt)");
				textFile = sc.nextLine();		// This is one of the files in the 'books' folder. It MUST exist.
				arr = fillArray(textFile);		// Uses the fillArray method that has been built below. This fills the array 'arr' with each word individually in the text file.
				System.out.println();
			}
			else if(choice.equals("check")){
				System.out.println("What word do you want to find?");
				String word = sc.nextLine();
				System.out.println("'" + word + "'" + " occurs " + checksArray(arr,word) + " number of times." );
			}
			else if(choice.equals("common")){
				System.out.println("The most common word is: " + mostCommon(arr));
				
			}

			System.out.println("----------");
			
		}
	}
	//
		public static void printsArray(String[] arr){
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
	//
	public static void printsArrayBack(String[] arr){
		for(int i=arr.length-1; i>=0; i--){
			System.out.print(arr[i] + " ");
		}
	}
	//
	public static void printsNumber(String[] arr, int num){
		if(num>=arr.length){
			System.out.println("Please choose a smaller number");
		}
		for(int i=0; i<num; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
	}
	//
	public static int checksArray(String[] arr, String check){
		int total = 0;
		for(int i=0; i<arr.length; i++){
			if(arr[i].equals(check)){
				total++;
			}
		}
		return total;
	}


	/* ---------------------------------------------------------------------------------------
		The mostCommon method finds the most common word in the given array.
		It returns the String of the most common word.
		This is a harder method but is doable!
		Do this one last!
	*/
	public static String mostCommon(String[] arr){
		String [] words = new String[arr.length];
		int [] counter = new int[arr.length];
		words[0]=arr[0];
		counter[0]=1;
		for(int i = 0; i<arr.length; i++){
			for(int j = 0; j<arr.length-1; j++){
				if(arr[i].equals(words[j])){
					counter[j]=counter[j]++;
				}
				else{
					counter[j+1]=1;
					words[j+1] = arr[i];
				}
			}
		}
		
		int max=0;
		int commonI=0;
		for(int i=0; i<counter.length; i++){
			if(counter[i]>max){
				max=counter[i];
				commonI=i;
			}
		}
		
		return words[max];
	}




	// ---------------------------------------------------------------------------------------
	/*
		The fillArray method returns an array filled of all of the words in a given text file (String).
		Each word is slotted into its own index in the array.
		The array length is the number of words in the text file.
		A precondition is that "String args" must be a valid .txt file stored in the "books" folder.
	*/
	public static String[] fillArray(String arg) throws FileNotFoundException {
		File text = new File("./books/" + arg);
		Scanner sc = new Scanner(text);
		int lineNumber = 0;
		while(sc.hasNext()){
			sc.next();
			lineNumber++;
		}

		String[] arr = new String[lineNumber];
		sc = new Scanner(text);
		for(int i = 0; i < lineNumber; i++){
			arr[i] = sc.next();
        }
		return arr;
	}

}
