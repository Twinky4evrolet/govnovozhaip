import java.util.Scanner;

public class Task10 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        int original = number;
        int razrad = 1;
        while (original > 0) {
            razrad *= 10;
            original /= 10;
        }
        razrad /= 10;
        original = number;
        boolean flag = true;
        while (razrad > 0) {
            int digit = original / razrad;
            if (digit != 0) {
                if (flag) {
                    System.out.print(digit * razrad);
                    flag = false;
                } else {
                    System.out.print(" + " + digit * razrad);
                }
            }
            original %= razrad;
            razrad /= 10;
        }
    }
}
