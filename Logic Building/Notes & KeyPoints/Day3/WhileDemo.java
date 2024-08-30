class WhileDemo{
	public static void main(String args[]){
	
	/*Unreachable statement
		while(false){
		System.out.println("Inside while");	
	}*/
	/*
	boolean b = false;
	while(b){
		System.out.println("Inside while");
	}*/
	/*int i = 0;
	while(i<5){
		System.out.println("Inside while");
		i++;
	}*/
	
	/*
	boolean b = true;
	while(b){
		System.out.println("Inside while");
		b=false;
	}*/
	
	/*int a = 10;
	do{
		System.out.println("Inside do-while");
		a--;
	}while(a>0);
	
	int a1 = 10;
	do{
		a1--;
		System.out.println("Inside do-while");
	}while(a1>=0);
	*/
	
	
	
	int i = 0 ;
	while(i<10){
		if(i==5){
			i++;
			continue ; 
			
		}
		if (i==9){
			break;
		}
		System.out.println(i++);
		
		
	}
	
	
	
	
	
	
	}
}