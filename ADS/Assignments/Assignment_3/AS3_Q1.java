import java.util.*;
class Stack{
static final int MAX = 10;
int top;
int a[] = new int[MAX];
Stack(){
top = -1;
	}
//Underflow
boolean isEmpty(){
return (top<0);
	}
//insertion in stack
boolean push(int x){
if(top >= (MAX-1)){
System.out.println("Stack Overflow");
return false;
	}
a[++top] = x;
return true;
	}
//deletion
int pop(){
if(top<0){
System.out.println("Stack underflow");
return 0;
	}
return a[top--];
}
int peek(){
return (top<0)?-1:a[top]; 
	}
void display(){
if(isEmpty()){
System.out.println("Empty stack!");
}else
			System.out.println("Stack elements are:");
			show(top);
			System.out.println();
	}
void show(int index){
if(index < 0 )//base condition
return;
System.out.println(a[index] + "");
show(index-1);//recursive call
	}
}
public class a3q1{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
Stack st=new Stack();
s1.push(5);
s1.push(3);
s1.push(7);
s1.pop();
s1.display();
	}
}