package javaprogramming_lab2;

import java.util.*;
public class Lab6_task6_HasSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> set=new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		ArrayList<Integer> list=new ArrayList<>(set);
		//function call 
	   max1(list);	
	}
	
	//function for finding and displaying max and min values 
	  public static void max1(ArrayList<Integer> a) {
	    	int b=a.get(0);
	    	int c=a.get(0);
	    	int l=a.size();
	    	for(int i=0;i<l;) {
	    		if(b<a.get(i))
	    		b=a.get(i);
	    		if(c>a.get(i))
	    		c=a.get(i);
	    		i++;
	    	}
	    	System.out.println("Max "+b+" min : "+c);
}
}