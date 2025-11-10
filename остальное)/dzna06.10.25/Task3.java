import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Введите количество строк:");
        int lines = scan.nextInt();
        System.out.println("Введите количество столбцов:");
        int columns = scan.nextInt();
        int[][] matrix = new int[lines][columns];
        
        System.out.println("Введите элементы матрицы:");
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }
        
        for (int i = 0; i < lines; i++) {
            boolean found = false;
            for (int j = 0; j < columns; j++) {
                if (isPrime(matrix[i][j]) && isPrime(sumDigits(matrix[i][j]))) {
                    found = true;
                    break;
                }
            }
            if (found) {
                System.out.println("В строке " + (i + 1) + " найдено подходящее число");
            } else {
                System.out.println("В строке " + (i + 1) + " нет подходящих чисел");
            }
        }
    }
    
    private static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    private static int sumDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
