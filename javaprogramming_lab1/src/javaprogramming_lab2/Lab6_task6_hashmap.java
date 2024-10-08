package javaprogramming_lab2;
import java.util.HashMap;
import java.util.Map;
public class Lab6_task6_hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		        Map<String, Integer> map = new HashMap<>();
		        map.put("a", 10);
		        map.put("b", 5);
		        map.put("c", 15);
		        map.put("d", 1);
//storing max and min possible values 
		        int max = Integer.MIN_VALUE;
		        int min = Integer.MAX_VALUE;
//
		        //iterations for max and min values 
		        for (Integer value : map.values()) {
		            if (value > max) {
		                max = value;
		            }
		            if (value < min) {
		                min = value;
		            }
		        }

		        System.out.println("Maximum value: " + max);
		        System.out.println("Minimum value: " + min);
		    
	}

}
