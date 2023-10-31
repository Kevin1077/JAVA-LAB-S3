package sample;

import java.util.Scanner;

public class methodoverloading {
 public static void main(String[]args) {
	 
  Scanner sc=new Scanner(System.in);
	 		Shapes shapes=new Shapes();
	 		
	 		System.out.println("Enter the base and height of triangle");
	 		float base=sc.nextFloat();
	 		float height=sc.nextFloat();
	 		
	 		System.out.println("Enter the length and breadth of rectangle");
	 		int length=sc.nextInt();
	 		int breadth=sc.nextInt();
	 		
	 		System.out.println("Enter the radius of circle");
	 		float radius=sc.nextFloat();
	 		
	 		
	 		
	 		
	 		shapes.Area(base, height);
	 		shapes.Area(length, breadth);
	 		shapes.Area(radius);
	 	}

	 }
	  class Shapes
	 {
	 	double area;
	 	public void Area(float base,float height)
	 	{
	 		
	 		area=base*height*0.5;
	 		System.out.println("area of triangle="+area);
	 	}
	 	public void Area(int length,int breadth)
	 	{
	 		area=length*breadth;
	 		System.out.println("area of rectangle="+area);
	 	}
	 	public void Area(float radius)
	 	{
	 		area=3.14*radius*radius;
	 		System.out.println("area of circle="+area );
	 	}
	 	
	 }
 


