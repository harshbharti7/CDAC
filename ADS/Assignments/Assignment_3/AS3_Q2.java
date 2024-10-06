import java.util.*;
public class a3q2{
public static boolean isValid(String s){
/*Whenever we get the opening bracket we will push it into the stack. I.e ‘{‘, ’[’, ’(‘.
Whenever we get the closing bracket we will check if the stack is non-empty or not.
If the stack is empty we will return false, else if it is nonempty then we will check if the topmost element of the stack is the opposite pair of the closing bracket or not.
If it is not the opposite pair of the closing bracket then return false, else move ahead.
After we move out of the string the stack has to be empty if it is non-empty then return it as invalid else it is a valid string.*/
Stack<Character> st = new Stack<Character>();
for (char it : s.toCharArray()) {
if(it == '(' || it == '[' || it == '{')
st.push(it);
else {
if(st.isEmpty()) return false;
char ch = st.pop(); 
if((it == ')' && ch == '(') || (it == ']' && ch == '[')||(it =='}'&&ch == '{')) continue;
else return false;
            }
        }
        return st.isEmpty();
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("enter parentheses string ");
String s2=sc.nextLine();
if(isValid(s2)) System.out.println("balanced");
else System.out.println("not balanced"); 

	}
}