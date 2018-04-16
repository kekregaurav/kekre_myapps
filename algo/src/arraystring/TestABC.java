package arraystring;

import java.util.ArrayList;

public  class TestABC {
	
	volatile String s;

	public static  void   main(String[] args) {
		// TODO Auto-generated method stub
	  
	  String  s = "gaurav";
      String s1 = s;
      System.out.println("s: "+s + ", s1: "+s1);
      
      s1 = "kekre";
      System.out.println("s: "+s + ", s1: "+s1);
      
      ArrayList <String> a = new ArrayList <String>(3);
      
      
      a.add("Gaurav");
      a.add("Kekre");
      a.add("Vihaan");
      a.add("Kekre");
      System.out.println(a.size());
      
		
		int [][] data = { {123},{4,5,6} };
		int [][] copy = data.clone();
		
		copy[0][0] = 100;
		
		System.out.println("testing : "+data[0][0]+data.toString()+", " +data[1].toString());
		System.out.println("testing1 : " + copy[0][0]+data.toString() + ", "+ copy[1].toString());
		
		copy [1] = new int []{300, 400, 500};
		System.out.println("testing : "+data[1][1]+data.toString()+", " +data[1].toString());
		System.out.println("testing1 : " + copy[1][1]+data.toString()+", " +copy[1].toString());
		
	}

}
