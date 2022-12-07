package practice_oops;

public class Vehicle {
	String color;
	private int  maxSpeed;
	
	public Vehicle() {
		System.out.println("Vehicle constructor");
		
	}
	
	public Vehicle(int maxSpeed ) {
		this.maxSpeed=maxSpeed;
		System.out.println("Vehicle constructor");
		
	}
	
	public int getMaxSpeed() {
		return maxSpeed;
	}
	
	public void setMaxSpeed(int maxSpeed) {
     		this.maxSpeed= maxSpeed;
	}
	
	public void print() {
		System.out.println("Vehicle color : " + color);
		System.out.println("Vehicle Speed : " + maxSpeed);
	}

	}
