package arraystring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Panagram2 {
  /**
   * Iterate through each line of input.
   */
  public static void main(String[] args) throws IOException {
    InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
    BufferedReader in = new BufferedReader(reader);
    String line;
    while ((line = in.readLine()) != null) {
      
      System.out.println(line);
      
      char [] a = line.toLowerCase().toCharArray();
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
	       
			 System.out.println("NULL");
			
		 }else{
			 Iterator iter = t.iterator();
			 while (iter.hasNext()) {
			     System.out.print(iter.next());
			 }
		 }
    }
  }
}

