package com.java.A3GS;

import java.util.Currency;
import java.util.Scanner;

class TollBoothRevenueManager{
private int nCar;
private int nTruck;
private int nMotorcycle;
private int carToll;
private int truckToll;
private int motorcycleToll;
public TollBoothRevenueManager() {
	
}

public TollBoothRevenueManager(int nCar, int nTruck, int nMotorcycle, int carToll, int truckToll, int motorcycleToll) {

	this.nCar = nCar;
	this.nTruck = nTruck;
	this.nMotorcycle = nMotorcycle;
	this.carToll = carToll;
	this.truckToll = truckToll;
	this.motorcycleToll = motorcycleToll;
}

public int getnCar() {
	return nCar;
}

public void setnCar(int nCar) {
	this.nCar = nCar;
}

public int getnTruck() {
	return nTruck;
}

public void setnTruck(int nTruck) {
	this.nTruck = nTruck;
}

public int getnMotorcycle() {
	return nMotorcycle;
}

public void setnMotorcycle(int nMotorcycle) {
	this.nMotorcycle = nMotorcycle;
}

public int getCarToll() {
	return carToll;
}

public void setCarToll(int carToll) {
	this.carToll = carToll;
}

public int getTruckToll() {
	return truckToll;
}

public void setTruckToll(int truckToll) {
	this.truckToll = truckToll;
}

public int getMotorcycleToll() {
	return motorcycleToll;
}

public void setMotorcycleToll(int motorcycleToll) {
	this.motorcycleToll = motorcycleToll;
}

@Override
public String toString() {
	return "TollBoothRevenueManager [nCar=" + nCar + ", nTruck=" + nTruck + ", nMotorcycle=" + nMotorcycle
			+ ", carToll=" + carToll + ", truckToll=" + truckToll + ", motorcycleToll=" + motorcycleToll + "]";
}

public int CalculateTollRevenue() {
return nCar*carToll+(nTruck*truckToll)+(nMotorcycle*motorcycleToll);
}
}
class TollBoothRevenueManagerUtil{
Currency c=Currency.getInstance("INR");
TollBoothRevenueManager util=new TollBoothRevenueManager();
public void acceptRecord(Scanner sc) {
System.out.print("Enter number of cars at toll: ");
util.setnCar(sc.nextInt());
System.out.println("Enter car toll amount: ");
util.setCarToll(sc.nextInt());
System.out.println("enter number of trucks at toll: ");
util.setnTruck(sc.nextInt());
System.out.println("Enter truck toll amount: ");
util.setTruckToll(sc.nextInt());
System.out.println("Enter number of bikes at toll: ");
util.setnMotorcycle(sc.nextInt());
System.out.println("Enter bike toll amount: ");
util.setMotorcycleToll(sc.nextInt());
}
public void showRecord() {
System.out.println("Total revenue collected at toll will be= "+c.getSymbol()+util.CalculateTollRevenue());
}
public int menuList(Scanner sc) {
System.out.println("select one of the options given ");
System.out.printf("0.Exit \t");
System.out.print("1.Accept Record \t");
System.out.print("2.Show Record \t");
int choice=sc.nextInt();
return choice;
}
}

public class Program5 {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
TollBoothRevenueManagerUtil tbrmu=new TollBoothRevenueManagerUtil();
int choice;
while((choice=tbrmu.menuList(sc))!=0) {
	switch(choice) {
	case 1:tbrmu.acceptRecord(sc);break;
	case 2:tbrmu.showRecord();break;
	default:System.out.println("Enter a valid option");break;
	}
}
sc.close();
System.out.println("Code is complete.Thank you");
	}

}
