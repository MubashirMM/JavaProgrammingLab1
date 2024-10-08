package javaprogramming_lab2;

import java.util.*;
public class Hashmap_java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> birds=new HashMap<>();
		birds.put(1,"Sparrow");
		birds.put(2,"Swallow");
		birds.put(4,"Duck");
		birds.put(5,"Parrot");
		birds.put(3,"Pigeon");
		birds.put(6,"WoodPecker");
		birds.put(7,"Crane");
		birds.put(8,"TailorBird");
		
	
		System.out.println(birds.containsValue("WoodPecker"));
		System.out.println(birds.replace(2, "GoldFich"));
		
		
		  int i=birds.size();
		   
		   while(i>=1) {
		   System.out.println(birds.get(i));
		    i--;
			}
	}

}
