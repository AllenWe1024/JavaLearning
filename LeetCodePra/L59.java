public class L59 {
    public int[][] generateMatrix(int n) {
        int[][] results = new int[n][n];
        int loop = n / 2;
        int startX = 0;
        int startY = 0;
        int offset = 1;
        int count = 1;
        int mid = n / 2;
        while (loop > 0) {
            int i = startX;
            int j = startY;

            for (; j < startY + n - offset; j++) {
                results[startX][j] = count++;
            }
            for (; i < startX + n - offset; i++) {
                results[i][j] = count++;
            }
            for (; j > startY; j--) {
                results[i][j] = count++;
            }
            for (; i > startX; i--) {
                results[i][startY] = count++;
            }
            loop--;
            startX++;
            startY--;
            offset += 2;
        }
        if (n % 2 == 1) {
            results[mid][mid] = count;
        }
        return results;
    }

    public static void main(String[] arg) {
        int[] a1 = {1, 2, 3, 4, 5};
        L27 s1 = new L27();
        int b = s1.removeElement(a1, 3);
        System.out.println(b);
    }
}
