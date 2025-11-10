import java.util.Scanner;

public class Task11{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int b = scan.nextInt();
        int joper = 0;
        int fnf = 1;
        while (b>0) {
            int digit = b % 10;
            joper = joper + digit * fnf;
            fnf = fnf * 2;
            b = b / 10;
        }
        System.out.println(joper);
    }
}
