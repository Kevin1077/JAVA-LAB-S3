package sample;

public class Abstractclass {
	public static void main(String[] args) {
		
		Rectangle rectangle=new Rectangle();
		Triangle triangle=new Triangle();
		Hexagon hexagon=new Hexagon();
		
		rectangle.numberofsides();
		triangle.numberofsides();
		hexagon.numberofsides();
		
	}

		
}
abstract class shape{
	
	     void numberofsides() {
	    	 
	     }
}
class Rectangle extends shape{
	
	void numberofsides() {
   	   System.out.println("number of sides of rectangle = 4");
    }
}

class Triangle extends shape{
	
	void numberofsides() {
   	   System.out.println("number of sides of triangle = 3");
    }
}

class Hexagon extends shape{
	
	void numberofsides() {
   	   System.out.println("number of sides of hexagon = 6");
    }
}
