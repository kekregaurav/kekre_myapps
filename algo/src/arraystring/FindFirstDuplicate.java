package arraystring;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

public class FindFirstDuplicate {

	
	public static int firstDuplicate(int[] a) {
		   
		   int pstn = -1;
		   //int isize = (a.length % 2)==1? (a.length/2)+1 : a.length/2;
		   
		   for(int i=0; i<a.length; i++){
		      
		      for(int j=(i+1); j<(a.length); j++){
		        
		         
		         if(a[i] == a[j] && (j<pstn || pstn<0)){
		            pstn = j;
		            break;
		         }
		         
		     }
		   }
		   
		   return (pstn<0?-1:a[pstn]);
	}
	
	
	public static int firstDuplicateV2(int[] a) {
		   
		   int pstn = -1;
		   HashMap m = new HashMap();
		   
		   
		   for(int i=0; i<a.length; i++){
		      
			  if(!m.containsKey(new Integer(a[i]))){
				  
				  m.put(new Integer(a[i]), new Integer(i*-1));
			  }else{
				  
				 int val = ((Integer)m.get(new Integer(a[i]))).intValue();
				 if(val <= 0){
					 m.put(new Integer(a[i]), new Integer(i));
					 if(i < pstn || pstn == -1){
						 pstn = i;
					 }
				 }
			  }
		      
		   }
		   
		   return (pstn<0?-1:a[pstn]);
	}
	
	public static char firstNonRepeatingChar(String s){
		
		Vector <Character>set = new Vector();	
		Vector <Character>setDupEle = new Vector();
		char [] a = s.toCharArray();
		char val = '-';
		
		for(char c : a){
			
			Character charC = new Character(c);
			
			
			
			if(!set.contains(charC) ){
				if(setDupEle.contains(charC)){
					continue;
				}
				set.add(charC);
			}else{
				if(set != null && set.size() > 0){
				  set.remove(charC);
				  setDupEle.add(charC);
				}
				
			}
		}
		
		if(set != null && set.size() > 0){
			val = ((Character)set.get(0)).charValue();
		}
		
		
		return val;
	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {2, 3, 4, 1, 3, 2, 1};
		
        //System.out.println(firstDuplicateV2(a));
        
        System.out.println(firstNonRepeatingChar("abacabad"));
	}

}
