package sort;

public class BubbleSort {

	
	public static int[] bubbleSort(int [] a){
		
		for(int i=a.length-1; i>1; i--){
			
			for(int j=0; j<i; j++){
				
				if(a[j] > a[j+1]){
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		
		
		return a;
	}
	
	
   public static int[] selectionSort(int [] a){
	   
	   int minPstn = 0;
	  
	   
		for(int i=0; i<a.length-1; i++){
			
			minPstn = i;
			
			for(int j=i+1; j<a.length; j++){
				
				if(a[j] < a[minPstn]){
					minPstn = j;
				}
			}
			
			if(minPstn != i){
				int temp = a[minPstn];
				a[minPstn] = a[i];
				a[i] = temp;
			}
		}
		
		return a;
	}
   
   
   public static int[] insertionSort(int a[]){
	   
	   int temp = 0;
	   int in = 0, out=0;
	   
	   for(out=1; out<a.length; out++){
		   
		   temp = a[out];
		   in = out;
		   
		   while(in>0 && a[in-1] >= temp){
			   
			   a[in] = a[in-1];
			   --in;
		   }
		   
		   a[in] =  temp;
	   }
     
	   return a;
   }
   
   
   public static int[] merge(int a[], int b[]){
	   
	   int fnl [] = new int [a.length + b.length];
	   int i=0,j=0;
	   
	   for( ; i<a.length || j<b.length; i++, j++){
		   
		   if(i<a.length && j<b.length){
			   if(a[i]<=b[j]){
				   fnl[i] = a[i];
			   }else{
				   
				   fnl[j] = b[j];
			   }
		   }else{
		   
			   if(i<a.length){
				   
				   fnl[i] = a[i];
			   }
			   
			   if(j<b.length){
				   
				   fnl[j] = b[j];
			   }
		   }
	   }
	   
	  
	   
	   return fnl;
   }
   
   
	
	
	public static void main(String[] args) {

      int a[] = {10,6,1,8,5,2,4,3,7,9};
      //a = bubbleSort(a);
      //a = selectionSort(a);
      //a = insertionSort(a);
      
      a= merge(new int []{3,5,6,7}, new int [] {1,2,4,8,9, 10});
      for(int j=0; j<a.length; j++){
        System.out.print(a[j] + ", ");
      }
	}

}
