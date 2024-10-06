class MaxHeap{
static void heapify(int a[], int n, int i){
int largest = i; //Root
int l = 2*i + 1; //LC
int r = 2*i + 2; //RC
if(l<n&&a[l]>a[largest])largest = l;
if(r<n&&a[r]> a[largest])largest = r;
if(largest != i){
int temp = a[i];
a[i] = a[largest];
a[largest] = temp;
heapify(a,n,largest);
		}	
	}
static int[] buildmaxheap(int[] a){
int n=a.length;
//Building max heapify
for(int i = n/2-1; i >= 0; i--){
heapify(a, n, i);//Max heap
		}	
return a;
	}
}
public class a3q10{
public static void main(String[] args){
MaxHeap maxh=new MaxHeap();
int[] a={12,7,15,5};
System.out.print(maxh.buildmaxheap(a));
}
}

