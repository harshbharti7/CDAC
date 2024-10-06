import java.util.*;
class Employee{
Scanner sc=new Scanner(System.in);
private String name;
private String dept;
private int empId;
private double salary;
public void acceptRecord(){
System.out.println("Name	:	");
this.name=sc.nextLine();
System.out.println("Department	:	");
this.dept=sc.nextLine();
System.out.println("employee ID	:	");
this.empId=sc.nextInt();
System.out.println("Salary	:	");
this.salary=sc.nextDouble();
}
public void showRecord(){
System.out.println("Name	:	"+this.name);

System.out.println("Department	:	"+this.dept);

System.out.println("employee ID	:	"+this.empId);

System.out.println("Salary	:	"+this.salary);
}
}
public class a4Employee{
public static void main(String[] args){
Employee e1=new Employee();
e1.acceptRecord();e1.showRecord();
}
}