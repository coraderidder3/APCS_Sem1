/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		//  Create 4 bank accounts with various users and constructors!
		BankAccount a = new BankAccount();
		BankAccount b = new BankAccount("Kaylee");
		BankAccount c = new BankAccount("Abby", 6859.83);
		BankAccount d = new BankAccount("Bob", 1343, 48923.45, true);
	}
}
