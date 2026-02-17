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
            int maxel = findmax(mass);
            System.out.println(maxel);
        }
    }

    public static int findmax(int[] massa) {
        int maxim = massa[0];
        for (int i: massa){
            if (i > maxim) {
                maxim = i;
            }
        }
        return maxim;
    }
}