class Solution {
    public boolean isValidSudoku(char[][] board) {
      HashSet<Character>[] hmRows = new HashSet[9];
        HashSet<Character>[] hmCols = new HashSet[9];
        
         for(int i=0; i<9; i++){
            hmRows[i] = new HashSet<>();
            for(int j= 0; j<9; j++){
                char val = board[i][j];
                 if(val != '.'){
                    if(!hmRows[i].add(val)){
                        return false;
                    }
                }
            }
        }
        

         for(int i=0; i<9; i++){
            hmCols[i] = new HashSet<>();
            for(int j=0; j<9; j++){
                char val = board[j][i];
                if(val != '.'){
                    if(!hmCols[i].add(val)){
                       
                        return false;
                    }  
                }
            }
        }
        
        for(int iRow = 0; iRow < 9 ; iRow+=3){
            for(int iCol = 0; iCol < 9; iCol +=3){
                HashSet<Character> box = new HashSet<>();
                for(int i=0; i<3; i++){
                    for(int j=0; j<3; j++){
                        char val = board[iRow+i][iCol+j];
                        
                            if(val != '.'){
                                if(!box.add(val)){
                                    
                                    return false;
                                }
                            }
                    }
                   
                }
               
            }
        }
        return true;
        

	    
	}
}

