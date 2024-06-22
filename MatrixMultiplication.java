public class MatrixMultiplication {
    public static void main(String[] args) {
        int rows1 = 2, cols1 = 3;
        int[][] matrix1 = { {1, 2, 3}, {4, 5, 6} };
        int rows2 = 3, cols2 = 2;
        int[][] matrix2 = { {7, 8}, {9, 10}, {11, 12} };
        int[][] product = multiplyMatrices(matrix1, matrix2, rows1, cols1, cols2);
        displayProduct(product);
    }
    
    public static int[][] multiplyMatrices(int[][] firstMatrix, int[][] secondMatrix, int rows1, int cols1, int cols2) {
        int[][] product = new int[rows1][cols2];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    product[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }
        return product;
    }
    
    public static void displayProduct(int[][] product) {
        System.out.println("Product of matrices:");
        for (int[] row : product) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
