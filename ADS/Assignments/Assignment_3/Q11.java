class HeapSort{
void heapify(int arr[], int n, int i){
int largest = i; //Root
int l = 2*i + 1; //LC
int r = 2*i + 2; //RC
if(l<n&&arr[l]> arr[largest]) largest = l;
if(r<n&&arr[r]>arr[largest])largest = r;
if(largest != i){
int temp = arr[i];
arr[i] = arr[largest];
arr[largest] = temp;
heapify(arr, n, largest);
	}
}
void heapsort(int arr[]){
int n=arr.length;
//Building max heapify
for(int i = n/2-1; i >= 0; i--){
heapify(arr, n, i);//Max heap
}
//one by one extract elements from the heap
for(int i=n-1; i>0;i--){
//replace root node with last element
int temp = arr[0];
arr[0] = arr[i];
arr[i] = temp;
heapify(arr,i,0);
	}
}
void display(int arr[]){
int n = arr.length;
for(int i=0;i<n;i++){
System.out.print(arr[i]+ " ");
}
System.out.println();
	}
}
public class a3q11{
public static void main(String args[]){
HeapSort h = new HeapSort();
int arr[] = {99, 66, 77, 44, 33, 88, 11};
h.display(arr);
h.heapsort(arr);
h.display(arr);
		}
}