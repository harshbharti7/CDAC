public class q9 extends q1{
public static Node addNums(Node l1,Node l2){
Node dummy=new Node(-1);
Node temp=dummy;
int carry=0;
while((l1!=null||l2!=null)||carry==1){
int sum=0;
if(l1!=null){
sum+=l1.data;
l1=l1.next;
	}
if(l2!=null){
sum+=l2.data;
l2=l2.next;
	}
sum+=carry;
carry=sum/10;
Node newn=new Node(sum%10);
temp.next=newn;
temp=temp.next;
	}
return dummy.next;
}
public static void main(String[] args){
Node h1=new Node(2);
h1=insertAtTail(h1,4);
h1=insertAtTail(h1,3);
Node h2=new Node(5);
h2=insertAtTail(h2,6);
h2=insertAtTail(h2,4);
Node res=addNums(h1,h2);
printll(res);
System.out.println();
Node h3=new Node(9);
h3=insertAtTail(h3,9);
h3=insertAtTail(h3,9);
Node h4=new Node(1);
Node res1=addNums(h3,h4);
printll(res1);
}
}