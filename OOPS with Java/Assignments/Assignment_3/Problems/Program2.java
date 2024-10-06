package com.java.A3;
import java.lang.*;
import java.util.*;
class CompoundInterestCalculator{
Currency c=Currency.getInstance("INR");
Scanner sc=new Scanner(System.in);
private int initialInv;
private double annualInterestRate;
private int numOfCompounds;
private int duration;
private double futureValue;
public void acceptRecord() {
System.out.print("Enter initial investment amount: ");
initialInv=sc.nextInt();
System.out.print("Enter annual interest rate: ");
annualInterestRate=sc.nextDouble();
System.out.print("Enter how many times the interest is compounded: ");
numOfCompounds=sc.nextInt();
System.out.print("Enter the duration in years: ");
duration=sc.nextInt();
}
public void calculateFutureValue() {
futureValue=initialInv*Math.pow(1+(annualInterestRate/(100*numOfCompounds)),numOfCompounds*duration);
}
public void printRecord() {
System.out.println("Future value earned is= "+c.getSymbol()+String.format("%.3f",futureValue));
System.out.println("Total interest earned is= "+c.getSymbol()+String.format("%.3f",(futureValue-initialInv)));
}
}

public class Program2 {
public static void main(String[] args) {
CompoundInterestCalculator c1=new CompoundInterestCalculator();
c1.acceptRecord();c1.calculateFutureValue();c1.printRecord();


	}

}
