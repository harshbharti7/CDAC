import java.util.*;
public class program{
public static void q1(){
int a=1;
double b=a;
System.out.println(b);
}
public static void q2(){
double a=1.0;
int b=(int)a;
System.out.println(b);
}
public static void q3(){
int a=1;
double b=19.1;
System.out.println(a+b);
}
public static void q4(){
int a=1;
double b=a;
float c=a;
//boolean d=a; will return error
String s=Integer.toString(a);
System.out.println(a+" "+b+" "+c+" "+s+" ");
}
public static void main(String[] args){
q1();
q2();
q3();
q4();
}
}