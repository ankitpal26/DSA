package practice_oops;

public class VehicleUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Vehicle v = new Vehicle();
//		v.setMaxSpeed(100);
//		v.color="Black";
////		v.print();
		Vehicle v= new Car(10,20);
		
		Car c=new Car(10,20);
//		c.numGears=10;
		c.color = "Black";
		c.setMaxSpeed(100);
//        c.print();
//        c.printCar();
	}

}
