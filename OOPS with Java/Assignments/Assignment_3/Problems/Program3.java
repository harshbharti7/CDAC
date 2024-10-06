package com.java.A3;
import java.util.*;
class bmiCalculator{
	Scanner sc=new Scanner(System.in);
	private double wt;//weight
	private double ht;//height
	private double bmi;
	public void acceptRecord() {
	System.out.print("Enter weight in kg: ");
	wt=sc.nextDouble();
	System.out.print("Enter height in metres: ");
	ht=sc.nextDouble();
	}
	public void calculateBMI() {
	bmi= wt/Math.pow(ht, 2);
	}
	public void printRecord() {
	System.out.println("BMI is= "+String.format("%.3f",bmi));
	if(bmi<18.5) System.out.println("underweight");
	else if (bmi>18.5&&bmi<25) System.out.println("normal weight");
	else if(bmi>25&&bmi<29.9) System.out.println("overweight");
	else System.out.println("obese");
}
}
public class Program3 {
public static void main(String[] args) {
bmiCalculator p1=new bmiCalculator();
p1.acceptRecord();
p1.calculateBMI();
p1.printRecord();

	}
}
