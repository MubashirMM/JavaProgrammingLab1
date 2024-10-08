package javaprogramming_lab2;

import java.io.*;
import java.util.*;
public class Lab2_task2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    File obj1=new File("studentData.txt");
try {
	if(obj1.createNewFile())
		System.out.println("File Created : "+ obj1.getName());
	else 
		System.out.println("File Already Exixt : "+ obj1.getName());
   } 
catch(IOException e) {
	   System.out.println("An Error Occured");
	   e.printStackTrace();
   }

try {
      FileWriter write =new FileWriter("studentData.txt");
      write.write("MUhammad MUbashir Saeed Ahmad");
      write.write("File pd student record ");
      write.close();
   }  catch(IOException e) {
	   System.out.println("An Error Occured");
	   e.printStackTrace();
}  

try {
 Scanner read=new Scanner(obj1);

String data;
int i=1;
while(read.hasNextLine()) {
data=read.nextLine();
System.out.print(data);
}
} catch(IOException e) {
	   System.out.print("An Error Occured");
	   e.printStackTrace();
}
	} 

}
