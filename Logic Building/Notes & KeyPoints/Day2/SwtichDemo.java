class SwtichDemo{
	public static void main(String args[]){
		
		int day = 2;
		
		switch(day){
			default: 
				System.out.println("invalid input");
				break;
			case 3:
				System.out.println("Today is Wed");
				break;
			case 1:
				System.out.println("Today is Monday");
				break;
			case 2:
				System.out.println("Today is Tues");
				System.out.println("Today is Tues");
				System.out.println("Today is Tues");System.out.println("Today is Tues");System.out.println("Today is Tues");
				break;
			case '2':
				System.out.println("char 2");
				break;
			/*error
			case 2.0:
			System.out.println("double 2");
				break;
			*/
				
						
		}
		System.out.println("after switch");
		
	
	
	
	}


}