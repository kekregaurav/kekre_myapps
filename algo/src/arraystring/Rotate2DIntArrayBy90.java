package arraystring;

public class Rotate2DIntArrayBy90 {

	
	static int[][] rotateImage(int[][] a) {
      
		int b[][] =  new int[a.length][a.length];
		int temp =0;
		
		for(int i=0; i<a.length; i++){
			
			for(int j=0; j<a.length; j++){
				b[j][(a.length-1) -i] = a[i][j]; 
				
			}
		}
		
		return b;
	}
	
	
	public static void main(String[] args) {
		int a[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
		
		a = rotateImage(a);
		
        for(int i=0; i<a.length; i++){
			
			for(int j=0; j<a.length; j++){
				System.out.print(a[i][j] + ", ");
		    }
			
			System.out.println(1%3);
		}
	}

}
