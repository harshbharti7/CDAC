public class q15 extends q1{
public static int midpt(Node head){
Node slow=head,fast=head;
while(fast!=null&&fast.next!=null){
	slow=slow.next;
	fast=fast.next.next;
}
return slow.data;
}
public static void main(String[] args){
Node head=new Node(1);
head=insertAtTail(head,2);
head=insertAtTail(head,3);
head=insertAtTail(head,4);
head=insertAtTail(head,5);
System.out.print(midpt(head));
Node head1=new Node(11);
head1=insertAtTail(head1,22);
head1=insertAtTail(head1,33);
head1=insertAtTail(head1,44);
head1=insertAtTail(head1,55);
head1=insertAtTail(head1,66);
System.out.print("\n"+midpt(head1));
	}
}