import java.util.*;
public class a3q3{
public static String q3(String s){
char[] rev = new char[s.length()]; 
// Declare a stack of type Character 
Stack<Character> st = new Stack<Character>(); 
// Traverse the String and push the character one by 
// one into the Stack 
for (int i = 0; i < s.length(); i++) { 
// push the character into the Stack 
 st.push(s.charAt(i)); 
        } 
// Now Pop the Characters from the stack until it 
// becomes empty 
int i = 0; 
while(!st.isEmpty()) { // popping element until 
 // get the character from the top of the stack 
rev[i++] = st.pop(); 
        } 
// return string object 
return new String(rev); 	
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("enter string ");
String s3=sc.nextLine();
System.out.print("reverse string is "+q3(s3));
}
}