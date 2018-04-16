package arraystring;

import java.util.ArrayList;
import java.util.Hashtable;

public class CheckBoard {

	public static void main(String[] args) {
		CheckBoard checkBoard = new CheckBoard();
		String word = "ABCCED";
		checkBoard.checkIfExists(getBoard(), word);
		

	}
	
	private static char[][] getBoard(){
		char[][] board = {{'A','B','C','E'},
						  {'S','F','C','S'}, 
						  {'A','D','E','E'} 
						};
		return board;
	}
    
	//Helper method that  prints final output
	private void checkIfExists(char[][] board, String word) {
		if (isWordExists(word, constructLists(board, 3, 4))) {
			System.out.println("Exists");
		} else {
			System.out.println("Does not exists");
		}
	}
	
	/*Helper method to check if word really exists, this method takes two parameters the word which is string 
	 * and a HashTable which is getting passed from the method checkIfExists. 
	 * 
	 * */
	private boolean isWordExists(String word, Hashtable<Integer, ArrayList<Position>> hashtable) {
		if(word == null){
			return true;
		}
		ArrayList<Position> list = hashtable.get(word.charAt(0)-'A');
		if(list == null){
			return false;
		}
		for (Position position : list) {
			position.traversed = true;
			if(isSubWordExists(word.substring(1),hashtable,position)){
				return true;
			}
			position.traversed = false;
		}
		return false;
	}
	
	//This method calls itself recursively for each substring of the word to check if it exists in the matrix. 

	private boolean isSubWordExists(String substring, Hashtable<Integer, ArrayList<Position>> hashtable,
			Position position) {
		if(substring.equals("")){
			return true;
		}
		ArrayList<Position> list = hashtable.get(substring.charAt(0)-'A');
		if(list == null){
			return false;
		}
		if(substring.length() == 1){
			for (Position neghPos : list) {
				if(neghPos.traversed == true){
					continue;
				}
				if(position.x == neghPos.x){
					if(Math.abs(position.y-neghPos.y) == 1){
						return true;
					}
				}else if(position.y == neghPos.y){
					if(Math.abs(position.x-neghPos.x) == 1){
						return true;
					}
				}
			}
			return false;
		}else{
			for (Position neghPos : list) {
				neghPos.traversed = true;
				if(isSubWordExists(substring.substring(1), hashtable, neghPos)){
					return true;
				}
				neghPos.traversed = false;
			}
		}
		
		return false;
	}
	
	//This method creates and return a HashTable with key as position which is Integer, and each Integer represents a 
	//position in the matrix. and the corresponding value for each hashTable key is a List of the Position class. 
	public Hashtable<Integer, ArrayList<Position>> constructLists(char[][] board, int length, int width){
		Hashtable<Integer, ArrayList<Position>> occurancePositions = new Hashtable<Integer,ArrayList<Position>>(26);
		for(int i=0;i<length;i++){
			for(int j=0;j<width;j++){
				ArrayList<Position> list = occurancePositions.get(board[i][j] -'A');
				if(list == null){
					list = new ArrayList<Position>();
					occurancePositions.put(board[i][j] -'A', list);
					System.out.println((board[i][j] -'A'));
				}
				list.add(new Position(i, j));
			}
		}
		return occurancePositions;
	}
	
	//To store the positions of 2D array and to keep track if that position is already traversed or not. 
	class Position{
		int x;
		int y;
		boolean traversed;
		
		public Position(int x,int y) {
			this.x = x;
			this.y = y;
			traversed = false;
		}
	}

}
