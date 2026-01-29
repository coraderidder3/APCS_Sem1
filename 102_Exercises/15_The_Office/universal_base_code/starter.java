/*
 *	Author: Cora deRidder
 *  Date: 10/22/25
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.employeeToString();
		michael.raiseSalary(10);
		System.out.println("Annual income: " + michael.getAnnualSalary());
		
		Employee dwight = new Employee(1987, "Dwight", "Schrute", 4416.66);
		dwight.employeeToString();
		dwight.raiseSalary(20);
		System.out.println("Annual income: " + dwight.getAnnualSalary());
		
		
		Employee jim = new Employee(2474, "Jim", "Halpert", 4416.66);
		jim.employeeToString();
		jim.raiseSalary(38);
		System.out.println("Annual income: " + jim.getAnnualSalary());
		
		Employee pam = new Employee(2011, "Pam", "Beesly", 2250);
		pam.employeeToString();
		pam.raiseSalary(87);
		System.out.println("Annual income: " + pam.getAnnualSalary());
		
		Employee kaylee = new Employee(2283, "Kaylee", "Kook", 4416.66);
		kaylee.employeeToString();
		kaylee.raiseSalary(98);
		System.out.println("Annual income: " + kaylee.getAnnualSalary());
	}
}
