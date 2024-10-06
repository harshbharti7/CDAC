package com.java.A3;
import java.util.*;
import java.lang.*;
class tollBoothRevenueManager{
Scanner sc=new Scanner(System.in);
private String vehicle;
private int carToll;
private int truckToll;
private int bikeToll;
private int nCars;
private int nMotorcylces;
private int nTrucks;
private int revenue;

public void acceptRecord() {
System.out.print("Enter number of cars: ");
nCars=sc.nextInt();
System.out.print("Enter number of trucks: ");
nTrucks=sc.nextInt();
System.out.print("Enter number of motorcylces: ");
nMotorcylces=sc.nextInt();
}
public void setTollRates() {
System.out.print("Enter toll amount for cars: ");
carToll=sc.nextInt();
System.out.print("Enter toll amount for bikes: ");
bikeToll=sc.nextInt();
System.out.print("Enter toll amount for truck: ");
truckToll=sc.nextInt();
}
public void calculateRevenue() {
revenue=(nCars*carToll)+(bikeToll*nMotorcylces)+(nTrucks*truckToll);
}
Currency c=Currency.getInstance("INR");
public void printRecord() {
System.out.println("Total toll amount is "+c.getSymbol()+revenue);
}

}
public class Program5 {
public static void main(String[] args) {
tollBoothRevenueManager t1=new tollBoothRevenueManager();
t1.acceptRecord();
t1.setTollRates();
t1.calculateRevenue();
t1.printRecord();

	}

}
