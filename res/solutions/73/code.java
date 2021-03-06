public class Solution {
    private static final int VER = Integer.MIN_VALUE + 1;
    private static final int HOR = Integer.MIN_VALUE + 2;
    private static final int ALL = Integer.MIN_VALUE + 3;

    public void setZeroes(int[][] matrix) {
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[i].length; ++j) {
                if (matrix[i][j] == 0) {
                    matrix[0][j] = matrix[0][j] == HOR || matrix[0][j] == ALL ? ALL : VER;
                    matrix[i][0] = matrix[i][0] == VER || matrix[i][0] == ALL ? ALL : HOR;
                }
            }
        }

        for (int i = 0; i < matrix.length; ++i) {
            if (matrix[i][0] == HOR || matrix[i][0] == ALL) {
                for (int j = 1; j < matrix[i].length; ++j) {
                    if (matrix[i][j] != VER) matrix[i][j] = 0;
                }
                matrix[i][0] = matrix[i][0] == ALL ? VER : 0;
            }
        }

        for (int i = 0; i < matrix[0].length; ++i) {
            if (matrix[0][i] == VER) {
                for (int j = 0; j < matrix.length; ++j) {
                    matrix[j][i] = 0;
                }
            }
        }
    }
}
