package javaprogramming_lab2;

import java.util.Scanner;

public class Arrays_in_java1 {
	
	static Scanner input=new Scanner(System.in);
	
	static String name;
	
	public static void main(String[] args) {
	
		System.out.println("Enter A String : ");
		name=input.nextLine();
		
		int len=name.length();
		char[] ary=new char[len];
		for (int i = 0; i < len; i++) {
            ary[i] = name.charAt(len - i - 1);
        }
		len--;
		while(len>=0) {
			System.out.print(name.charAt(len));
			len--;
		}
		

	}

}
