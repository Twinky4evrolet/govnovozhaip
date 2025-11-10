import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи x: ");
        double x = scanner.nextDouble();
        System.out.print("Введи y: ");
        double y = scanner.nextDouble();
        double distancezet = (x * x + y * y);
        double distance = 0;
        for (double i = 1; i <= distancezet; i = i + 0.001) {
        	if (i * i >= distancezet) {
        		distance = i;
        		break;
        	}
        }
        boolean vistrel = false;
        int circleNumber = 0;
        for (int p = 1; p <= 10; p++) {
            if (distance <= p) {
                vistrel = true;
                circleNumber = p;
                break;
            }
        }
        if (vistrel) {
            System.out.println("Точка попала в круг номер " + circleNumber);
        } else {
            System.out.println("missed");
        }
    }
}
