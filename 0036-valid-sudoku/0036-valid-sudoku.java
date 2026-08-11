class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> seen = new HashSet<>();
        for(int r = 0; r < 9; r++){
            for(int c= 0; c < 9; c++){
                if(board[r][c] == '.'){
                    continue;
                }
                char num = board[r][c];

                String row = num + "in row" + r;
                String col = num + "in col" + c;
                String box = num + "in box" + (r/3)*3+c/3;

                if(!seen.add(row) || !seen.add(col) || !seen.add(box)){
                    return false;
                }

            }
        }
        return true;
        
    }
}