import java.util.*;
public class a3q4{
static int q4(String[] postfix) {
/*When we find the number/operand push it into the stack
Whenever we encounter the operator, pop the last two numbers in the stack.
Apply the operation corresponding to the operator on the two numbers and push back the result obtained after performing operations on the numbers into the stack.
While applying the operation care should be taken. For operations like addition, and multiplication the order of the numbers doesn’t matter. But the order of numbers is important for subtraction and division.
The number popped second is the first number that encounters first in infix expression. 
So In subtraction first popped number is subtracted from the second popped number. Similarly, 
In division, the second popped number is divided by the first popped number.
*/
Stack < Integer > st = new Stack < > ();
for (String token: postfix) {
if (token == "+" || token == "-" || token == "*" || token == "/") {
int first = st.peek();
st.pop();
int second = st.peek();
st.pop();
if (token == "+")
st.push(first + second);
else if (token == "-")
st.push(second - first);
else if (token == "*")
st.push(first * second);
else
st.push(second / first);
      } else
st.push(Integer.parseInt(token));
    }
 return st.peek();
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String s4[]={"5", "3", "+" ,"2" ,"*"};
String s42[]={"4" ,"5","*", "6","/"};
System.out.println(q4(s4));
System.out.println(q4(s42));
	}
}