import java.util.*;
public class a3q12{
/*The idea is to construct a max-heap of elements. 
Since the top element of the max heap is the largest element of the heap, we will remove the top K-1 elements from the heap.  The top element will be Kth's Largest element.
To get the Kth Smallest element, we will use a min-heap. 
After the removal of the top k-1 elements, the Kth Smallest element is top of the Priority queue.
*/
static int q12(int[] a,int k){
PriorityQueue<Integer> pq= new PriorityQueue<>((x,y)->y-x);
int n = a.length;
for(int i=0; i<n; i++){
pq.add(a[i])  ;
}
int f=k-1;
while(f>0){
pq.remove();
f-- ;
}
return pq.peek();	
}
public static void main(String[] args){
int[] a={3, 10, 5, 20, 15};
System.out.println(q12(a,3));
int[] b={7, 4, 8, 2, 9};
System.out.println(q12(b,2));
}
}