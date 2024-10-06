import java.util.*;
class Node {
int data;      // the data value
Node next;      // the reference to the next Node in the linked list
// Constructors
Node(int data1, Node next1) {
this.data = data1;  // Initialize data with the provided value
this.next = next1;  // Initialize next with the provided reference
	}
Node(int data1) {
this.data = data1;  // Initialize data with the provided value
this.next = null;   // Initialize next as null since it's the end of the list
	}
}
public class q1 {
protected Node head;
public static void printll(Node head){
	while(head!=null){
		System.out.print(head.data+" ");
		head=head.next;
	}
}
public static Node insertAthead(Node head,int val){
	Node temp=new Node(val,head);
	return temp;
}
public static Node insertAtTail(Node head,int val){
	if(head==null) return new Node(val);
	Node temp=head;
	while(temp.next!=null)temp=temp.next;
	Node last=new Node(val);
	temp.next=last;
	return head;
}
public static Node insert(Node head,Node prev,int val){
	Node newn=new Node(val);
	newn.next=prev.next;
	prev.next=newn;
	return head;
}
public static boolean searchNode(Node head,int val){
	Node temp=head;
	if(head==null) return false;
	while(temp!=null){
		if(temp.data==val) return true;
		temp=temp.next;
	}
	return false;
}
public static Node deleteNodeKey(Node head,int key){
Node temp=head,prev=null;
if(temp!=null&&temp.data==key){
	head=temp.next;
	return head;
}	
while(temp!=null &&temp.data!=key){
	prev=temp;
	temp=temp.next;
}
if(temp==null) return null;
prev.next=temp.next;
return head;
}
public static Node deletePos(Node head,int pos){
Node temp=head;
if(head==null)return null;
if(pos==0){
	head=head.next;
	return head;
}
for(int i=0;i<pos-1 &&temp!=null;i++){
	temp=temp.next;
}
if(temp==null||temp.next==null) return head;
Node next=temp.next.next;
temp.next=next;
return head;
}

public static void main(String[] args) {
Node head=new Node(3);
head=insertAtTail(head,7);
head=insertAtTail(head,5);
head=deleteNodeKey(head,7);
System.out.print("list: ");
printll(head);
System.out.print("\nfound= "+searchNode(head,5));
Node head1=new Node(9);
head1=insertAtTail(head1,4);
head1=deleteNodeKey(head1,4);
System.out.print("\nlist: ");
printll(head1);
System.out.print("\nfound= "+searchNode(head1,10));

}
}
