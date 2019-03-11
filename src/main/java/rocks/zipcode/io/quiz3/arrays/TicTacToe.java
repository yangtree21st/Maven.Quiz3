package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {

    private String[][] board;

    public TicTacToe(String[][] board) {
      this.board = board;
    }

    public TicTacToe() {
      board = new String[3][3];
    }



    public String[] getRow(Integer value) {
        String[] row = new String[3];


        for(int i =0;i<3;i++){
            row[i] = board[value][i];

        }

        return row;

        }



    public String[] getColumn(Integer value) {

        String[] column = new String[3];


        for(int j =0;j<3;j++){
            column[j] = board[j][value];

        }

        return column;

    }



    public Boolean isRowHomogenous(Integer rowIndex) {




            if (board[rowIndex][0] == board[rowIndex][1] && board[rowIndex][1] == board[rowIndex][2]){
                return true;

        }
        return false;
    }



    public Boolean isColumnHomogeneous(Integer columnIndex) {




        if (board[0][columnIndex] == board[1][columnIndex] && board[1][columnIndex] == board[2][columnIndex]){
            return true;

        }
        return false;
    }

    private boolean checkDiagonalsForWin() {

        return ((checkRowCol(board[0][0], board[1][1], board[2][2]) == true) || (checkRowCol(board[0][2], board[1][1], board[2][0]) == true));

    }
    private boolean checkRowCol(String c1, String c2, String c3) {

        return ((c1 != "") && (c1 == c2) && (c2 == c3));

    }



    public String getWinner() {
         String winner= "";

        for(int i=0;i<3;i++ ){
            if (isColumnHomogeneous(i)){
                winner = board [i][0];}
                else if (isRowHomogenous(i) ){
                    winner = board [0][i];
            }
                else if ( checkDiagonalsForWin())
                    winner = board[1][1];

        }
        return winner;
    }

    public String[][] getBoard() {
        return board;
    }
}
