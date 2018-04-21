package sort;

public class HeapSort {

	public static void main(String[] args) {
		
		int [] arr = {5,2,1,10,7,6};
		
		for(int i= (arr.length/2+1); i>=0; i--)
		   heapify(arr,arr.length, i);
		
		for(int i=(arr.length - 1); i>=0; i--) {
			int temp = arr[i];
			arr[i] = arr[0];
			arr[0] = temp;
			
			heapify(arr,i, 0);
			
		}
		
		for(int i: arr)
		 System.out.print(i + ", ");
       
	}
	
	public static void heapify(int [] arr, int size, int index) {
		
		int largest = index;
		int l = index * 2 + 1;
		int r = index * 2 + 2;
		
		if(l<size && arr[l] > arr[largest]) {
			largest = l;
		}
		
		if(r<size && arr[r] > arr[largest]) {
			largest = r;
		}
		
		if(largest != index) {
			int temp = arr[index];
			arr[index] = arr[largest];
			arr[largest] = temp;
			
			heapify(arr, size, largest);
		}
		
		
	}

}
