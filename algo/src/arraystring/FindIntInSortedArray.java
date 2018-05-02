package arraystring;

import java.util.Calendar;

public class FindIntInSortedArray {

	
	public static int binSearch(int [] pArr, int p){
		
	    //int pos = -1;
	    int beg = 0, len = pArr.length;
	    int end = len-1;
		
	    while(p >= pArr[beg] && p <= pArr[end]){
			
	    	if(p == pArr[beg])
	    		return beg;
	    	if(p == pArr[end])
	    		return end;
	    	
	    	if(p >= pArr[(beg+end)/2]){
	    		beg = (beg+end)/2;
	    		
	    	} else if(p < pArr[end/2]){
	    		end = end/2 -1;
	    	}
		}
		
		return -1;
	}
	
	
	public static void main(String[] args) {
     
		int [] a = {10, 20, 30, 40, 50, 60, 70, 80, 100};
		
		int pos = binSearch(a, 20);
	    System.out.println("The int found at position : " + pos);
	}

}
