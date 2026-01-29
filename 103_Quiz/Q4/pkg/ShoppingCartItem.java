package pkg;
import java.util.*;

public class ShoppingCartItem {
        private String itemName;
		private double itemCost;
		private int quantity;
		public ShoppingCartItem(){
		    itemName = "Nothing";
		    itemCost = 0.0;
		    quantity = 0;
		}
		public ShoppingCartItem(String itemName, double itemCost, int quantity){
		    this.itemName = itemName;
		    this.itemCost = itemCost;
		    this.quantity = quantity;
		}
		//  PART 2 --------------------------------------------
	    public void cartToString(){
	        System.out.println("You have " + quantity + " of " + itemName + " for $" + itemCost + " each.");
	    }
	    
		//  PART 3 --------------------------------------------
		public String getItemName(){
		    return itemName;
		}
		
		public int getQuantity(){
		    return quantity;
		}
		
		public double getTotalCost(){
		    return itemCost*quantity;
		}
		
		public double getTotalWithTax(){
		    double totalTax = getTotalCost()*1.12;
		    return totalTax;
		}
		
		//  PART 4 --------------------------------------------
	    public double quantityToCostCalculator(int amount){
	        double calc = itemCost*amount;
	        return calc;
	    }
	    
		//  PART 5 --------------------------------------------
	    public double getCost(){
	        return itemCost;
	    }
	    
		public boolean compareItemCost(ShoppingCartItem item3){
		    if (itemCost>=item3.getCost()){
		        return false;
		    }
		    else{
		        return true;
		    }
		}
		//  PART 6 --------------------------------------------
		public ShoppingCartItem copyCart(){
            String a = getItemName();
            double b = getCost();
            int c = getQuantity();
            
            return new ShoppingCartItem(a, b, c);
		}
		
}
