class Node{
int data;
Node next;
Node prev;
Node(int data1,Node next1,Node prev1){
this.data=data1;
this.next=next1;
this.prev=prev1;
}
Node(int data1){
this.data=data1;
this.next=null;
this.prev=null;
}
}
public class q7{
protected Node head;
public static void print(Node head){
while (head != null){
System.out.print(head.data + " ");
head = head.next; 
}
System.out.println();
}
public static Node insertathead(Node head,int val){
if(head==null) return new Node(val);
	Node newn=new Node(val);
	newn.next=head;
	newn.prev=null;
	if(head!=null) head.prev=newn;
	head=newn;
	return head;
}
public static Node insertattail(Node head, int k) {
Node newn = new Node(k);
if (head == null) {
return newn;
}
Node temp = head;
while(temp.next != null) {
temp = temp.next;
}
temp.next=newn;
newn.prev=temp;
return head;
}
public static Node insert(Node head,Node last,int val){
if(last==null) return null;
Node newn=new Node(val);
newn.next=last.next;
newn.prev=last;
if(newn.next!=null) newn.next.prev=newn;	
return head;
}
public static Node delete(Node head,Node n){
if(head==null||n==null) return null;
if(head==n){ 
head=head.next;
return head;
}
if(n.next!=null){ 
n.next.prev=n.prev;	
n.prev.next=n.next;
}
return head;
}
public static void main(String[] args){
try{Node head=new Node(10);
head=insertattail(head,20);	
head=insertattail(head,30);	
print(head);
head=delete(head,head.next);
print(head);
Node h1=new Node(1);
h1=insertattail(h1,2);
h1=insertattail(h1,3);
print(h1);
h1=delete(h1,h1);
print(h1);
}catch(NullPointerException e){e.printStackTrace();}
}
}