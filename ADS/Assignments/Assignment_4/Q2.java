public class q2 extends q1{
public static Node reverseList(Node head){
Node temp=head,prev=null;
while(temp!=null){
	Node front=temp.next;
	temp.next=prev;
	prev=temp;
	temp=front;
}	
return prev;
}
public static void main(String[] args){
Node head=new Node(1);
head=insertAtTail(head,2);
head=insertAtTail(head,3);
head=insertAtTail(head,4);
head=insertAtTail(head,5);
System.out.print("linked list: ");
printll(head);
System.out.print("\nafter reversing: ");
head=reverseList(head);
printll(head);
Node head1=new Node(10);
head1=insertAtTail(head1,20);
head1=insertAtTail(head1,30);
System.out.print("\nlinked list: ");
printll(head1);
head1=reverseList(head1);
System.out.print("\nafter reversing: ");
printll(head1);

	}
}