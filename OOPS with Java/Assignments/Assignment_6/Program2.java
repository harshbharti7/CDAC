package a6;
//this program will be executed in terminal and not from eclipse
public class Program2 {
public static void acceptRecord(int[] a,String[] args) {
	if(args.length!=a.length) {
		System.out.println("Please enter all the elements of array");
		return;
	}
for(int i=0;i<a.length;i++) {
try {
a[i]=Integer.parseInt(args[i]);
}
catch(NumberFormatException e) {
System.out.println("alphanumeric input is not allowed, enter a valid integer input for index "+i);
a[i]=0;
		}
	}
}
public static void printRecord(int [] a) {
	for(int i=0;i<a.length;i++) {
		System.out.print(a[i]+" ");
	}
}
public static void main(String[] args) {
int[] a=new int[6];
acceptRecord(a, args);
printRecord(a);
	}

}
