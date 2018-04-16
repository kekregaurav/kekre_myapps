package arraystring;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class PanagramString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String str = "Jived fox nymph grabs quick walt";
         char [] a = str.toLowerCase().toCharArray();
         SortedSet<Character> t = new TreeSet<Character>();
         
         //Add all the alphabets from a to z in a sorted Set
         for(int i=97; i<123; i++){
        	
        	t.add(new Character((char)i));
        }
         
	     for(int i=0; i<a.length; i++){
	    	 
	    	 if(a[i] == ' ')
	    		 continue;
	    	 
	    	 t.remove(new Character(a[i]));//remove the alphabet from the sorted set
	    	 
	    	 if(t.size() == 0){//break from loop when all 26 alphabets are added
	    		 
	    		 break;
	    	 }
	     }
	     
	     if(t.size() == 0){
			 System.out.println("Is Panagram !!!");
			
		 }else{
			Iterator i = t.iterator();
			while(i.hasNext()) {
				System.out.print(i.next());
			}
		 }
         
        
	}

}
