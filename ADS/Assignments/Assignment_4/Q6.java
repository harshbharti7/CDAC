public class q6 extends q1{
public static Node deleteDuplicates(Node head){
if(head==null||head.next==null) return head;
	Node newh= deleteDuplicates(head.next);
if(head.data==newh.data) return newh;
head.next=newh;
return head;

}	
public static void main(String[] args){
Node head=new Node(1);
head=insertAtTail(head,1);	
head=insertAtTail(head,2);	
head=insertAtTail(head,3);	
head=insertAtTail(head,3);	
head=insertAtTail(head,4);
printll(head);
head=deleteDuplicates(head);
System.out.println();
printll(head);
Node head1=new Node(7);
head1=insertAtTail(head1,7);	
head1=insertAtTail(head1,8);	
head1=insertAtTail(head1,9);	
head1=insertAtTail(head1,9);	
head1=insertAtTail(head1,10);
System.out.println();
printll(head1);
head1=deleteDuplicates(head1);
System.out.println();
printll(head1);	
}
}