package gcd;

import java.util.Scanner;

public class Question1_GCD {

	public static void main(String[] args) {
		try(Scanner sc =  new Scanner(System.in)){
			System.out.println("Enter first number :");
			int first =sc.nextInt();
			
			System.out.println("Enter second number :");
			int second =sc.nextInt();
			
			if(first > 0 && second > 0) {
				int min = Math.min(first, second);
				
				while(min > 0) {
					if (first % min == 0 && second % min == 0) {
		                break;
		            }
					min--;
				}
				System.out.println("GCD of "+first+"and "+second +" :"+min);
			}else {
				System.out.println("Enter positive number");
			}
			
		}
		

	}

}
