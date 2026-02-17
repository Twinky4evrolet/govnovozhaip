import java.util.Scanner;
public class dk5 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("vvedi n: ");
        int sum = 0;
        int n = scan.nextInt();
        int count = 1;
        while (count <= n) {
            int res = 1;
            for (int i = 1; i <= count; i++) {
                res = res * i;
            }
            sum += res;
            count += 1;
        }
        System.out.println(sum);
    }
}