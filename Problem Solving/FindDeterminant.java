public class FindDeterminant {
    public static void main(String[] args) {

        double[][] matrix = {
            {1, 2, 4, 6, 7},
            {4, 6, 8, 17, 98},
            {5, 12, 36, 1, 4},
            {5, 2, 9, 13, 20},
            {14, 5, 3, 12, 3}
        };

        System.out.println(getDeterminant(matrix));
    }

    public static int getDeterminant(double[][] matrix) {
        int result = 1;

        // Create upper triangle matrix with ERO
        for (int col = 0; col < matrix.length - 1; col++) {
            for (int row = col + 1; row < matrix.length; row++) {
                double factor = matrix[row][col] / matrix[col][col]; 
                for (int i = col; i < matrix.length; i++) {
                    matrix[row][i] -= matrix[col][i] * factor;
                }
                // displayMatrix(matrix);
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            result *= matrix[i][i];
        }

        return result;
    }

    private static void displayMatrix(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.printf("%-10s ", matrix[i][j]);
                if (j == matrix.length - 1) System.out.println();
            }
        }
        System.out.println("\n");
    }
}