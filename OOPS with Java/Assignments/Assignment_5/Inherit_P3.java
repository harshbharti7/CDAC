package a5ih;
class Animal{
public void eating() {
System.out.print("eating 		"); 
}
public void sleeping() {
System.out.print("sleeping 		");
}
}
class Dog extends Animal{
@Override
public void eating(){
	System.out.print("eating pedigree 	");
}
public void barking(){
System.out.print("barking "); 
}
@Override
public void sleeping() {
System.out.print("sleeping below car 	");
}
}
public class Program3 {
public static void main(String[] args) {
Dog d=new Dog();
d.eating();d.sleeping();d.barking();
	}

}
