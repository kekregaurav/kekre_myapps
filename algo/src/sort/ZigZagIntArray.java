package sort;

public class ZigZagIntArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a [] = {20, 12, 9, 8, 5, 25};//{4, 3, 7, 8, 6, 2, 1};
		
		for(int i=0; i< (a.length -1) ; i++){
			
			if(i % 2 == 0){
				if(a[i] > a[i+1]){
					int tem = a[i];
					a[i] = a[i+1];
					a[i+1] = tem;
					
				}
			}else {
				
				if(a[i] < a[i+1]){
					int tem = a[i];
					a[i] = a[i+1];
					a[i+1] = tem;
					
				}
				
			}
			
		}
		
		for(int i=0; i< (a.length) ; i++){
		    System.out.print(a[i] + ", ");
		}

	}

}
