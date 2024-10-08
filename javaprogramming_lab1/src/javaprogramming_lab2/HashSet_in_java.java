package javaprogramming_lab2;

import java.util.*;
public class HashSet_in_java {

	public static void main(String[] arr) {
		
		HashSet<String> colors=new HashSet<>();
		colors.add("Black");
		colors.add("White");
		colors.add("Yellow");
		colors.add("Red");
		colors.add("Green");

		colors.add("Pink");
		colors.add("Brown");
		colors.add("Blue");
		
		if(colors.contains("Pink")) {
			System.out.println("Pink Is Exist in HashSet");
		}
		else {
			System.out.println("Pink Is NOt Exist in HashSet");
		}
		
		if(colors.contains("Red")) {
			System.out.println("RED Is Exist in HashSet");
		}
		else {
			System.out.println("Red Is NOt Exist in HashSet");
		}
		
		if(colors.contains("Mubashir")) {
			System.out.println("Mubashir Is Exist in HashSet");
		}
		else {
			System.out.println("Mubashir Is NOt Exist in HashSet");
		} colors.clear();
	}
	
	
}
