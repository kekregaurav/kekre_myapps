package arraystring;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class PanagramString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String str = "Jived fox nymph grabs quick waltz";
         char [] a = str.toLowerCase().toCharArray();
         Set<Character> s = new LinkedHashSet<Character>();
         SortedSet<Character> t = new TreeSet<Character>();
         
         //Add all the alphabets from a to z in a sorted Set
         for(int i=97; i<123; i++){
        	
        	t.add(new Character((char)i));
        }
         
	     for(int i=0; i<a.length; i++){
	    	 
	    	 if(a[i] == ' ')
	    		 continue;
	    	 
	    	 s.add(new Character(a[i]));//add the alphabet from the sorted set
	    	 t.remove(new Character(a[i]));//remove the alphabet from the sorted set
	    	 
	    	 if(s.size() == 26){//break from loop when all 26 alphabets are added
	    		 
	    		 break;
	    	 }
	     }
	     
	     if(s.size() == 26){
			 System.out.println("Is Panagram !!!");
			
		 }else{
			 System.out.println("NOT Panagram !!!" + t);
		 }
         
        
	}

}
