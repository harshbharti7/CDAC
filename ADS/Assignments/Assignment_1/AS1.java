import java.util.*;
public class a1{
 static boolean q1(int num) {
//q1 check armstrong number 
// convert int to string then get length for number of digits then check if 
// sum is equal to each digit raised to the power of number of digits
int k = String.valueOf(num).length();
int sum = 0;
int n = num;
while(n>0){
int ld = n % 10;
sum += Math.pow(ld, k); 
n=n/10;
        }
return sum == num ? true : false;
//Time Complexity: O(log10N + 1) 
//Space Complexity: O(1)
    }
static boolean q2(int n){ 
//check if number is prime or not
int cnt = 0;
for(int i = 1; i <= Math.sqrt(n); i++){ 
if(n%i==0){ 
cnt=cnt+1;
if(n/i!=i){
cnt = cnt + 1;
		}
	}
}
if(cnt == 2){
return true;
        }
else{ 
return false; 
        }	
}
static int q3(int n){
//q3 calculate factorial	
if(n==0){       
return 1;
   }
return n*q3(n-1);// n factorial is n*factorial(n-1) so creating recursive function
//time complexity O(n)
//space complexity O(n) recursive stack space
}
static int q4(int n){
//nth fibonacci number
// Base case: if n is 0 or 1, return n
if(n <= 1) {
return n;
}
// Recursive case: sum of the two preceding
// Fibonacci numbers
return q4(n-1) + q4(n-2);
//time complexity O(2^n)
//space complexity O(n) recursive stack space
}
static int q5(int a,int b){
//q5 gcd of 2 numbers.
//Repeatedly subtract the smaller number from the larger number until one of them becomes 0.
//Once one of them becomes 0, the other number is the GCD of the original numbers. Euclidean algorithm
if(a==0)   
return b;   
if (b == 0)   
return a;   
if (a == b)   
return a;   
if (a > b)   
return q5(a-b,b);   
return q5(a,b-a);   
//time complexity O(min(a,b))
//space complexity O(1)
}
static void q6(){
	//find sqrt of number using integer approximation
}
static ArrayList<?> q7(String s){
//find all repeated characters in string
// storing all characters of the string with the occurences as a key value pair ,
//if value of corresponding key is >1 then include in list 
Map<Character,Integer> m=new HashMap<>();
for(int i=0;i<s.length();i++){
//char c = s.charAt(i);
if(m.containsKey(s.charAt(i))){
m.put(s.charAt(i),m.get(s.charAt(i))+1);	
	}
else m.put(s.charAt(i),1);
//m.put(c, m.getOrDefault(c, 0) + 1);
		}	
ArrayList<Character> a= new ArrayList<>();
for(Map.Entry<Character,Integer> mp:m.entrySet()){
if(mp.getValue()>1){
	a.add(mp.getKey());
		}	
	}
	return a;
//time complexity O(nlogn) where n is length of string
//space complexity O(a) where a is num of repeating characters
}
static int q8(String s){
//find first non repeated character
int n = s.length();
//Iterate over each character in the string
for(int i = 0; i < n; ++i) {
boolean found = true;
//Check if the character repeats in the rest of the string
for (int j = 0; j < n; ++j) {
if (i != j && s.charAt(i) == s.charAt(j)) {
found = false;
break;
     }
}
//If character does not repeat, return its index
if (found) {
return i;
   }
}
return -1;	
}
static boolean q9(int n){
//Check if an integer is a palindrome
// use toString method to convert to a string then use 2 pointers to check equality of characters. 
String s=Integer.toString(n);
int i=0;
int j=s.length()-1;
while(i<j){
if(s.charAt(i)!=s.charAt(j)) return false;
i++;j--;
	}
return true;
//time complexity O(log(n)+1) ie number of digits in n
//space complexity O(1) 
}
static String q10(int n){
//check if leap year or not
return (n%4==0&&n%100!=0||n%400==0)?"leap":"not leap";
//time complexity o(1) 
//space Complexity O(1) 
}
public static void main(String[] args){

System.out.print(q10(2012));
	}
}
