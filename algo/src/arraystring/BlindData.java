package arraystring;

import java.util.HashMap;

public class BlindData {

	/*public static int f(int n){
		int c = 3;
		return c = (n % 2 != 0) 
				? c+1 : n+10;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		System.out.print(f(0) + "," + f(1)+ "," + f(2));
//		System.out.print(
//    		  String.format("%d, %d, %d\n", f(0), f(1), f(2)) 
//    		   );
       
	}
*/
	
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int count =0;
		
		while(true){
			count++;
			
			if(count == 10){
				break;
			} else{
				continue;
			}
		}
		
		System.out.print(count);
       
	}*/
	
	
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> ss = new HashMap<Integer, String>();
		
		ss.put(1, "System Full");
		ss.put(2, "System Empty");
		ss.put(3, "System Restored");
		
		System.out.print('_');
		System.out.print(ss.get(1));
		System.out.print('_');
		System.out.print(ss.get(2));
	}*/
	
	
	///////
	/*public static boolean f(int n){
		boolean b = (n==0);
		return !b  ||  !!b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<1000; i++){
			if(! f(i))
				System.out.println(i); 
		}
	}*/
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int y= 10;
		
		System.out.print(f(y));
	}
	
	public static int f(int x){
		return x;
	}
}
