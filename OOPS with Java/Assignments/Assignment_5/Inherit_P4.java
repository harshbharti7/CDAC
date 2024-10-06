package a5ih;
class Student{
	private String name;
	private int age;
	private int grade;
	public Student() {
		this("",0,0);
	}
	public Student(String name, int age, int grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
public String getName() {
	return name;
}	
public int getAge() {
	return age;
}
public int getGrade() {
	return grade;
}
public void setName(String name) {
	this.name=name;
}
public void setAge(int age) {
	this.age = age;
}
public void setGrade(int grade) {
	this.grade = grade;
}

}
public class Program4 {

	public static void main(String[] args) {
Student s=new Student("Bob",16,11);
System.out.print(s.getName()+" "+s.getAge()+" "+s.getGrade());
	}

}
