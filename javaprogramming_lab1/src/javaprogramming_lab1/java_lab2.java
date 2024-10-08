
package javaprogramming_lab1;
import java.util.*;
public class java_lab2 {
	
	 static Scanner input=new Scanner (System.in);
	 final double CGPA=3.51;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  name,name1;
		char section;
		String rollNumber;
		double cgpa;
		
System.out.println("MUbashir Saeed Ahmad");
/*
int x=10;
char m='M';
System.out.println("Enter An Integer : ");
x=input.nextInt();
System.out.println("Enter A Character : ");
x=input.next().charAt(0);

System.out.println(x);
System.out.println(m);
System.out.printf("MUbashir");
str=input.next();
System.out.println(str); */

System.out.println("Enter Name: ");
name=input.next();
System.out.println("Enter Section: ");
section=input.next().charAt(0);
System.out.println("Enter Roll NUmber: ");
rollNumber=input.next();
System.out.println("Enter CGPA: ");
cgpa=input.nextDouble();
System.out.println("Enter Name Another : ");
name1=input.next();
name1.compareTo(name);
System.out.println(name);
System.out.println(section);
System.out.println(cgpa);
System.out.println(rollNumber);
	}

}
