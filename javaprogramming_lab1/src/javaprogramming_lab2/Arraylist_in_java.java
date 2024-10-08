package javaprogramming_lab2;


import java.util.*;

public class Arraylist_in_java {

	static Scanner input=new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayList<String> fruits=new ArrayList<String>();

    fruits.add("Apple");
    fruits.add("Orange");
    fruits.add("Mango");
    fruits.add("Watermelon");
    fruits.add("Banana");
    fruits.add(0,"Grape");
    fruits.set(4, "strawberry");
    fruits.addLast("Pineapple");;
    int i=fruits.size();
    i--;
   while(i>=0) {
   System.out.println(fruits.get(i));
    i--;
	}
    
   System.out.println(fruits.get(1));
	}

}
