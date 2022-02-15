package leetCode;

public class WordSearch {

	
	  private char[][] board;
	  private int ROWS;
	  private int COLS;
	
	public boolean exist(char[][] board, String word) {
		 	this.board = board;
		    ROWS = board.length;
		    COLS = board[0].length;

		    for (int row = 0; row < ROWS; ++row) {
		      for (int col = 0; col < COLS; ++col) {
		        if (backtrack(board,row, col, word, 0))
		          return true;
		      }
		    }
		    return false;	        
	    }
	
	
	protected boolean backtrack(char[][] board,int row, int col, String word, int index) {
	    /* Step 1). check the bottom case. */
	    if (index >= word.length())
	      return true;

	    /* Step 2). Check the boundaries. */
	    if (row < 0 || row == this.ROWS || col < 0 || col == this.COLS
	        || board[row][col] != word.charAt(index))
	      return false;

	    /* Step 3). explore the neighbors in DFS */
	    boolean ret = false;
	    // mark the path before the next exploration
	    this.board[row][col] = '#';

	     ret= backtrack(board,row-1,col,word,index+1)||
	    			 backtrack(board,row+1,col,word,index+1)||
	    			 backtrack(board,row,col-1,word,index=1)||
	    			 backtrack(board,row,col+1,word,index+1);

	    /* Step 4). clean up and return the result. */
	    this.board[row][col] = word.charAt(index);
	    return ret;
	  }

	
	public static void main(String[] args) {
		WordSearch obj= new WordSearch();
		System.out.println(obj.exist(new char[][] {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}},"ABCCED"));

	}

}
