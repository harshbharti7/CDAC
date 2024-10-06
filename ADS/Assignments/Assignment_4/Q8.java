public class q8 extends q7{
private static Node reverseDLL(Node head) {
if(head == null || head.next == null) {
return head; 
}
Node last = null;
Node current = head;
while(current != null){
last = current.prev;
current.prev = current.next;
current.next = last;
current = current.prev;
}
return last.prev;
}
public static void main(String[] args){
Node head=new Node(5);
head=insertattail(head,10);
head=insertattail(head,15);
head=insertattail(head,20);
print(head);
head=reverseDLL(head);
print(head);
Node h1=new Node(4);
h1=insertattail(h1,8);
h1=insertattail(h1,12);
print(h1);
h1=reverseDLL(h1);
print(h1);
}
}