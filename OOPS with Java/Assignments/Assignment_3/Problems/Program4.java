package com.java.A3;
import java.util.*;
class discountCalculator{
Scanner sc=new Scanner(System.in);
private int price;
private int discountRate;
private float finalAmt;
public void acceptRecord() {
System.out.print("Enter the original price: ");
price =sc.nextInt();
System.out.print("Enter discount rate: ");
discountRate=sc.nextInt();
}
public void calculateDiscount() {
float discountAmt=(price*discountRate)/100;
finalAmt=(float)price-discountAmt;
}
public void printRecord() {
System.out.println("Final price of product of price "+price+" with discount of "+discountRate+"% is= "+finalAmt);
}
}
public class Program4 {
public static void main(String[] args) {
discountCalculator p1=new discountCalculator();
p1.acceptRecord();p1.calculateDiscount();p1.printRecord();

	}

}
