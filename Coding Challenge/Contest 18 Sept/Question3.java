import java.util.*;
public class Question3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ") ;
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;

        for(int i=0; i<n; i++) {
            sum = sum + arr[i];
        }

        double avg = sum / n;
        System.out.println("Average of elements of Array: "+avg);

        for(int i=0; i<n; i++) {
            if(arr[i] > avg) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}