package arraystring;

public class Sort123 {

	
	  public static int[] digitRootSort(int[] a) {

	    for(int i=0; i<a.length; i++){
	        
	        for(int j=i+1; j<a.length; j++){
	            
	            if( getDigitRoot(a[j]) < getDigitRoot(a[i]) ){
	                int temp = a[j];
	                a[j] =   a[i];
	                a[i] = temp;
	                
	            }
	            
	            if( getDigitRoot(a[j]) == getDigitRoot(a[i]) 
	               && a[j] < a[i]){
	                int temp = a[j];
	                a[j] =   a[i];
	                a[i] = temp;
	                
	            }
	        }
	    }
	    
	    return a;
	}

	public static int getDigitRoot(int pVal){
	    int digRt = 0;
	    
	    if(pVal < 10)
	        return pVal;
	    
	    while(pVal >= 10){
	        digRt = digRt + (pVal % 10);
	        pVal = pVal/10;
	        
	        if(pVal < 10)
	            digRt = digRt + pVal;
	    }
	    
	    
	    
	   return digRt ;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {100, 22, 4, 11, 31, 103};
		digitRootSort(a);
	}

}
