public class q5 extends q1{
public static int nthfromend(Node head,int n){
	Node temp=head;
	if(temp==null) return head.data;
	for(int i=1;i<n;i++){
		temp=temp.next;
	}
	Node prev=head;
	while(temp!=null&&temp.next!=null){
		prev=prev.next;
		temp=temp.next;
	}
	return prev.data;
}
public static void main(String[] args){
Node head=new Node(10);
head=insertAtTail(head,20);
head=insertAtTail(head,30);
head=insertAtTail(head,40);
head=insertAtTail(head,50);
printll(head);
System.out.print("\n"+nthfromend(head,2)+"\n");
Node head1=new Node(5);
head1=insertAtTail(head1,15);
head1=insertAtTail(head1,25);
head1=insertAtTail(head1,35);
printll(head1);
System.out.print("\n"+nthfromend(head1,4));
	}
}