import java.util.Scanner;

public class dk3 {
    public static void main(String args[]){
        Scanner mysc = new Scanner(System.in);
        System.out.println("vedi schislo n: ");
        int n = mysc.nextInt();
        float sum = 0;
        int count = 1;
        int vari = n;
        while (count <= n) {
            sum += vari;
            vari *= n;
            count += 1;
        }
        System.out.println(sum);
    }
}