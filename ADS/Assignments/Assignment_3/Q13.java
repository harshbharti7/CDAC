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
int getMin(){
if (isEmpty()){
System.out.println("Stack is empty");
return -1; // Return -1 or handle the error as needed
}
int min = Integer.MAX_VALUE;
for (int i = 0; i <= top; i++){
if (a[i] < min) {
min = a[i];
	}
  }
return min; // Return the minimum value found
}
void show(int index){
if(index < 0 )//base condition
return;
System.out.println(a[index] + "");
show(index-1);//recursive call
	}
}
public class a3q14{
public static void main(String[] main){
Stack s=new Stack();
s.push(5);		
s.push(3);		
s.push(7);		
System.out.println(s.getMin());	
Stack s1=new Stack();
s1.push(10);
s1.push(8);
s1.push(6);
s1.push(12);
System.out.println(s1.getMin());
	}
}