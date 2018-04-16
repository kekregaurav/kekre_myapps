package arraystring;

import java.util.ArrayList;

public class Test123 {

	
	public static void printFibo(final int pLimit, int prev, int next){
		
		int temp = 0;
				
		if((prev + next) >= pLimit){
			return;
		}
		
				
		System.out.print((next) +", ");
		
		if((prev + next) == 0){
			next++;
		}else{
			temp = prev;
			prev = next;
			next = next + temp;
		}
		
		
		printFibo(pLimit, prev, next);
		
	
	}
	
	
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		//printFibo(20, 0, 0);
		
		ArrayList <String> ar  = new ArrayList<String>(100);
		//System.out.println(ar.length);
	}*/
	
	public static void main(String[] args) { 
		//System.out.println(Math.min(-1.289, 0.0d)); 
		//A a = new B();
		//a.print();
		
		
	} 
}


interface c {
	
}

class A {
	
	public void print(){
		System.out.println("I a in Parent class");
	}
}

class B  {
	
	public void print(){
		System.out.println("I a in Child class" + (20+1/0));
	}
}
