package javaprogramming_lab2;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.*;

public class Lab2_task6_max_min {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      LinkedList<Integer> a=new LinkedList<>();
      a.add(1);
      a.add(2);
      a.add(3);
      a.add(10);
      a.add(-1);
      //function call
      max(a);
      
    }
    
  //function for finding and displaying max and min values 
    public static void max(LinkedList<Integer> a) {
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
