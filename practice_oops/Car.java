package practice_oops;

public class Car  extends Vehicle{
	int numGears;
	boolean isConvertible;
	public Car() {
		
	}
	
	public Car(int numGears,int maxSpeed) {
		super(100);
		this.numGears=numGears;
		System.out.println("Car Constructor");
	}
	
	public void print() {
		super.print();
//		System.out.println("Car color : " + color);
//		System.out.println("Car Speed : " + getMaxSpeed());
		System.out.println("Car numGears : " + numGears);
		System.out.println("Car isConvertible : " + getMaxSpeed());
	}

}
