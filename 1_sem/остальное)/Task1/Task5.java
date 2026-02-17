import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи x: ");
        double x = scanner.nextDouble();
        System.out.print("Введи y: ");
        double y = scanner.nextDouble();
        System.out.print("Введите n: ");
        int n = scanner.nextInt();
        int polovina = n / 2;
        boolean isInside = (x >= -polovina && x <= polovina) &&
                          (y >= -polovina && y <= polovina);
        if (isInside) {
            System.out.println("Точка попадает в квадрат");
        } else {
            System.out.println("Точка не попадает в квадрат");
        }
    }
}
