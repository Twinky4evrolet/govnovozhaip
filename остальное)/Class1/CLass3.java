import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Vvedi razmer massiva: ");
        int razmer = scan.nextInt();
        int[] mass = new int[razmer];
        for (int i = 0; i < razmer; i++) {
            mass[i] = scan.nextInt();
        }
        if (mass.length == 0){
            System.out.println("Ты лох!");
        } else {
            System.out.println(findotricalo(mass));
        }
    }

    public static boolean findotricalo(int[] massa) {
        for (int i: massa){
            if (i < 0) {
                return true;
            }
        }
        return false;
    }
}