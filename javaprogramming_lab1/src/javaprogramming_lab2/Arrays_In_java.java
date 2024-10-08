package javaprogramming_lab2;

import java.util.Scanner;

public class Arrays_In_java {
	
	static Scanner input=new Scanner(System.in);
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] twoDArray=new int[2][3];
		
		//data input loops
		for(int i=0;i<2;++i) {
			for(int j=0;j<3;j++) {
				twoDArray[i][j]=input.nextInt();
			}
		}
		
		//data printing loops
				for(int i=1;i>=0;--i) {
					for(int j=2;j>=0;j--) {
						System.out.print(twoDArray[i][j]);
						System.out.print(" ");
						
					}System.out.println();
					
				}
				
				int number; 
				number=input.nextInt();
				//data search loops
				for(int i=0;i<2;++i) {
					for(int j=0;j<3;j++) {
						if(number==twoDArray[i][j]) {
							System.out.printf("Number Found : ");
							System.out.println(twoDArray[i][j]);
						return; 
						}
					}
				}
				}
	}


