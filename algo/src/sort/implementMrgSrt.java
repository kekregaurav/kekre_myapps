package sort;

class MergeSort {
	
	int [] workspace;
	int [] sortedArr;
	
	public MergeSort(){
		workspace = new int[]{10, 7, 1,30, 5};
		sortedArr = new int[workspace.length];
	}
	
	public void doMergeSort (){
		
		doMergeSort(0, this.workspace.length-1);
	}
	
	private void doMergeSort(int low, int high) {
		if (low != high) {
			// find the midpoint of the current array
			int mid = (low + high)/2;
			
			// sort the first half
			doMergeSort(low,mid);
						
			// sort the second half
			doMergeSort(mid+1,high);
			
			// merge the halves
			merge(low,mid,high);
			}
		}
	
	private void merge(int low, int mid, int high){
		
		int i=low, j=mid+1, k=0;
		
		while(true){
			
			while(i<=mid && j<=high){
			   	if(workspace[i] < workspace[j]){
			   		sortedArr[k++] = workspace[i++];
			   	}else{
			   		sortedArr[k++] = workspace[j++];
			   	}
			}
			
			while(i<=mid){
				sortedArr[k++] = workspace[i++];
			}
			
			while(j<=high){
				sortedArr[k++] = workspace[j++];
			}
			
			if(i>=mid || j>=high){
				return;
			}
		}
	}
	
	public void displaySortedArray(){
		
		for(int i=0; i<this.workspace.length; i++){
			System.out.println(this.sortedArr[i]+ ", ");
		}
	}

}

public class implementMrgSrt {
	

	public static void main(String[] args) {
		MergeSort a = new MergeSort();
		a.doMergeSort();
		a.displaySortedArray();
		
	}
}
