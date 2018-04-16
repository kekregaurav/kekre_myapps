package sort;

class IntArray {
	public int [] intArray = null;
	
	
	public IntArray (int pSize){
		intArray = new int [pSize];
	}
	
	public boolean hasStraight (int[] args){
		
		int i=0;
		int count = 0;
		
		while (i< (args.length -1)){
			
			if( args[i] == args[i+1]){
				
				i++;
				continue;
			}
			
			if( (args[i] + 1) == args [++i] ){
				count++;
				
			}else{
				count = 0;
			}
				
		    if(count == 5)
		    	return true;
			
		}
		
		return false;
	}
}

public class IntCons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IntArray iA = new IntArray(10);
		
		/*System.out.println( iA.hasStraight(new int[]{1,2,3,4,5,6,7}));
		System.out.println( iA.hasStraight(new int[]{-1,2,2,2,3,4,5,6,7}));
		System.out.println( iA.hasStraight(new int[]{-1,2,2,2,3,4,5}));*/
		
		System.out.println( iA.hasStraight(new int[]{-1,0,1,2,2,2,3,3,3,4,5,5}));
		

	}

}
