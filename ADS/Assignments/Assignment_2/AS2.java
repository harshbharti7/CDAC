import java.util.*;
public class a2{
static void q1(int n){
//q1 right angled triangle pattern 
for(int i=1;i<=n;i++){
	for(int j=1;j<=i;j++){
		System.out.print("* ");
	}
System.out.println();
	}
//time complexity O(n^2) since nested loops being used
//space complexity O(1) no extra space used
}
static int q2(int[] a){
//q2 remove duplicates from an array then return the length of new array
//from a sorted array, keep a pointer at a[0]. iterate along the array from 1 to end,everytime a new value 
//occurs, swap it with current index
Arrays.sort(a);
int i=0;
for(int j=1;j<a.length;j++) {
if(a[i]!=a[j]) {
	i++;
	a[i]=a[j];
		}
	}
return i+1;
//time complexity O(N) 1 loop used, space complexity O(N) n is length of input array


//alternate method:using set. since set does not store duplicate values, simply adding elements of array to set 
//then returning the size of set is number of unique values
/*Set<Integer> set1=new HashSet<>();
for(int i=0;i<a.length;i++){
set1.add(a[i]);	
	}
return set1.size();*/
//time complexity is O(N) as traversing array,space complexity is O(m) where m is number of unique elements
}
static String q3(String s){
//using inbuilt string function replaceAll, replace all white spaces with "" 
return s.replaceAll("\\s","");
//time complexity O(1) space Complexity O(1)
}
static String q4(String s){
//q4 reverse a string. using a character to traverse string from last character to first then adding it 
//to a new string
/*String res="";
char ch;
for(int i=s.length()-1;i>=0;i--){
	ch=s.charAt(i);
	res+=ch;
}
return res;*/
//time complexity O(n) traversing the string, space complexity O(n),using a result string 

//alternate method:using toCharArray method. convert to character array then swap elements 
char[] ca=s.toCharArray();
int i=0;int j=ca.length-1;
while(i<j){
char temp;
temp=ca[i];
ca[i]=ca[j];
ca[j]=temp;
i++;j--;	
	}
return new String(ca);
}
static int[] q5(int[] a){
//reverse an array in place ie no using extra space
int i=0;int j=a.length-1;
while(i<j){

a[i]=a[i]+a[j];
a[j]=a[i]-a[j];
a[i]=a[i]-a[j];
i++;j--;
	}
return a;
//time complexity O(n) as traversing array space complexity O(1) as no additional space used
}
//implementing an overloaded static method to use later on
static int[] q5(int[] a,int i,int j){
while(i<j){
a[i]=a[i]+a[j];
a[j]=a[i]-a[j];
a[i]=a[i]-a[j];
i++;j--;
	}
return a;
}
static String q6(String s){
//reverse the words in the string. will use StringBuilder class and its reverse() method and split() function of String class
String[] words = s.split(" ");
StringBuilder rev=new StringBuilder();
for(int i=words.length-1;i>=0;i--){
	rev.append(words[i]);
if(i!=0){
rev.append(" ");
//add a space character between each word except the last word.
    }
}
return rev.toString();
//time complexity O(n) since iterating over the sentence once 
//space complexity O(n) since using a String[] array to store the words in reverse order then another reference rev to which words are appended
}
static int q7(int n){
//reverse a number. use % to get last digit of the number then use formula rev=rev*10+lastdigit
int rev=0;
int dup=Math.abs(n);
while(dup>0){
int ld=dup%10;
rev=(rev*10)+ld;
dup=dup/10;
}
return (n>0)?rev:(-1*rev);
//time complexity O(log(10)n+1) space complexity O(1)
}
static String q9(String s){
//check if string is palindome. using 2 pointers 1 at start of string another at end then iteratively check equality of characters
String dup=s;
int i=0;int j=dup.length()-1;
while(i<j){
	if(dup.charAt(i)!=dup.charAt(j)) return "not a palindome";
	i++;j--;
	}
return "palindome";
//time complexity O(N) space Complexity O(1)	
}
static int[] q10(int[] a,int d){
//rotate array by d places. 
//first reverse array upto Dth place from start, then d+1 index to end of array, then reverse the entire resultant array;
int n=a.length;
d=d%n;
q5(a,0,d-1);
q5(a,d,n-1);
q5(a,0,n-1);
return a;	
//time complexity O(n) as using 3 while loops each has O(n) complexity space complexity is O(1) no extra space used
	}
//extra for self reference- right rotation of array by d places
static int[] rightRotate(int[] a,int d){
	int n=a.length;
	d=d%n;
int dnew=n-d;
q5(a,dnew,n-1);
q5(a,0,dnew-1);
q5(a,0,n-1);
return a;
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("enter num of stars: ");
int st=sc.nextInt();
q1(st);//q1
int[] qu2={0, 0, 1, 1, 2, 2, 3, 3};
System.out.println("number of unique elements in array= "+q2(qu2));//q2
String s3="Java   Programming";
System.out.println(q3(s3));//q3
String s4="hello";
System.out.println(q4(s4));//q4
int[] qu5={1, 2, 3, 4};
System.out.println(Arrays.toString(q5(qu5)));//q5
String s6="welcome to java programming";
System.out.println("reversed String: "+q6(s6));
System.out.print("enter num to reverse: ");
int n7=sc.nextInt();
System.out.println(q7(n7));//q7
System.out.print("Enter string to check: ");
String s9=sc.next();
System.out.println(q9(s9));//q9
int[] a10={1,2,3,4,5};
System.out.print("enter number of rotations: ");
int n10=sc.nextInt();
System.out.println("rotated array: "+Arrays.toString(q10(a10,n10)));//q10
int[] newA10={1,2,3,4,5};
System.out.print("right rotated array: "+Arrays.toString(rightRotate(newA10,n10)));//q10 but with right rotation instead of left
	}
}