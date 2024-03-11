package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    private Character[][] matrix;
    public Board(Character[][] matrix) {
        this.matrix = matrix;
    }

    public Boolean isInFavorOfX() {
        return checkWinner('X', matrix);
    }

    public Boolean isInFavorOfO() {
        return checkWinner('O', matrix);
    }

    private boolean checkWinner(char symbol, Character [][] matrix) {
        int row = matrix.length;
        int column = matrix[0].length;

        boolean winner = false;
        for (int i = 0; i < row; i++) {
                if (matrix[0][i].equals(symbol) && matrix[1][i].equals(symbol) && matrix[2][i].equals(symbol)) {
                    winner = true;
                }
                else if (matrix[i][0].equals(symbol) && matrix[i][1] == symbol && matrix[i][2] == symbol) {
                    winner = true;
                }
                else if (matrix[0][0].equals(symbol) && matrix[1][1].equals(symbol) && matrix[2][2].equals(symbol)) {
                    winner = true;
                }
                else if (matrix[2][0].equals(symbol) && matrix[1][1].equals(symbol) && matrix[0][2].equals(symbol)) {
                    winner = true;
                }
        }
        return winner;
    }

    public Boolean isTie() {
        boolean tie = false;
        if (getWinner() == "") {
            tie = true;
        }
        return tie;
    }

    public String getWinner() {
        if(isInFavorOfX()) {
            return "X";
        }
        else if (isInFavorOfO()) {
            return "O";
        }
        else {
            return "";
        }
    }
}
