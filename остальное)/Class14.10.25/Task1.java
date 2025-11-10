import java.util.Scanner;

public class Task11 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int n = scan.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Введите " + ( i + 1) + " элемент массива: ");
            array[i] = scan.nextInt();
            System.out.println();
        }

        if (checksum(array[0]) == checksum(array[n - 1])) {
            System.out.println("Да, сумма цифр первого равна сумме цифр последнего");
        } else {
            System.out.println("Нет, сумма цифр первого НЕ равна сумме цифр последнего");
        }
    }
    
    private static int checksum(int numb){
        int sum = 0;
        while (numb > 0) {
            sum += numb % 10;
            numb /= 10;
        }
        return sum;
    }
}