package arraystring;

public class Sudoku {

	
	static boolean sudoku2(char[][] grid) {

		for(int i=0; i<grid.length; i++){
			
			for(int j=0; j<grid.length; j++){
				
				if(grid[i][j] == '.'){
					continue;
				}else{
					if( !(checkSubGrid(i,j,grid))){
						return false;
					}
					
					//check the entire row
					
					for(int row=i+1; row<9; row++){
						if(grid[row][j] == grid[i][j]){
							return false;
						}
					}
					
					//check the entire col
					
					for(int col=j+1; col<9; col++){
						if(grid[i][col] == grid[i][j]){
							return false;
						}
					}
					
				}
				
			}
        }
		
		return true;
    }
	
	static boolean checkSubGrid(int m, int n, char [][] grid){
		
		int i= m;
		int j= n;
		
		if(i<3){
			i=0;
		}else if(i>2 && i<6){
			i=3;
		}else if(i>5){
			i=6;
		}
		
		if(j<3){
			j=0;
		}else if(j>2 && j<6){
			j=3;
		}else if(j>5){
			j=6;
		}
		
		for(int k=i; k<(i+3); k++){
			
			for(int l=j; l<(j+3); l++){
				
				if(grid[k][l] == '.'){
					continue;
				}
				
				if(k==m && l==n){
					continue;
				}
				
				if(grid[k][l] == grid[m][n]){
					return false;
				}
				
			}
			
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char [][] grid = {{'.', '.', '.', '1', '4', '.', '.', '2', '.'},
		                  {'.', '.', '6', '.', '.', '.', '.', '.', '.'},
		                  {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
		                  {'.', '.', '1', '.', '.', '.', '.', '.', '.'},
		                  {'.', '6', '7', '.', '.', '.', '.', '.', '9'},
		                  {'.', '.', '.', '.', '.', '.', '8', '1', '.'},
		                  {'.', '3', '.', '.', '.', '.', '.', '.', '6'},
		                  {'.', '.', '.', '.', '.', '7', '.', '.', '.'},
		                  {'.', '.', '.', '5', '.', '.', '.', '7', '.'}};
		
		System.out.println(sudoku2(grid));

	}

}
