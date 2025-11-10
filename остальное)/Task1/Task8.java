import java.util.Scanner;

public class Task8{
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        for (int i = 1; i <= 10; i++){
            int res = i * n;
            System.out.printf("%d * %d = %d \n", n, i, res);
        }
    }
}