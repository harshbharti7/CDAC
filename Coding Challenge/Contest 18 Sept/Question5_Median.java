import java.util.*;
public class Question5_Median{
public static double[] findMedians(int[] a,int k){
double[] m=new double[a.length-k+1];	
	for(int i=0;i<(a.length-k+1);i++){
		int[] window=new int[k];
		for(int j=0;j<k;j++){
			window[j]=a[i+j];
		}
	Arrays.sort(window);
	if(k%2==1){
		m[i]=window[k/2];
	}
	else m[i]=(window[k/2-1]+window[k/2])/2.0;
	}
return m;
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter array size: ");
int n=sc.nextInt();
int[] a=new int[n];
for(int i=0;i<n;i++){
System.out.print("Enter "+(i+1)+" element: ");
a[i]=sc.nextInt();	
		}
System.out.println("Enter window size");
int k=sc.nextInt();
double[] res=findMedians(a,k);
System.out.print("Medians: "+Arrays.toString(res));
	}
}