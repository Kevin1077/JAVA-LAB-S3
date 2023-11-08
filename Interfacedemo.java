package sample;

interface Flyable{
	public void fly_obj();
}
class Spacecraft implements Flyable{
	public void fly_obj() {
		System.out.println("You are in a spacecraft");
	}
}
class Airplane implements Flyable{
	public void fly_obj() {
		System.out.println("You are in a Airplane");
	}
}
class Helicopter implements Flyable{
	public void fly_obj() {
		System.out.println("You are in a Helicopter");
	}
}
public class Interfacedemo {
	
	public static void main(String[] args) {
		
		Spacecraft spacecraft=new Spacecraft();
		spacecraft.fly_obj();
		Airplane airplane=new Airplane();
		airplane.fly_obj();
		Helicopter helicopter=new Helicopter();
		helicopter.fly_obj();
		
	}

}

