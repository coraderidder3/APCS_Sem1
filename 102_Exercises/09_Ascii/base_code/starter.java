/*
 *	Author: Cora deRidder
 *  Date: 10/2/25
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		//Create a program that takes in a word from the user and prints out an according ascii art!
		//The choices they can choose from are animal, object, or face. If they type anything else, make sure they know!
		System.out.println("Would you like a picture of an animal, object, or face?");
		Scanner sc = new Scanner(System.in);
		String answer = sc.nextLine();
		while((!answer.equals("object"))||(!answer.equals("Object"))||(!answer.equals("animal"))||(!answer.equals("Animal"))||(!answer.equals("face"))||(!answer.equals("Face"))){
				System.out.println("Please choose an animal, object, or face?");
				answer = sc.nextLine();
					if (answer.equals("object")||answer.equals("Object")||answer.equals("animal")||answer.equals("Animal")||answer.equals("face")||answer.equals("Face")){
						break;
					}
		}
		
		if (answer.equals("animal")||answer.equals("Animal")){
			System.out.println(" ");
			System.out.println("                                             XXXXXXXXXXXXX                      ");
			System.out.println("                                          XXXX      XXXXXXXXXX                  ");
			System.out.println("                                         XX         XXXXXXXXXXXX                ");
			System.out.println("                                   XXXXXXX          XXXXXXXXXXXXXX              ");
			System.out.println("                           XXXXXXXXX       XX       XXXXXXXXXXXX X              ");
			System.out.println("                       XXXXXXXX            XX       XXXXXXXXXXXXX XX            ");
			System.out.println("                       XXXXXXX                      XXXXXXXXXXXXXX XX           ");
			System.out.println("                        XXXX                        XXXXXXXXXXXXXX   X          ");
			System.out.println("                           XX             XX        XXXXXXXXXXXXXXX  XX         ");
			System.out.println("                            XX          XXX          XXXXXXXXXXXXXX   X         ");
			System.out.println("                             XXXXXXXXXXXX            XXXXXXXXXXXXXX   XX        ");
			System.out.println("                              XXX                     XXXXXXXXXXXXX    X        ");
			System.out.println("                                 XXX                   XXXXXXXXXXXX  XX         ");
			System.out.println("                                    XXXX               XXXXXXXXXXXXXXX          ");
			System.out.println("                                        XXXXXXX         XXXXXXXXXXX             ");
			System.out.println("                                               XXXXX XXX XXXXXXXX               ");
			System.out.println("                                                          XXXXX                 ");
		}
		else if (answer.equals("object")||answer.equals("Object")){
			System.out.println(" ");
			System.out.println("                         ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓                                    ");
			System.out.println("                    ▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓                               ");
			System.out.println("                  ▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓                             ");
			System.out.println("                  ▓░▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓░░▓  ▓▓▓▓▓▓▓▓                  ");
			System.out.println("                  ▓░░░░░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░░░░░░▓▓▓▓░░░░░░░▓▓                ");
			System.out.println("                  ▓░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▓▓░░░░░░░░░░░▓▓              ");
			System.out.println("                  ▓░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▓░░▓▓▓▓▓░░░░░░▓▓             ");
			System.out.println("                 ▓▓░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▓▓▓    ▓▓▓░░░░░▓▓            ");
			System.out.println("                 ▓░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▓       ▓▓▓░░░░▓            ");
			System.out.println("                 ▓░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▓         ▓░░░░▓▓           ");
			System.out.println("                 ▓▓░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▓▓         ▓░░░░░▓           ");
			System.out.println("                  ▓░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▓▓▓      ▓▓▓░░░░░▓           ");
			System.out.println("                  ▓░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▓░▓▓▓▓▓▓▓▓░░░░░░░▓           ");
			System.out.println("                  ▓▓░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▓▓░░░░░░░░░░░░░░░░▓           ");
			System.out.println("                   ▓░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▓▓▓░░░░░░░░░░░░░▓▓            ");
			System.out.println("                   ▓░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▓ ▓▓▓▓▓▓▓▓▓▓▓▓▓▓              ");
			System.out.println("                   ▓▓░░░░░░░░░░░░░░░░░░░░░░░░░░░░▓▓                             ");
			System.out.println("                    ▓▓▓▓▓░░░░░░░░░░░░░░░░░░░▓▓▓▓▓                               ");
			System.out.println("                         ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓                                    ");
		}
		else if (answer.equals("face")||answer.equals("Face")){
			System.out.println(" ");
			System.out.println("                                     ▓▓▓▓▓▓                                     ");
			System.out.println("                             ▓▓▓▓▓▓▓▓▓    ▓▓▓▓▓▓                                ");
			System.out.println("                         ▓▓▓▓▓                 ▓▓▓▓                             ");
			System.out.println("                   ▒▒▒ ▓▓▓                        ▓▓▓  ▒▒▒▒                     ");
			System.out.println("             ▒▒▒▒▒▒▒▒▒▓▓                            ▓▓▒▒▒▒▒▒▒▒▒▒▒               ");
			System.out.println("          ▒▒▒▒▒▒▒▒▒▒▒▓▓                              ▓▒▒▒▒▒▒▒▒▒▒▒▒              ");
			System.out.println("         ▒▒▒▒▒▒▒▒▒▒ ▓▓        ▓▓           ▓▓         ▓  ▒▒▒▒▒▒▒▒▒▒             ");
			System.out.println("       ▒▒▒▒▒▒▒▒▒▒  ▓▓         ▓▓           ▓▓          ▓    ▒▒▒▒▒▒▒▒▒           ");
			System.out.println("       ▒▒▒▒▒▒▒▒   ▓▓     ░░░░                  ░░░░░   ▓▓    ▒▒▒▒▒▒▒▒           ");
			System.out.println("      ▒▒▒▒▒▒▒     ▓                                     ▓     ▒▒▒▒▒▒▒           ");
			System.out.println("      ▒▒▒▒▒▒      ▓                                     ▓▓       ▒▒▒▒           ");
			System.out.println("      ▒▒▒▒▒       ▓     ▓                        ▓▓      ▓        ▒▒            ");
			System.out.println("       ▒▒         ▓     ▓▓                      ▓▓       ▓                      ");
			System.out.println("                   ▓     ▓▓                     ▓        ▓                      ");
			System.out.println("                   ▓▓     ▓▓▓             ▓▓▓▓▓▓▓       ▓                       ");
			System.out.println("                    ▓▓       ▓▓▓▓▓▓▓▓▓▓▓▓▓             ▓▓                       ");
			System.out.println("                     ▓                               ▓▓                         ");
			System.out.println("                     ▓▓                            ▓▓▓                          ");
			System.out.println("                       ▓▓▓▓▓▓                 ▓▓▓▓▓▓                           ");
			System.out.println("                            ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓                                 ");
		}
		
		
	}
}
