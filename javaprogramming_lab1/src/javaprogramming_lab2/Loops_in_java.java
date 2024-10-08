package javaprogramming_lab2;

import java.util.*;
public class Loops_in_java {

	static Scanner input=new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		int k=0;
		// loop for printing 
		while(k<10) {
			//System.out.println("Mubashir");
			k++;
		}
		
	

		int m=0;
		boolean found=false;
		while(!found) {
			m++;
			System.out.println("Mubashir");
			if(m==3) {
				found=true;
			}
			
		}
		do {
			System.out.println("SAeed");
			name=input.next();
		} while(name!="ABC");
	
	}

}
