package a5ih;

import java.util.Scanner;

class BankAccount{
protected float totalDeposit;
private float deposit;
private float withdrawAmt;
public BankAccount() {}
public BankAccount(float totalDeposit,float deposit,float withdrawAmt) {
	this.totalDeposit=totalDeposit;
	this.deposit=deposit;
	this.withdrawAmt=withdrawAmt;
}
@Override
public String toString() {
	return "BankAccount [deposit=" + deposit + ", withdrawAmt=" + withdrawAmt + "]";
}

public float getDeposit() {
	return deposit;
}
public void setDeposit(float deposit) {
	this.deposit = deposit;
}
public float getWithdrawAmt() {
	return withdrawAmt;
}
public void setWithdrawAmt(float withdrawAmt) {
	this.withdrawAmt = withdrawAmt;
}

private static Scanner sc=new Scanner(System.in);
public float getTotalDeposit() {
return totalDeposit;
	}
public void setTotalDeposit(float totalDeposit) {
this.totalDeposit = totalDeposit;		
	}
public BankAccount(float totalDeposit) {
this.totalDeposit = totalDeposit;
	}
public void makeDeposit(float amt) {
if(amt>0) deposit=amt;
totalDeposit+=deposit;
	System.out.println("total deposit now is = "+(totalDeposit)); 
	}
public void makeWithdrawal(float amt) {
if(amt>0 && amt<totalDeposit) withdrawAmt=amt;
totalDeposit-=withdrawAmt;
System.out.println("total deposit now is = "+(totalDeposit)); 

	}
}
class SavingsAccount extends BankAccount{
private static final float withdrawPct=0.1f;


@Override
public void makeWithdrawal(float amt) {
float maxWithdrawAmt=getTotalDeposit()*withdrawPct;
if(amt>0 && amt<=totalDeposit) {
	if(amt<=maxWithdrawAmt) System.out.println("remaining deposit is= "+(totalDeposit-maxWithdrawAmt));
	else System.out.println("invalid transaction- please ensure withdrawal is less than "+ maxWithdrawAmt);
}
else System.out.println("invalid transaction");
		}
}
public class Program1 {
public static void main(String[] args) {
BankAccount b=new BankAccount(100000.0f,0f,0f);
SavingsAccount s=new SavingsAccount();

s.setTotalDeposit(100000f);
s.makeDeposit(100000f);
s.makeWithdrawal(90000f);
s.makeDeposit(-1000f);
s.makeWithdrawal(5000f);
s.toString();
	}

}
