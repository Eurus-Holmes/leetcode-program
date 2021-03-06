public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0) return false;
        if (matrix[0].length == 0) return false;

        int n = matrix[0].length;

        int l = 0;
        int r = matrix.length;
        int mid = 0;

        while (l < r) {
            mid = (l + r) / 2;
            if (matrix[mid][0] == target) return true;
            if (matrix[mid][0] > target) r = mid;
            else if (matrix[mid][n - 1] >= target) break;
            else l = mid + 1;
        }

        if (mid == matrix.length) return false;

        int[] row = matrix[mid];

        l = 0;
        r = row.length;

        while (l < r) {
            mid = (l + r) / 2;
            if (row[mid] == target) return true;
            if (row[mid] > target) r = mid;
            else l = mid + 1;
        }

        return false;
    }
}
