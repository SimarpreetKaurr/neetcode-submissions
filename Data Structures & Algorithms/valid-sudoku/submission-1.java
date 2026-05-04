class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] hr = new HashSet[9];
        HashSet<Character>[] hc = new HashSet[9];

        for(int i=0;i<9;i++){
            hr[i] = new HashSet<>();

            for(int j=0;j<9;j++){
                char value = board[i][j];

                if(value != '.'){
                    if(!hr[i].add(value)){
                        return false;
                        //return;
                    }
                }
            }
        }

        for(int i=0;i<9;i++){
            hc[i] = new HashSet<>();
            for(int j=0;j<9;j++){
                char value = board[j][i];
                if(value != '.'){
                    if(!hc[i].add(value)){
                        return false;
                    }
                }
            }
        }


        for(int r = 0; r<9; r+=3){
            for(int c=0; c<9; c+=3){
                HashSet<Character> box = new HashSet<>();

                for(int i=0;i<3;i++){
                    for(int j=0;j<3;j++){
                        char value = board[r+i][c+j];

                        if(value != '.'){
                            if(!box.add(value)){
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
