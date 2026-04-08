public class main2 {
    static int max = 0 ;
    static void main(String[] args) {
        int[][] board = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        helper(board,0,0,0);
        System.out.println(max);

    }

    public static void helper(int[][] board, int i, int j, int sum) {
        if(i >= board.length) return;
        if(j >= board[0].length) return;
        if(board[i][j]<0 ) {
            board[i][j] = 0;
        }
        sum+=board[i][j];
        if(i==board.length-1 && j== board[0].length-1) {
            max = Math.max(max,sum);
            return;
        }
       helper(board, i, j+1, sum);
       helper(board, i+1, j, sum);
    }
}
