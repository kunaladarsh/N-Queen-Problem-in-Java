package Complete_DSA;

public class N_QueenProblem {

    public static final int N = 4;
    public static int[] cols = new int[N];

    public static boolean isSafe(int row, int col) {
        for (int i = 0; i < row; i++) {
            if (cols[i] == col || Math.abs(cols[i] - col) == Math.abs(i - row)) {
                return false;
            }
        }
        return true;
    }

    public static void placeQueens(int row) {
        if (row == N) {
            printBoard();
            return;
        }
        for (int col = 0; col < N; col++) {
            if (isSafe(row, col)) {
                cols[row] = col;
                placeQueens(row + 1);
            }
        }
    }

    public static void printBoard() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (cols[i] == j) {
                    System.out.print("Q ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        placeQueens(0);
    }
}
