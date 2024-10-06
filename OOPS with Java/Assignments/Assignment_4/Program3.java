package com.java.A3GS;
import java.util.*;
class BMICalculator{
private double ht;//ht is height
private double wt;//wt is weight
public BMICalculator() {

}
BMICalculator(double ht, double wt) {
this.ht = ht;
this.wt = wt;
}
public double getHt() {
	return ht;
}
public void setHt(double ht) {
	this.ht = ht;
}
public double getWt() {
	return wt;
}
public void setWt(double wt) {
	this.wt = wt;
}
@Override
public String toString() {
return "Weight: "+this.wt+" Height: "+this.ht;
}
public double calculateBMI() {
return wt/Math.pow(ht, 2);
}
}
class BMICalculatorUtil{
BMICalculator util=new BMICalculator();
public void acceptRecord(Scanner sc) {
System.out.print("Enter the height of the person: ");
util.setHt(sc.nextDouble());
System.out.print("Enter the weight of the person: ");
util.setWt(sc.nextDouble());
}
public void printRecord() {
System.out.println("BMI of the person is: "+String.format("%.3f",util.calculateBMI()));
if(util.calculateBMI()<18.5) System.out.println("person is underweight");
else if(util.calculateBMI()>18.5&&util.calculateBMI()<25) System.out.println("normal weight");
else if(util.calculateBMI()>25&&util.calculateBMI()<29.9) System.out.println("person is overweight");
else System.out.println("person is obese");
}
public int menuList(Scanner sc) {
System.out.println("Select one of the options: ");
System.out.println("0.Exit: ");
System.out.println("1.Accept Record: ");
System.out.println("2.Print the record: ");
System.out.println();
int choice=sc.nextInt();
return choice;
	}
}
public class Program3 {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
BMICalculatorUtil bmic=new BMICalculatorUtil();
int choice;
while((choice=bmic.menuList(sc))!=0) {
switch(choice) {
case 1:
	bmic.acceptRecord(sc);
	break;
case 2:
	bmic.printRecord();
	break;
default:
	System.out.println("please enter a valid choice");
}
}
System.out.println("thank you");
sc.close();
	}

}
