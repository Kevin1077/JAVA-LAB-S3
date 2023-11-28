package sample;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerdemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an integer string:");
		String data=sc.nextLine();
		StringTokenizer input=new StringTokenizer(data); 
		int sum=0;
		System.out.println("The integers are:");
		while(input.hasMoreTokens()) {
			int num=Integer.parseInt(input.nextToken());
			System.out.println(num);
			sum=sum+num;
		}
		System.out.println("Sum is "+sum);
	}

}
