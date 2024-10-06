package a5ih;
class Vehicle{
private String make;
private int year;
public Vehicle() {}
public String getType() {
return make;
}
public void setType(String make) {
this.make = make;
}
public int getYear() {
return year;
}
public void setYear(int year) {
this.year = year;
}
public Vehicle(String make, int year) {
this.make = make;
this.year = year;
}

}
class Car extends Vehicle{
private String model;

public Car() {
	super();
}
public Car(String model) {
super();
this.model = model;
}

public String getModel() {
	return model;
}
public void setModel(String model) {
this.model=model;
}
}
public class Program2 {
public static void main(String[] args) {
Car c=new Car();
c.setType("SUV");
c.setYear(2017);
c.setModel("Vellfire");
System.out.print(c.getModel()+"		"+c.getType()+"		"+c.getYear());
	}

}
