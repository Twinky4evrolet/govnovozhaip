import java.util.Scanner;

public class maini {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Вычисление суммы для формулы\n∑(x^(3k-1))\n----\n(2k)! + k");
        System.out.println("Введите n");
        int n = scan.nextInt();
        System.out.println("Введите x");
        int x = scan.nextInt();
        System.out.println("Ответ: " + sumfunc(n, x));
    }

    private static float sumfunc(int n, int x) {
        float sum = 0;
        for (int i = 1; i < n + 1; i++) {
            float chislitel = power(x, 3*i-1);
            float znamenatel = (findfactorial(2 * i) + i);
            sum += chislitel / znamenatel;
        }
        return sum;
    }

    private static long findfactorial ( int x){
            long fact = 1;
            for (int i = 1; i < x + 1; i++) {
                fact *= i;
            }
            return fact;
    }
    
    private static float power(int base, int stepen){
        float result = 1;
        for (int i = 0; i < stepen; i++) {
            result *= base;
        }
        return result;
    }
}