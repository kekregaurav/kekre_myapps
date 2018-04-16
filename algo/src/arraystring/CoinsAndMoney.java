/*
 * Your quirky boss collects rare, old coins...
They found out you're a programmer and asked you to solve something they've been wondering for a long time.

Write a function that, given:

an amount of money
a list of coin denominations
computes the number of ways to make the amount of money with coins of the available denominations.

Example: for amount=44 (44¢) and denominations=[1,2,3][1,2,3] (11¢, 22¢ and 33¢), your program would output 44—the number of ways to make 44¢ with those denominations:

1¢, 1¢, 1¢, 1¢
1¢, 1¢, 2¢
1¢, 3¢
2¢, 2¢
*
*/


package arraystring;

import java.util.HashMap;

public class CoinsAndMoney {
	
	static final int money = 4;
	static final int [] coins = {1,2,3};
	static HashMap h = new HashMap();
	
	public static void putCoinsInHashMap(){
		
		
		for(int c: coins){
			h.put(new Integer(c), new Integer(c));
		}
	}
	
	public static int allPermu(){
		
		//for(int i=0; )
		
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
