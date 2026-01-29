/* 
    Lecture note example - Methods
*/
import java.util.Scanner;
class LectureMethod{
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Number #1: ");
       int num1 = sc.nextInt();
       System.out.println("Number #2: ");
       int num2 = sc.nextInt();
       
       System.out.println(" ");
       
       System.out.println(squared(num1));
       int num2Squared = squared(num2);
       System.out.println(num2Squared);
       
       System.out.println(absolute(num1));
       int num2Absolute = absolute(num2);
       System.out.println(num2Absolute);
	}
	public static int squared(int a){
	  int answer=  a * a;
	  return answer;
	}
	public static int absolute(int a){
	    if (a>1){
	        return a;
	    }
	    else if (a<01){
	        return a * (-1);
	    }
	    return a;
	}
}