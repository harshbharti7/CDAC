package a5;
class InstanceCounter{
private static int cnt;
public InstanceCounter() {
	cnt++;
}
public static int getNumOfInstances() {
return cnt;
}
}
public class Program1 {
public static void main(String[] args) {
InstanceCounter i1=new InstanceCounter();
InstanceCounter i2=new InstanceCounter();
InstanceCounter i3=new InstanceCounter();
InstanceCounter i4=new InstanceCounter();
System.out.println(InstanceCounter.getNumOfInstances());
}
}
