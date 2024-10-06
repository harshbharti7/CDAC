import java.util.*;
class MyQueue{
Stack <Integer> ip = new Stack<>();
Stack <Integer> op = new Stack<>();
/** Initialize your data structure here. */
public MyQueue(){}
/** push element x to the back of queue. */
public void push(int x){
while(ip.empty() == false) {
op.push(ip.peek());
ip.pop();
}
// Insert the desired element in the stack ip
System.out.println("The element pushed is " + x);
ip.push(x);
// pop out elements from the stack op and push them into the stack ip
while (op.empty() == false) {
ip.push(op.peek());
op.pop();
	}
}
/** Removes the element from in front of queue and returns that element. */
public int pop(){
// shift ip to op 
if (ip.empty()) {
System.out.println("Stack is empty");
}
int val = ip.peek();
ip.pop();
return val;
}
/** Get the front element. */
public int peek() {
// shift ip to op 
if (ip.empty()) {
System.out.println("Stack is empty");
	}
return ip.peek();
}
int size(){
return ip.size();
}

}
public class a3q8{
public static void main(String[] args){
MyQueue q = new MyQueue();
q.push(3);
q.push(7);
System.out.println("The element popped is " + q.pop());
}
}