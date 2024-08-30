class Operators{
 public static void main(String args[]){
 
 /*int a = +10;
 System.out.println(10 | 5);
 System.out.println(a);*/
 
 
 
 
 
	int a = 10 ;
	
	/*System.out.println(a);   //10
	System.out.println(a++); // prints - 10, incremnet a to 11 post increment 
	System.out.println(a); // 11
	System.out.println(++a); // 11 (19 hand) 12 ( 50 hand ) pre-increment
	*/
	int b = 10 ;
	
	/*System.out.println(b);   //10
	System.out.println(b--); // 10
	System.out.println(b); // 9
	System.out.println(--b); // 8*/
		//int c = ++a + b++; // 11 + 10
	int c = ++a + b++ + a++ + ++b;   
		//11 + 10  + 11 + 12
	System.out.println("A "+a); // 12 
	System.out.println("b "+ b); // 12
	System.out.println(c);   // 44
	
	
	
	
	
 
 
 
 
 
 }


}

/*
101
101
----
	101	


1010
0101
-----
	
	
*/