package javaprogramming_lab2;

import java.util.*;

public class Linkedlist_in_java {

	static Scanner input=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> flowers=new LinkedList<>();
		flowers.add("SunFlower");
		flowers.add("Iris");
		flowers.add("Poppy");
		flowers.add("Water Lilies");
		flowers.add("Ballon Flower");
		
		
		  int i=flowers.size();
		    i--;
		   while(i>=0) {
		   System.out.println(flowers.get(i));
		    i--;
			}
		System.out.println(flowers.get(1));
	}

}
