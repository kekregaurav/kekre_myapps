package arraystring;

import java.util.ArrayList;
import java.util.Iterator;

public class SubArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {54, 4, 45, 6, 0, 52};
		int x = 51;
		ArrayList aList = new ArrayList<Integer>();
		Object aListFinal[] = null;
		int sum = 0;
		int numOfItem = 0;
		boolean done = false;
		int size = arr.length;
		
		for(int j=0; j<arr.length; j++) {
			
			
			for(int i=j; i<arr.length; i++){
				
				aList.add(new Integer(arr[i]));
				
	            if(arr[i] > x){
	            	
	            	aList = new ArrayList<Integer>(); 
	            	aList.add(new Integer(arr[i]));
	            	done = true;
					break;
				}
				
				sum += arr[i];
				
				if(sum > x){
					break;
				}
				
			}
			
			if(done){
				size = aList.size();
				aListFinal = new Integer[aList.size()];
				aListFinal = aList.toArray();
				break;
			}
			
			if(sum <= x){
				sum = 0;
				aList =  new ArrayList<Integer>();
				continue;
			}
			
			if(size > aList.size()){
				size = aList.size();
				aListFinal = new Integer[aList.size()];
				aListFinal = aList.toArray();
				
			}
			
			sum = 0;
			aList =  new ArrayList<Integer>();
			
			
			
		}
		
      for(int k=0; k<aListFinal.length; k++){
    	  System.out.print( ((Integer)aListFinal[k]).intValue() + " ,");
      }

	}

}
