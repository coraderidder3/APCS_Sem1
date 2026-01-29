/*
    Lecture note example - Input!!
*/
import java.util.Scanner;

class LectureInput{
    public static void main(String args[]) {
        // Your Code Goes here!
        Scanner sc = new Scanner(System.in);
        
        double coffeePrice = 4.75;
        double chaiPrice = 5.25;
        double greenTeaPrice = 4.50;
        
        System.out.println("☕️ Welcome to Cora's Coffee Corner! ☕️");
        System.out.println("Here's what we have:");
        System.out.println("1. ☕️ Coffee - $" + coffeePrice);
        System.out.println("2. 🫖 Chai Latte - $" + chaiPrice);
        System.out.println("3. 🍵 Green Tea - $" + greenTeaPrice);
        System.out.println("");
        
        System.out.println("What's the name for your order?");
        String name = sc.nextLine();
        System.out.println();
        
        System.out.println("How many Coffees would you like?");
        int coffeeQuantity = sc.nextInt();
        System.out.println("How many Chai Lattes would you like?");
        int chaiQuantity = sc.nextInt();
        System.out.println("How many Green Teas would you like?");
        int greenTeaQuantity = sc.nextInt();
        System.out.println();
        
        double totalCoffee = coffeePrice*coffeeQuantity;
        double totalChai = chaiPrice*chaiQuantity;
        double totalGreenTea = greenTeaPrice*greenTeaQuantity;
        double currentTotal = totalCoffee+totalChai+totalGreenTea;
        System.out.println("Currently, your total is: $" + currentTotal);
        
        System.out.println("What percent would you like to tip?");
        double tipPercent = sc.nextDouble();
        double tip = currentTotal * (tipPercent/100);
        double grandTotal = tip + currentTotal;
        System.out.println();
        
        System.out.println("------------------------------------");
        System.out.println("🧾 " + name + "'s reciept:");
        System.out.println(coffeeQuantity + " x Coffees = " + totalCoffee);
        System.out.println(chaiQuantity + " x Chai Lattes = " + totalChai);
        System.out.println(greenTeaQuantity + " x Green Teas = " + totalGreenTea);
        System.out.println("Tip (" + tipPercent + ") = $" + tip);
        System.out.println("------------------------------------");
        System.out.println("Grand Total = $" + grandTotal);
        System.out.println("------------------------------------");
        System.out.println("☕️ Thank you for dining at Cora's Coffee Corner!! ☕️");
        
    
        
	}
}
