package a5ihp5;
abstract class Vehicle{
	public void startEngine() {
		System.out.println("starting engine");
	}
	public void stopEngine() {
		System.out.println("stopping engine");
	}
}
class Car extends Vehicle{
	@Override
	public void startEngine() {
		System.out.println("starting car");
	}
	@Override
	public void stopEngine() {
		System.out.println("stopping car");
	}
}
class Motorcycle extends Vehicle{
	@Override
	public void startEngine() {
		System.out.println("starting motorcycle");
	}
	@Override
	public void stopEngine() {
		System.out.println("stopping motorcycle");
	}
}
public class Program5 {
public static void main(String[] args) {
Car c=new Car();
Motorcycle m=new Motorcycle();
c.startEngine();c.stopEngine();
m.startEngine();m.stopEngine();
	}

}
