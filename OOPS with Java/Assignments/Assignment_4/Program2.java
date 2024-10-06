package com.java.A3GS;
import java.util.*;
class CompountInterestCalculator{
private int initialInv;
private int duration;
private int nOfCompounds;
private double annualInterestRate;

public CompountInterestCalculator() {
}

public CompountInterestCalculator(int initialInv, int duration, int nOfCompounds, double annualInterestRate) {
	
	this.initialInv = initialInv;
	this.duration = duration;
	this.nOfCompounds = nOfCompounds;
	this.annualInterestRate = annualInterestRate;
}

public int getInitialInv() {
	return initialInv;
}

public void setInitialInv(int initialInv) {
	this.initialInv = initialInv;
}

public int getDuration() {
	return duration;
}

public void setDuration(int duration) {
	this.duration = duration;
}

public int getnOfCompounds() {
	return nOfCompounds;
}

public void setnOfCompounds(int nOfCompounds) {
	this.nOfCompounds = nOfCompounds;
}

public double getAnnualInterestRate() {
	return annualInterestRate;
}

public void setAnnualInterestRate(double annualInterestRate) {
	this.annualInterestRate = annualInterestRate;
}

@Override
public String toString() {
	return "CompountInterestCalculator [initialInv=" + initialInv + ", duration=" + duration + ", nOfCompounds="
			+ nOfCompounds + ", annualInterestRate=" + annualInterestRate + "]";
}
public double CalculateFutureValue() {
double futureValue=initialInv*Math.pow(1+(annualInterestRate/100*nOfCompounds),nOfCompounds*duration );
return futureValue;
}
public double CalculateTotalInterest() {
return CalculateFutureValue()-initialInv;
}
}
class CompoundInterestCalculatorUtil{
CompountInterestCalculator util=new CompountInterestCalculator();
Currency c=Currency.getInstance("INR");
public void acceptRecord(Scanner sc) {
System.out.println("Enter initial investment amount: ");
util.setInitialInv(sc.nextInt());
System.out.println("Enter number of years: ");
util.setDuration(sc.nextInt());
System.out.println("Enter annual interest rate: ");
util.setAnnualInterestRate(sc.nextDouble());
System.out.println("Enter number of times it is compounded per yr: ");
util.setnOfCompounds(sc.nextInt());
}
public void showRecord() {
System.out.println("for the given values,future value of investment is "+c.getSymbol()+String.format("%.3f", util.CalculateFutureValue()));
System.out.println("the total interest earned is "+c.getSymbol()+String.format("%.3f", util.CalculateTotalInterest()));
}
public int menuList(Scanner sc) {
System.out.println("Select one of the given options");
System.out.printf("0. Exit\t");
System.out.printf("1. Accept records\t");
System.out.printf("2. Show record \t");
int choice=sc.nextInt();
return choice;
}
}
public class Program2 {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
CompoundInterestCalculatorUtil cicu=new CompoundInterestCalculatorUtil();
int choice;
while((choice=cicu.menuList(sc))!=0) {
switch(choice) {
case 1:
	cicu.acceptRecord(sc);break;
case 2:cicu.showRecord();break;
default: System.out.println("Select a valid option");break;
}
}
sc.close();
System.out.println("code is complete.thank you");
	}

}
