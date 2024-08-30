class ForDemo1{

	public static void main(String args[]){
		int count = 64;
		for (int i = 0 ; i<50000 ; i++) // row
		{
			for(int j = 0 ; j<=i ; j++)  // column
			{
				System.out.print((char)++count+" ");
			}
			System.out.println(" ");
		}
	}
	
	
//dry run	
/*
i	j 				
0	0- space
1	0 - print
	1
2	0	- print
	1 - print
	2
3	0 -print
	1 - print
	2 - print 
	3 
4   0 - print
	1 -print
	2 - print
	3 -print
	4
5


















i   j      
0	0		sop-inner
	1		sop-inner
	2       sop-inner
	3       sop-inner
	4       sop-inner
	5
			sop-outer
1	0




*/

}