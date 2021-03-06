public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix.length == 0) return Collections.emptyList();

        int m = matrix.length;
        int n = matrix[0].length;

        int[] dx = new int[]{0, 1, 0, -1};
        int[] dy = new int[]{1, 0, -1, 0};

        int x = 0;
        int y = 0;

        int d = 0;

        List<Integer> ans = new LinkedList<>();

        while (true) {
            if (matrix[x][y] != Integer.MAX_VALUE) {
                ans.add(matrix[x][y]);
                matrix[x][y] = Integer.MAX_VALUE;
            }

            if (ans.size() == m * n) break;

            int nextX = x + dx[d];
            int nextY = y + dy[d];
            if (nextX < 0 || nextX >= m || nextY < 0 || nextY >= n
                    || matrix[nextX][nextY] == Integer.MAX_VALUE) {
                d = (d + 1) % 4;
                x += dx[d];
                y += dy[d];
            } else {
                x = nextX;
                y = nextY;
            }
        }

        return ans;
    }
}
