package javaprogramming_lab2;

import java.util.*;

public class lab2Examples {

	static Scanner abc=new Scanner (System.in);
	
 public static void main(String[] argu) {
	 char grade;
	 System.out.println("Enter Grade : ");
	 grade=abc.next().charAt(0);
	 switch(grade) {
	 case 'A':
		 System.out.println("Enter Grade A : ");
		 break;
	 case 'B':
		 System.out.println("Enter Grade B : ");
		 break;
	 default:
		 System.out.println("Enter corrrect one ");
		 break;
	 }
	 
 }
 
}
	 