package com.java.A3GS;
import java.util.*;


class DiscountCalculator{
private int price;
private int discountRate;
public DiscountCalculator() {
	}
public DiscountCalculator(int price, int discountRate) {
	this.price = price;
	this.discountRate = discountRate;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getDiscountRate() {
	return discountRate;
}
public void setDiscountRate(int discountRate) {
	this.discountRate = discountRate;
}
@Override
public String toString() {
	return "DiscountCalculator [price=" + price + ", discountRate=" + discountRate + "]";
}
public double calculateDiscount() {
double discountAmt=price*discountRate/100;
double finalAmt=(double)price-discountAmt;
return finalAmt;
}
}
class DiscountCalculatorUtil{
Currency c=Currency.getInstance("INR");
DiscountCalculator util=new DiscountCalculator();
public void acceptRecord(Scanner sc) {
System.out.print("Enter the original price of product: ");
util.setPrice(sc.nextInt());
System.out.println("Enter the discount amt: ");
util.setDiscountRate(sc.nextInt());
}
public void printRecord() {
System.out.println("final price of the product after discount is "+c.getSymbol()+String.format("%.3f",util.calculateDiscount()));
}
public int menuList(Scanner sc) {
System.out.printf("Select a given option\t");
System.out.printf("0. Exit\t");
System.out.printf("1. Accept records\t");
System.out.printf("2. print records\t");
System.out.println();
int choice=sc.nextInt();
return choice;
}
}

public class Program4 {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
DiscountCalculatorUtil dcu=new DiscountCalculatorUtil();
int choice;
while((choice=dcu.menuList(sc))!=0) {
switch(choice) {
case 1:
	dcu.acceptRecord(sc);
	break;
case 2:
	dcu.printRecord();
	break;
default:
	System.out.println("enter a valid option ");
}
}
sc.close();
System.out.println("Code is complete.Thank you");
}
	}


