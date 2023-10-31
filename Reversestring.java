package sample;

import java.util.Scanner;

public class Reversestring {
	
	public static void main(String[]args) {
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter a string");
	String name=sc.next();
	int j=0;
	char []a=name.toCharArray();
	char[]b=new char[30];
	int length=name.length();
	 
	for(int i=0;i<length;i++) {
		
		b[j]=a[length-i-1];
		j++;
	}
	
for(int i=0;i<length;i++) {
		System.out.print(b[i]);
	}
	
	}
	
	   

	}
	


