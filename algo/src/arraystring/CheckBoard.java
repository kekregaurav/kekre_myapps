package arraystring;

import java.util.ArrayList;
import java.util.Hashtable;

public class CheckBoard {

	public static void main(String[] args) {
		
		String word = "ABCCED";
		doesItExists(getBoard(), word);
		

	}
	
	private static char[][] getBoard(){
		char[][] myBoard = {{'A','B','C','E'},
						  {'S','F','C','S'}, 
						  {'A','D','E','E'} 
						};
		return myBoard;
	}
    
	
	private static void doesItExists(char[][] board, String word) {
		if (doesWrdExists(word, createHashTable(board, 3, 4))) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}
	
	
	private static boolean doesWrdExists(String word, Hashtable<Integer, ArrayList<PosXY>> hashtable) {
		if(word == null){
			return true;
		}
		ArrayList<PosXY> list = hashtable.get(word.charAt(0)-'A');
		if(list == null){
			return false;
		}
		for (PosXY position : list) {
			position.visited = true;
			if(isSubStrOfWrdExists(word.substring(1),hashtable,position)){
				return true;
			}
			position.visited = false;
		}
		return false;
	}
	
	//This method calls itself recursively for each substring of the word to check if it exists in the matrix. 

	private static boolean isSubStrOfWrdExists(String substring, Hashtable<Integer, ArrayList<PosXY>> hashtable,
			PosXY position) {
		if(substring.equals("")){
			return true;
		}
		ArrayList<PosXY> list = hashtable.get(substring.charAt(0)-'A');
		if(list == null){
			return false;
		}
		if(substring.length() == 1){
			for (PosXY neghPos : list) {
				if(neghPos.visited == true){
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
			for (PosXY neghPos : list) {
				neghPos.visited = true;
				if(isSubStrOfWrdExists(substring.substring(1), hashtable, neghPos)){
					return true;
				}
				neghPos.visited = false;
			}
		}
		
		return false;
	}
	
	
	public static Hashtable<Integer, ArrayList<PosXY>> createHashTable(char[][] board, int length, int width){
		Hashtable<Integer, ArrayList<PosXY>> occurancePositions = new Hashtable<Integer,ArrayList<PosXY>>(26);
		for(int i=0;i<length;i++){
			for(int j=0;j<width;j++){
				ArrayList<PosXY> list = occurancePositions.get(board[i][j] -'A');
				if(list == null){
					list = new ArrayList<PosXY>();
					occurancePositions.put(board[i][j] -'A', list);
				}
				list.add(new PosXY(i, j));
			}
		}
		return occurancePositions;
	}
	
	//To store the positions of 2D array and to keep track if that position is already traversed or not. 
}

class PosXY{
	int x;
	int y;
	boolean visited;
	
	public PosXY(int x,int y) {
		this.x = x;
		this.y = y;
		visited = false;
	}
}
