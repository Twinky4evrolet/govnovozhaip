public class Task5 {
    public static void main(String[] args){
        int n = 5;
        int center = (n / 2);
        int[][] array = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == center || j == center) {
                    array[i][j] = 1;
                } else {
                    array[i][j] = 0;
                }
            }

        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
