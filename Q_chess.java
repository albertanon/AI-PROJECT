public class Q_chess {
    public static boolean issafe(char board[][],int row,int col){
        //vertical up
        for(int i=row-1;i>-1;i--){
            char idx=board[i][col];
            if(idx=='Q'){
                return false;
            }
        }
        //digonal left up
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        //digonal right up
        for(int i=row-1,j=col+1;i>=0 && j< board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        return true;
    }
    public static void nQueen(char board[][],int row){
        //base case
        if (row ==board.length){
            print(board);
            return;
        }
        for(int i=0;i<board.length;i++){
            if(issafe(board,row,i)) {
                board[row][i] = 'Q';
                nQueen(board, row + 1);
                board[row][i] = 'x';
            }
        }

    }
    public static void print(char board[][]){
        System.out.println("-------chess board-------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+"  ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=10;
        char board[][]=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='x';
            }
        }
        nQueen(board,0);

    }
}
