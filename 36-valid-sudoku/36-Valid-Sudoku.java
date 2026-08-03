class Solution {
    public boolean isValidSudoku(char[][] board) {

        for (int row = 0; row < 9; row++) {
            HashSet<Character> set = new HashSet<>();
            for (int i = 0; i < 9; i++) {
                if (board[row][i] == '.') {
                    continue;
                }
                if (set.contains(board[row][i])) {
                    return false;
                }
                set.add(board[row][i]);
            }
        }

        for (int col = 0; col < 9; col++) {
            HashSet<Character> set = new HashSet<>();
            for (int i = 0; i < 9; i++) {
                if (board[i][col] == '.') {
                    continue;
                }
                if (set.contains(board[i][col])) {
                    return false;
                }
                set.add(board[i][col]);
            }
        }

        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {

                HashSet<Character> set = new HashSet<>();

                for (int r = i; r < i + 3; r++) {
                    for (int c = j; c < j + 3; c++) {

                        if (board[r][c] == '.')
                            continue;

                        if (set.contains(board[r][c]))
                            return false;

                        set.add(board[r][c]);
                    }
                }
            }
        }

        return true;
    }
}