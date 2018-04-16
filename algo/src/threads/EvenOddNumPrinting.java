package threads;

import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;

public class EvenOddNumPrinting {

	static AtomicBoolean isOdd = new AtomicBoolean(true);
	static Semaphore s = new Semaphore(1, true);	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Thread O1 = new Thread(new Odd());
        Thread E1 = new Thread(new Even());
        
        
        O1.start();
        E1.start();
        
	}
	
	static class Odd implements Runnable{
		
		
		public void run(){
			
			int i=1;
						
			while(i<26){
			   
				synchronized(isOdd){
					
					if(isOdd.get()){
						 System.out.println(i);
						 i = i+2;
						 isOdd.set(false);
					}else{
						continue;
					}
				}
			}
			
		}
	}
	
   static class Even implements Runnable{
		
		
		public void run(){
			int i=2;
					
			while(i<25){
			   
				synchronized(isOdd){
					
					if(!isOdd.get()){
						 System.out.println(i);
						 i = i+2;
						 isOdd.set(true);
					}else{
						continue;
					}
				}
			}
			
		}
	}

}


/*
import java.util.concurrent.CountDownLatch;

public class EvenOddNumPrinting {
	public static void main(String[] args)  {
		try{
		CountDownLatch latch = new CountDownLatch(1);
		Thread even = new NumberPrinter(latch, true);
		Thread odd = new NumberPrinter(latch, false);
		even.start();
		odd.start();

		even.join();
		odd.join();
		} catch(Exception e) {}
	}
	public static void main1()
	{}
}

class NumberPrinter extends Thread {
	CountDownLatch latch;
	boolean isEven;

	NumberPrinter(CountDownLatch o, boolean isEven) {
		this.latch = o;
		this.isEven = isEven;
	}

	@Override
	public void run() {
		if (isEven) {
			try {
				for (int i = 0; i <= 100; i++) {
					synchronized (latch) {
						System.out.print(" " + 2 * i);
						latch.countDown();
						latch.notify();
						if (i < 100)
							latch.wait();
					}
				}
			} catch (InterruptedException e) {
				e.printStackTrace();

			}
		} else {
			try {
				latch.await();
				for (int i = 0; i < 100; i++) {
					synchronized (latch) {
						System.out.print(" " + (2 * i + 1));
						latch.notify();
						if (i < 100)
							latch.wait();
					}
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

*/
