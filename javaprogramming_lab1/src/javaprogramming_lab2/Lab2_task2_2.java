package javaprogramming_lab2;

import java.io.*;
import java.util.*;
public class Lab2_task2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File object=new File("task2.txt");
		try {
			if(object.createNewFile()) 
				
			System.out.println("File Created" + object.getName());
		else {
			System.out.println("File Already Exixit "+object.getName());
		}
			
			//creating files and reading and writing objects 
			FileWriter writeInFile=new FileWriter("task2.txt");
			File readFromFile=new File("task2.txt");
			FileReader f_reader=new FileReader("task2.txt");
			BufferedReader b_reader=new BufferedReader(f_reader);
			
			//iterations for the writing in the file line by line
			int i=1;
			while(i<=10) {
			writeInFile.write(i+"\n");
			i++;
			}
			writeInFile.close();
			System.out.println("Some Integers Are Succeclfuly Written in the File.");
			
			// finding the sum of odd and even elements 
			int j, oddSum = 0, evenSum = 0;
			String line;
			while ((line = b_reader.readLine()) != null) {
			    j = Integer.parseInt(line);
			    if (j % 2 == 0) {
			        evenSum += j;
			    } else {
			        oddSum += j;
			    }
			    System.out.println("Read integer: " + j);
			}

			b_reader.close(); // Close the BufferedReader

			// Now reopen the writer in append mode
			writeInFile = new FileWriter("task2.txt", true); // open in append mode
			writeInFile.write("OddSum : " + oddSum + " EvenSum : " + evenSum + "\n");
			writeInFile.close(); // close the writer
			System.out.println("Odd Numbers Sum is " + oddSum + "\nEven Numbers Sum is : " + evenSum);

		}catch(IOException a) {
			System.out.println("An Error Occcure!");
			a.printStackTrace();
		}

	}

}
