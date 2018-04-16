package threads;

import java.util.concurrent.atomic.AtomicInteger;

public class TwoThreadAddition {
    
	static AtomicInteger rslt1 = new AtomicInteger();
	static AtomicInteger rslt2 = new AtomicInteger();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Thread(new Add(3,5)).start();
		new Thread(new Add(1,2)).start();
		
		while(true){
			if(rslt1.get() == 0)
				continue;
			if(rslt2.get() == 0)
				continue;
			break;
		}
		
		System.out.println(rslt1.get() * rslt2.get());

	}
	
	static class Add implements Runnable{
		
		int a, b;
		
		public Add(int n, int m){
			a = n;
			b = m;
		}
		
		public void run(){
			
			if(rslt1.get() == 0){
				rslt1.set(a+b);
			}else if( rslt2.get() == 0){
				rslt2.set(a+b);
			}
		}
	}

}
