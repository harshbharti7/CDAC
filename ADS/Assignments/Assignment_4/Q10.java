public class q10 extends q1{
public static Node findNthnode(Node head,int k){
	int cnt=1;
	while(head!=null){
		if(cnt==k) return head;
		cnt++;
		head=head.next;
	}
	return null;
}
public static Node rightrotate(Node head,int k){
if(head==null||head.next==null||k==0) return head;
Node tail=head;
int len=1;
while(tail.next!=null){
	len++;
	tail=tail.next;
}
tail.next=head;
k=k%len;
if(k==0) {
tail.next=null;
return head;
}
Node newTail=findNthnode(head,len-k);
head=newTail.next;
newTail.next=null;
return head;
	}
public static Node leftrotate(Node head,int k){
if(head==null||head.next==null||k==0) return head;
Node tail=head;
int len=1;
while(tail.next!=null){
	len++;
	tail=tail.next;
}
tail.next=head;

k=k%len;
int knew=len-k;
if(knew==0) {
tail.next=null;
return head;
}
Node newTail=findNthnode(head,len-knew);
head=newTail.next;
newTail.next=null;
return head;
}
public static void main(String[] args){
Node head=new Node(10);
head=insertAtTail(head,20);	
head=insertAtTail(head,30);	
head=insertAtTail(head,40);	
head=insertAtTail(head,50);
printll(head);
System.out.println();
head=leftrotate(head,2);
printll(head);	
System.out.println();
Node head1=new Node(5);
head1=insertAtTail(head1,10);	
head1=insertAtTail(head1,15);	
head1=insertAtTail(head1,20);	
printll(head1);
System.out.println();
head1=leftrotate(head1,2);
printll(head1);	
}
}