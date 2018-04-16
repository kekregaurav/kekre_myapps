package sort;

public class AllPaldrm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Count triplets with sum smaller than a given value
		int [] list = {-2, 0, 1, 3};//{5, 1, 3, 4, 7};
		final int sum = 2;//12;
		
		for(int i=0; i<(list.length-1) ; i++){
			
			for(int j=(i+2); j<list.length ; j++){
				
				if( (list[i] + list[i+1] + list[j] ) < sum){
					System.out.println(list[i] + ", " + list[i+1] +", "+list[j]);
				}
					
			}
		
		}
		
		

	}

}
