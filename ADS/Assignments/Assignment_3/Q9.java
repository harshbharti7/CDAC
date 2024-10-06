class MinHeap{
static void heapify(int a[], int n, int i){
int smallest = i; //Root
int l = 2*i + 1; //LC
int r = 2*i + 2; //RC
if(l<n&&a[l]<a[smallest])smallest = l;
if(r<n&&a[r]<a[smallest])smallest = r;
if(smallest!= i){
int temp = a[i];
a[i] = a[smallest];
a[smallest] = temp;
heapify(a,n,smallest);
		}	
	}
static int[] buildmaxheap(int[] a){
int n=a.length;
//Building max heapify
for(int i = n/2-1; i >= 0; i--){
heapify(a,n,i);//Max heap
		}	
return a;
	}
}
public class a3q9{
public static void main(String[] args){
	
	}	
}