package arraystring;


/*
 * Given a sorted array and a number x, find the pair in array whose sum is closest to x
 * */

public class ClosestSumOfPairInSortedArray {

	public static int diff;
	public static int a;
	public static int b; 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[] = {10, 22, 28, 29, 30, 40};
        int x = 54;
        findThePair(arr, x);
	}
    
	
	public static void findThePair(int [] arr, final int sum) {
		
		int l=0, r = arr.length -1;
		
		while(l<r) {
			
			int tempSum = arr[l] + arr[r];
			
			if(diff == 0 || diff > (Math.abs(sum - tempSum)) ) {
				diff = Math.abs(sum - tempSum);
				a = arr[l];
				b = arr[r];
			}
			
			if(tempSum > sum) {
				r--;
			}else if(tempSum < sum) {
				l++;
			}
		}
		
		System.out.println("The numbers are "+ a +", " + b);
		
	}
}
