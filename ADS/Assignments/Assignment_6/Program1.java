package a6;
import java.util.*;
public class Program1 {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int[] a=new int[5];
for(int i=0;i<a.length;i++) {
System.out.print(a[i]+"\t");
}
for(int i=0;i<a.length;i++) {
if(i==1) System.out.print("Enter "+i+"st value: ");
else if(i==2) System.out.print("enter "+i+"nd value: ");
else if(i==3) System.out.print("Enter "+i+"rd value: ");
else System.out.print("enter "+i+"th value: ");
a[i]=sc.nextInt();
}
for(int i=0;i<a.length;i++) {
System.out.print(a[i]+"  ");
}
	}

}
