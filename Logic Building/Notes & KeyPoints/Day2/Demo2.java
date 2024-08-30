class Demo2{
	public static void main(String args[]){
	
	/*int age = 16;
	if (age >= 18){
		System.out.println("Eligible for voting.");	
	}
	else{
		System.out.println("Not Eligible");
	}*/
	
	/* error
	if (1){
				System.out.println("IF Block");
	}
	else{
				System.out.println("Else block");
	}*/
	
	/*int marks = 65;
	if (marks >= 85){
		System.out.println("Grade A+");
	}else if(marks >=70){
		System.out.println("Grade A");
	}
	//int a = 10; error - else without if
	else if(marks >=60) {
		System.out.println("Grade B");
	}else{
		System.out.println("Grade c");
	}*/
	
	int age = 18;
	if (age > 18  && age == 18 ){
		//int abc = 30;
		System.out.println("Eligible for voting.");	
	}
	else{
		System.out.println("Not Eligible");
	}
	
	int age1 = 18;
	if (age1 > 18  || age1 == 18 ){
		
		System.out.println("Eligible for voting.");	
	}
	else{
		System.out.println("Not Eligible");
	}
	
	/*truth table
	and
	t t = t
	t f = f
	f t = f
	f f = f
	
	or
	t t = t
	t f = t
	f t = t
	f f = f
	
	
	*/
	
	}
}