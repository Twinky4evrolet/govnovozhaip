import java.util.Scanner;

public class dk4 {
    public static void main(String args[]){
        Scanner mysc = new Scanner(System.in);
        System.out.println("vedi schislo n: ");
        int n = mysc.nextInt();
        float sum = 0;
        int count = 1;
        int vari = 2;
        while (count <= n) {
            sum += vari;
            vari *= 2;
            count += 1;
        }
        System.out.println(sum);
    }
}