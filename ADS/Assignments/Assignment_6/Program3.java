package a6;
import java.util.*;
public class Program3 {
public static void main(String[] args) {
int[] a=new int[] {1,6,5,18,0,-22,14,2,9,10,-4};
int minm=Integer.MAX_VALUE;
int maxm=Integer.MIN_VALUE;
int n=a.length;
for(int i=0;i<n;i++) {
if(a[i]>maxm) maxm=a[i];
if(a[i]<minm) minm=a[i];
}
System.out.println("minimum value in array is "+minm);
System.out.println("maximum value in array is "+maxm);
}

}
