/*
Write a Java program to move every positive number to the right and every negative 
number to the left of a given array of integers (Use scanner class to input and Array, below 
picture is example do not make static array as repsrented in example). 
 */
import java.util.*;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ") ;
        int n = sc.nextInt();

        int[] arr = new int[n];

        
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        
        Arrays.sort(arr);

        for(int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }
        
    }
}
