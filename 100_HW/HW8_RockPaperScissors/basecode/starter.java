/*
 *	Author: Cora deRidder
 *  Date:10/17/25
 *	Collaborator(s):
*/

import java.util.Scanner;

class starter {
    public static void main(String[] args) {
        System.out.println("Welcome to rock, paper, scissors!");
        String play = ("yes");
        while (play.equals("yes")||play.equals("Yes")||play.equals("y")||play.equals("Y")||play.equals("no")||play.equals("No")||play.equals("N")||play.equals("n")){
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("Would you like to play against the computer? (yes/no/done)");
        Scanner sc = new Scanner(System.in);
        play = sc.nextLine();
            if (play.equals("yes")||play.equals("Yes")||play.equals("y")||play.equals("Y")){
                System.out.println("-----------------------------------------------------------------------------------");
                System.out.println("Rock, paper, or scissors?");
                String player = sc.nextLine();
               
                if ((!player.equals("rock"))||(!player.equals("paper"))||(!player.equals("scissors"))){
                        System.out.println("Please pick rock, paper, or scissors.");
                        player = sc.nextLine();
                    }
                String comp = getObject();
                int result = compare2(player,comp);
                    if (result==0){
                        System.out.println("Looks like you guys tied!");
                    }
                    else if (result==1){
                        System.out.println("Yay! You won!");
                    }
                    else {
                        System.out.println("You lost, better luck next time!");
                    }
            }
            
            else if (play.equals("no")||play.equals("No")||play.equals("N")||play.equals("n")){
                System.out.println("-----------------------------------------------------------------------------------");
                System.out.println("How many times would you like the computer to play itself?");
                int compPlay = sc.nextInt();
                sc.nextLine();
                String comp1 = " ";
                String comp2 = " ";
                int result = 0;
                int tie = 0;
                int comp1Wins = 0;
                int comp2Wins = 0;
                    while (result!=compPlay){
                        comp1 = getObject();
                        comp2 = getObject();
                        int game = compare2(comp1,comp2);
                            if (result==0){
                                tie=tie++;
                            }
                            else if(result==1){
                                comp1Wins=comp1Wins++;
                            }
                            else{
                                comp2Wins=comp2Wins++;
                            }
                        }
                System.out.println("Here are the results:");
                System.out.println("Ties: " + tie);
                System.out.println("Computer #1 Wins: " + comp1Wins);
                System.out.println("Computer #2 Wins: " + comp2Wins);
            }
            else {
                break;
            }
        }
        System.out.println("Thanks for playing!");
    }
    
    public static String getObject(){
        int computer = (int)(Math.random()*3+1) ;
            if (computer==1){
                return ("rock"); //rock
            }
            else if (computer==2){
                return ("paper"); //paper
            }
            else {
                return ("scissors"); //scissors
            }
        }
    
    public static int compare2(String player, String comp){
        if ((player.equals("rock")&&comp.equals("rock"))||(player.equals("paper")&&comp.equals("paper"))||(player.equals("scissors")&&comp.equals("scissors"))){
            return 0;
        }
        else if ((player.equals("rock")&&comp.equals("scissors"))||(player.equals("scissors")&&comp.equals("paper"))||(player.equals("paper")&&comp.equals("rock"))){
            return 1;
        }
        else {
            return 2;
        }
    }
        
}
