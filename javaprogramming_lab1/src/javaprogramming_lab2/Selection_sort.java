package javaprogramming_lab2;

import java.util.*;
public class Selection_sort {

	static Scanner input=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int size;
System.out.print("Enter Size of Arry : ");
size=input.nextInt();
		int[] selectionSort=new int[size];
	 	
		System.out.print("Enter Elements of Arry : ");
	for(int i=0;i<size;++i) {
		selectionSort[i]=input.nextInt();	
		}
		
		for(int i=0;i<size;++i) {
			int min_index=i;
			for(int j=i+1;j<size;j++) {
				if(selectionSort[min_index]>selectionSort[j]) {
					min_index=j;
				}
			}
			if(min_index!=i) {
				int a=selectionSort[min_index];
				selectionSort[min_index]=selectionSort[i];
				selectionSort[i]=a;
			}
		}
		
		for(int i=0;i<size;++i) {
			System.out.print(selectionSort[i]);	
			System.out.print(" ");
		}
		
	}

}
