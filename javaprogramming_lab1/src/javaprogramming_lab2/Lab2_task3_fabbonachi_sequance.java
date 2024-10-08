package javaprogramming_lab2;

public class Lab2_task3_fabbonachi_sequance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=5;
int n2=function(n,0,1);
System.out.println(n+" Term Is : "+n2);
	}
	
	//recursion approch for fabbaonachi sequance
	public static int function(int n,int n1,int n2) {
		if(n<0)
		    return n1;
		if(n==1) 
			return n2; 

		int n3=n1+n2;
		return function(n-1,n2,n3);
		
	} 

}
