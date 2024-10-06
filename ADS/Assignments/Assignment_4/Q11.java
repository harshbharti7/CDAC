class Pair {
Node first;
Node second;

Pair(Node first, Node second) {
this.first = first;
this.second = second;
}
}
public class q12 extends q1{
static Pair splitList(Node head){
Node slow = head;
Node fast = head;
if (head==null){
return new Pair(null, null);
}
while (fast.next!=head&& fast.next.next!=head){
fast = fast.next.next;
slow = slow.next;
}
if(fast.next.next==head){
fast = fast.next;
}
Node head1 = head;
Node head2 = slow.next;
fast.next = slow.next;
slow.next = head;
return new Pair(head1, head2);
}
public static void main(String[] args){
Node h=new Node(10);
h=insertAtTail(h,20);
h=insertAtTail(h,30);
h=insertAtTail(h,40);
h.next.next.next.next=h;//circular
Pair res=splitList(h);
Node h1=res.first;
Node h2=res.second;
printll(h1);
printll(h2);
}
}