package com.java.A3;
import java.util.*;
import java.lang.*;
class LoanAmortizationCalculator{
Scanner sc=new Scanner(System.in);
private int principal;
private int loanTerm;
private double annualInterestRate;
private double monthlyInterestRate;
private int numberOfMonths;
private double monthlyPayment;
private double totalPayment;
Currency c=Currency.getInstance("INR");
public void  acceptRecord() {
System.out.print("Enter principal amt: ");
principal=sc.nextInt();
System.out.print("Enter loan term: "); 
loanTerm=sc.nextInt();
System.out.print("Enter interest rate: ");
annualInterestRate=sc.nextDouble();
	}
public void calculateMonthlyPayment(){
monthlyInterestRate=annualInterestRate/1200;
numberOfMonths= 12*loanTerm;
monthlyPayment=principal*(monthlyInterestRate*Math.pow(1+monthlyInterestRate, numberOfMonths))
/Math.pow(1+monthlyInterestRate,numberOfMonths-1);
totalPayment=monthlyPayment*numberOfMonths+principal;
}
public void printRecord() {
System.out.println("monthly payment amount: "+c.getSymbol()+String.format("%.2f", monthlyPayment));
System.out.println("total payment amount: "+c.getSymbol()+String.format("%.2f", totalPayment));
}
}
public class Program1{

public static void main(String[] args) {
LoanAmortizationCalculator l1=new LoanAmortizationCalculator();
l1.acceptRecord();
l1.calculateMonthlyPayment();
l1.printRecord();
	}

}
