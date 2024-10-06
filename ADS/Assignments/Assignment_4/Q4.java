public class q4 extends q1{
public static Node merge(Node l1,Node l2){
if(l1==null) return l2;
if(l2==null) return l1;
if(l1.data<l2.data) {
	l1.next= merge(l1.next,l2);
	return l1;
	}
else{ l2.next=merge(l1,l2.next);
return l2;
}
}
public static void main(String[] args){
Node head1=new Node(1);
Node head2=new Node(2);
Node head3=new Node(10);
Node head4=new Node(12);
head1=insertAtTail(head1,3);
head1=insertAtTail(head1,5);
head2=insertAtTail(head2,4);
head2=insertAtTail(head2,6);
head3=insertAtTail(head3,15);
head3=insertAtTail(head3,20);
head4=insertAtTail(head4,18);
head4=insertAtTail(head4,25);

printll(head1);System.out.println();
printll(head2);
head1=merge(head1,head2);
System.out.println();
printll(head1);
System.out.println();
printll(head3);System.out.println();
printll(head4);
head3=merge(head3,head4);
System.out.println();
printll(head3);
}
}