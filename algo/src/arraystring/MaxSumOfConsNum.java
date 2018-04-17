package arraystring;

import java.util.SortedSet;
import java.util.TreeSet;

public class MaxSumOfConsNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr [] = {5, 1, -10, 7, -2};
       int maxSum = findMaxConsSum(arr);
       System.out.print(maxSum);
	}
	
	
	public static int findMaxConsSum(int [] arr) {
		int maxSum = 0;
		SortedSet s = new TreeSet<Integer>();
		
		for(int i=0; i<arr.length; i++) {
			
			maxSum = arr[i];
			
			for(int j=i+1; j<arr.length; j++) {
			
				if(maxSum < (maxSum + arr[j])) {
					maxSum = maxSum + arr[j];
				}else {
					s.add(maxSum);
					maxSum = maxSum + arr[j];
				}
			}
			
			
		}
		
		return ((Integer)s.last()).intValue();
	}

}
