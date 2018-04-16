package sort;


class QuickSort {

	
	public int [] list = {52 ,19 ,35 ,71 ,60 ,33 ,77 ,89};
	//public int pivotVal = 0;
		
	QuickSort (int pListSize){
		list = new int [pListSize];
		list = new int [] {52 ,19 ,35 ,71 ,60 ,33 ,77 ,89};
		
	}
	
	public void createList(){
		
		/*int i =-1;
				
		while(++i < list.length){
			
			list[i] = (new Double( Math.random() * 99 )).intValue();
		}*/
		
		//pivotVal = list[list.length-1];
	}
	
	public void displayList(){
		
		for(int i : list){
			System.out.print(i + " ,");
		}
		
		
	}
	
	public int partition (int left, int right, int pPivotVal){
		
		
		int pLeft = left - 1;
		int pRight = right;
		
		while(true){
			
			while( list[++pLeft] < pPivotVal);
			
			while(pRight > 0 && list[--pRight] > pPivotVal);
			
			if(pLeft >= pRight)
				break;
			else{
			
				int temp = list[pLeft];
				list[pLeft] = list [right];
				list[right] = temp;
			}
		}
		
		return pLeft;
	}
	
	public void quickSort(int left, int right){
		
	  int newPivotPstn = 0;
	  
	  if(right == 1){
		  System.out.println();
	  }
	  if(left< right)
		  return;
	  else{
		  
		  int pivotVal = list[right];
		  newPivotPstn = this.partition(left, right, pivotVal);
		  
		   
		  this.quickSort(left, newPivotPstn-1);
		  this.quickSort(newPivotPstn+1, right);
		  
	  }
	
	}

}


public class QuickSortImpl {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		QuickSort qs = new QuickSort(8);
		qs.createList();
		qs.displayList();
		qs.quickSort(0, 7);
		//int partPstn = qs.partition(-1, 20, qs.pivotVal);
		System.out.println(" After Sort ");
		qs.displayList();
		//System.out.println("Partition Position : " + partPstn);
		

	}

}
