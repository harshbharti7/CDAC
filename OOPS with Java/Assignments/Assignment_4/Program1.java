package com.java.A3GS;
import java.util.*;
class LoanAmortizationCalculator{
private double principal;
private double annualInterestRate;
private float loanTerm;
LoanAmortizationCalculator() {
		
}
LoanAmortizationCalculator(double principal, double rateOfInterest, float loanTerm){
this.principal = principal;
this.annualInterestRate = rateOfInterest;
this.loanTerm = loanTerm;
}
	
public void setPrincipal(double principal) {
this.principal = principal;
}
	
public double getPrincipal() {
return principal;
}
	
public void setLoanTerm(float loanTerm) {
this.loanTerm = loanTerm;
	}
	
public float getLoanTerm() {
return loanTerm;
	}
	
public void setRateOfInterest(double rateOfInterest) {
this.annualInterestRate = rateOfInterest;
	}

public double getRateOfInterest() {
return annualInterestRate;
	}
	
@Override
public String toString() {
return "Principal : "+this.principal+"Interest Rate : "+this.annualInterestRate+"Loan Term "+this.loanTerm;
	}
	
public double calculateMonthlyPayment() {
double monthlyInterestRate = annualInterestRate/1200;
double numberOfMonths = loanTerm * 12;
double monthlyPayment = principal * (monthlyInterestRate * Math.pow((1 +monthlyInterestRate), numberOfMonths))
				/ (Math.pow((1 + monthlyInterestRate), numberOfMonths) - 1);
		//System.out.println("Monthly Payment : " + monthlyPayment);
		return monthlyPayment;
	}
}
class LoanAmortizationCalculatorUtil{
LoanAmortizationCalculator loan = new LoanAmortizationCalculator();//static Scanner sc = new Scanner(System.in);
	public void acceptRecord(Scanner sc) {
System.out.println("Enter Principal Amount : ");
loan.setPrincipal(sc.nextDouble());

System.out.println("Enter Interest Rate : ");
loan.setRateOfInterest(sc.nextDouble());

System.out.println("Enter Loan Terms (years) : ");
loan.setLoanTerm(sc.nextFloat());

	}public void printRecord() {
		
System.out.printf("Monthly Amount Paid : ₹ %.2f \n",loan.calculateMonthlyPayment());
System.out.printf("Total Amount Paid : ₹ %.2f \n", (loan.calculateMonthlyPayment() * loan.getLoanTerm() * 12));
System.out.println();
	}
	public int menuList(Scanner sc) {
		
System.out.println("Select Option :");
System.out.println("0. Exit");
System.out.println("1. Accept Record");
System.out.println("2. Print Record");
System.out.println();
int choice = sc.nextInt();
return choice; 
		
	}
}
public class Program1 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
LoanAmortizationCalculatorUtil calculatorUtil = new LoanAmortizationCalculatorUtil();
int choice;
while ((choice = calculatorUtil.menuList(sc)) != 0) {
	switch (choice) {
	case 1:
			calculatorUtil.acceptRecord(sc);
			break;
	case 2:
			calculatorUtil.printRecord();
			break;
			
	default:
			System.out.println("Wrong Choice");
		}
		
		
	}
System.out.println("Thanks ....");
sc.close();	}

}
