import java.util.Scanner;

public class dk6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("vvedi x: ");
        double x = scanner.nextDouble();
        System.out.print("vvedi n: ");
        int n = scanner.nextInt();
        double sum = 0.0;
        double factorial = 1.0;
        double stepen = 1.0;
        for (int k = 1; k <= n; k++) {
            factorial *= k;
            stepen *= x;
            sum += factorial * stepen;
        }
        System.out.println(sum);
    }
}