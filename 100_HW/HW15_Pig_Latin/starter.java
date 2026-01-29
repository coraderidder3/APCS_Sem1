/*
   * Author: Cora deRidder
   * Date: 12/12/25
*/

import java.util.Scanner;
class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a sentence:");
		String str = sc.nextLine();
		String pig = "";
		String last = "";
		
		while(str.indexOf(" ")!=-1){
			int space = str.indexOf(" ");
			String word = str.substring(0, space);
			
			if(word.substring(0,1).equals("b") || word.substring(0,1).equals("c") || word.substring(0,1).equals("d") || word.substring(0,1).equals("f")|| word.substring(0,1).equals("g")|| word.substring(0,1).equals("h")|| word.substring(0,1).equals("j")|| word.substring(0,1).equals("k")|| word.substring(0,1).equals("l") || word.substring(0,1).equals("m")|| word.substring(0,1).equals("n")|| word.substring(0,1).equals("p")|| word.substring(0,1).equals("q")|| word.substring(0,1).equals("r")|| word.substring(0,1).equals("s")|| word.substring(0,1).equals("t")|| word.substring(0,1).equals("v")|| word.substring(0,1).equals("w")|| word.substring(0,1).equals("x")|| word.substring(0,1).equals("y")|| word.substring(0,1).equals("z")){
				if(word.substring(1,2).equals("a") || word.substring(1,2).equals("e") || word.substring(1,2).equals("i")|| word.substring(1,2).equals("o")|| word.substring(1,2).equals("u")){
					word = word.substring(1) + "-" + word.substring(0,1) + "ay";
				}
				else{
					word = word.substring(2) + "-" + word.substring(0,2) + "ay";
				}
			}
			else{
				word = word + "-way";
			}
			
			str = str.substring(space+1);
			pig = pig +" "+ word;
		}
		
		if(str.substring(str.length()-1).equals("!")||str.substring(str.length()-1).equals("?")||str.substring(str.length()-1).equals(".")){
			last = str.substring(str.length()-1);
			str = str.substring(0,str.length()-1);
		}
		
		if(str.substring(0,1).equals("b") || str.substring(0,1).equals("c") || str.substring(0,1).equals("d") || str.substring(0,1).equals("f")|| str.substring(0,1).equals("g")|| str.substring(0,1).equals("h")|| str.substring(0,1).equals("j")|| str.substring(0,1).equals("k")|| str.substring(0,1).equals("l") || str.substring(0,1).equals("m")|| str.substring(0,1).equals("n")|| str.substring(0,1).equals("p")|| str.substring(0,1).equals("q")|| str.substring(0,1).equals("r")|| str.substring(0,1).equals("s")|| str.substring(0,1).equals("t")|| str.substring(0,1).equals("v")|| str.substring(0,1).equals("w")|| str.substring(0,1).equals("x")|| str.substring(0,1).equals("y")|| str.substring(0,1).equals("z")){
			if(str.substring(1,2).equals("a") || str.substring(1,2).equals("e") || str.substring(1,2).equals("i")|| str.substring(1,2).equals("o")|| str.substring(1,2).equals("u")){
				str = str.substring(1) + "-" + str.substring(0,1) + "ay";
			}
			else{
				str = str.substring(2) + "-" + str.substring(0,2) + "ay";
			}
		}
		else{
				str = str + "-way";
			}
		
		System.out.println("Here is your sentence in pig latin!");
		System.out.print(pig +" "+ str + last);
		
	}
}
