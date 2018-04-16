package arraystring;

import java.util.HashMap;

public class Cryptarithm {

	
	static boolean isCryptSolution(String[] crypt, char[][] solution) {

	  HashMap sol = new HashMap();
	  int count = 0;
	  long a =0, b=0, c=0;
	  
	  
	  for(int i=0; i<solution.length; i++){
		  sol.put(solution[i][0], solution[i][1]);
	  }
	  
	  for(int i=0; i<crypt.length; i++){
		  
		  String temp = crypt[i];
		  String numStr = "";
		  
		  while(count < temp.length()){
			  
			  numStr = numStr+ (Character)sol.get(temp.charAt(count));
			  
			  if(count ==0 && numStr.compareTo("0") == 0 && temp.length() > 1){
				  return false;
			  }
				  
			  count++;
		  }
		  
		  if(a == 0){
			  a = Long.parseLong(numStr);
		  }else if(b == 0){
			  b = Long.parseLong(numStr);
		  }else if(c == 0){
			  c = Long.parseLong(numStr);
			  
			  if(a+b != c)
				  return false;
		  }
		  
		  count = 0;
	  }
	  
	  return true;
	  
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] crypt = {"MMMMMMMMMMMMMM", "O", "O"};
		char [][] solution = {{'O', '0'},
		                          {'M', '1'},
		                          {'Y', '2'},
		                          {'E', '5'},
		                          {'N', '6'},
		                          {'D', '7'},
		                          {'R', '8'},
		                          {'S', '9'}};
		System.out.println(isCryptSolution(crypt, solution));

	}

}
