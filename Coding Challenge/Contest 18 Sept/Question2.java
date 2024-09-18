package gcd;


import java.util.Arrays;
import java.util.Scanner;

public class Question2 {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter the size of array :: ");
		int size =  sc.nextInt();
		
		System.out.println("Enter the largested serach ::");
		int k = sc.nextInt();
		
		int[] array  = new int[size];
	
		System.out.println("Enter the array element ::");
		for(int i =0; i < array.length;i++) {
			array[i]= sc.nextInt();
		}
		System.out.println("Largest "+k+" elemets ::");
		Arrays.sort(array);

		int kLargest=array.length -1 -k;
		for (int i =array.length - 1; i>kLargest;i--) {
			System.out.println(array[i]);
		}

	}

}
