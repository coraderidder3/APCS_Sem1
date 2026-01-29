/*
 *	Author:  Cora deRidder
 *  Date: 10/14/25
*/

import java.io.*;
import java.util.*;
import java.time.*;
import java.time.format.*;

class starter {
	static long startTime = 0;
	static ArrayList<String> arr = new ArrayList<String>();

	public static void main(String args[]) throws InterruptedException {
		System.out.println("Welcome to Type Quest!");
		System.out.println("It is currently " + getTime() + ", and we are ready to play!");
		System.out.println("You will be given a sentence, and you must type it as fast as possible.");
		System.out.println("----------------------------------------------------------------------------");
		int play = 0;
		while (play < 3){
		System.out.println("Would you like to:");
		System.out.println("1 - play random");
		System.out.println("2 - play set");
		System.out.println("3 - quit");
		Scanner sc = new Scanner(System.in);
		play = sc.nextInt();
		sc.nextLine();
		
		if (play == 1){
			System.out.println(" ");
			System.out.println("You have selected a random sentence.");
			System.out.println("----------------------------------------- Your sentence is -------------------------------------------");
			String sent = getSentence();
			System.out.println(sent);
			System.out.println("------------------------------------------------------------------------------------------------------");
			System.out.println(" ");
			countdown();
			startTimer();
			String ans = sc.nextLine();
			System.out.println(" ");
			endTimer();
			System.out.println("Nice job! Here are your results!");
			System.out.println("Time: " + endTimer());
			System.out.println("Errors: " + compareSentences(ans,sent) + " / " + lettersInSentence(sent));
			double letterMins = ((lettersInSentence(sent) / endTimer())*60);
			System.out.println("Letters per min: " + letterMins);
			double wordMins = ((wordsInSentence(sent) / endTimer())*60);
			System.out.println("Words per min: " + wordMins);
			System.out.println("------------------------------------------------------------------------------------------------------");
		
		}
		else if (play == 2){
			System.out.println(" ");
			System.out.println("You have selected a set sentence, which one would you like to play? (1-100)");
			int sentNum = sc.nextInt();
			sc.nextLine();
			System.out.println("----------------------------------------- Your sentence is -------------------------------------------");
			String sent = getSentence(sentNum);
			System.out.println(sent);
			System.out.println("------------------------------------------------------------------------------------------------------");
			System.out.println(" ");
			countdown();
			startTimer();
			String ans = sc.nextLine();
			System.out.println(" ");
			endTimer();
			System.out.println("Nice job! Here are your results!");
			System.out.println("Time: " + endTimer());
			System.out.println("Errors: " + compareSentences(ans,sent) + " / " + lettersInSentence(sent));
			double letterMins = ((lettersInSentence(sent) / endTimer())*60);
			System.out.println("Letters per min: " + letterMins);
			double wordMins = ((wordsInSentence(sent) / endTimer())*60);
			System.out.println("Words per min: " + wordMins);
			System.out.println("------------------------------------------------------------------------------------------------------");
			
		}
		}
		System.out.println("Thanks for playing!");

		
	}

	// This method returns the local current time as a String
	public static String getTime(){
		LocalTime now = LocalTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("hh:mm:ss a");
        return now.format(format);
	}

	// This method starts a clock that can be used throughout the program
	public static void startTimer(){
		startTime = System.nanoTime();
	}

	// This method stops the timer clock and returns a double of the seconds and milliseconds of the stopwatch
	public static double endTimer() throws InterruptedException{
		long endTime = System.nanoTime();
		long timeSeconds = ((endTime - startTime)/1000000);
		double decSeconds = timeSeconds/1000.0;
		return decSeconds;
	}

	// This method does a 3 second countdown and prints it to the terminal
	public static void countdown(){
		System.out.println("Starting countdown...");
		for (int i = 0; i < 3; i++) {
			System.out.println(3-i);
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		System.out.println("Go!");
	}

	// This method sets up a list of sentences to be called from. 
	// This should only be called once prior to getting sentences.
	private static void populateArrayList(){
		File f = new File("sentences.txt");
		try(Scanner fsc = new Scanner(f)){
			while(fsc.hasNextLine()){
				arr.add(fsc.nextLine());
			}
		}
		catch(FileNotFoundException e){
			System.err.println("File not found: " + e.getMessage());
		}
	}

	// This chooses 1 of the 100 sentences in the list to return.
	public static String getSentence(){
		populateArrayList();
		int rand = (int)(Math.random()*100);
		return arr.get(rand);
	}

	// This returns the same sentence for the same integer given.
	public static String getSentence(int index){
		populateArrayList();
		return arr.get(index%100);
	}

	//  This returns the number of letters, spaces, and punctuations in a sentence.
	public static int lettersInSentence(String sent){
		return sent.length();
	}
	
	// This returns the number of words in a sentence
	public static int wordsInSentence(String sent){
		int spaceCount = 0;
		while(sent.indexOf(" ") > -1){
			spaceCount++;
			sent = sent.substring(sent.indexOf(" ")+1);
		}
		return ++spaceCount;
	}

	// This method does a letter by letter comparison of each word and returns the number of errors.
	public static int compareSentences(String given, String typed){
		int errors = 0;
		while(given.length() > 0 && typed.length() > 0){
			if(!given.substring(0,1).equals(typed.substring(0,1)))
				errors++;
			given = given.substring(1);
			typed = typed.substring(1);
		}
		return errors;
	}

}
