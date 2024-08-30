class Demo{
	public static void main(String args[]){
		//type casting
		byte b1 = 127; // implicit
		byte b = (byte)130; // explicit
		//System.out.println(b);
	
		int a = 10;
		
		//byte b2 = a; error
		//System.out.println(b2);// error
		
		char c = 'A';
		System.out.println(c);			// A
		System.out.println((int)c);		//65
		System.out.println((char)66);	// B
	System.out.println((char)125);  // closing curly brace
	System.out.println((char)500); //
	System.out.println((char)499); //
	System.out.println((char)255); //
	System.out.println((char)256); //
	
	
	//ASCII	- 0 to 255 range
		
		
/*1 bit
1 byte - 8 bit
1 kb  - 1024 byte
1 mb  - 1024 kb
1 gb - 1024 mb


Binary - 0's and 1's

10 ( Decimal ) - 1010

10 % 2   = 0
5 % 2 = 1
2 % 2 = 0
1 % 2 = 1
0
*/

	byte b3 = 10;
	int a1 = b3;
	System.out.println(a1);

	}
}