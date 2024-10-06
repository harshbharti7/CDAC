public class q3 extends q1{
public static boolean hasCycle(Node head){
	Node slow=head;
	Node fast=head;
	while(fast!=null && fast.next!=null){
		slow=slow.next;
		fast=fast.next.next;
		if(slow==fast) return true;
	}
	return false;
}
public static void main(String[] args){
Node head=new Node(1);
head=insertAtTail(head,2);
head=insertAtTail(head,3);
head=insertAtTail(head,4);
head=insertAtTail(head,5);
Node n2=head.next;
Node n3=head.next.next;
Node n4=head.next.next.next;
Node n5=head.next.next.next.next;
n5.next=n3;
System.out.print(hasCycle(head));
Node h1=new Node(6);
head=insertAtTail(h1,7);
head=insertAtTail(h1, 8);
head=insertAtTail(h1,9);
Node n12=h1.next;
Node n13=h1.next.next;
Node n14=h1.next.next.next;
System.out.print("\n"+hasCycle(h1));
	}
}