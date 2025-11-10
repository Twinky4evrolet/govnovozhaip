import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int gencount = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество строк в массиве");
        int razmer1 = scan.nextInt();
        System.out.println("Введите количество столбцов в массиве");
        int razmer2 = scan.nextInt();
        Random rand = new Random();
        int[][] array = new int[razmer1][razmer2];
        for (int i = 0; i < razmer1; i++) {
            for (int j = 0; j < razmer2; j++) {
                array[i][j] = rand.nextInt(100);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < razmer1; i++) {
            int count = 0;
            for (int j = 0; j < razmer2; j++) {
                if (checkchetnix(array[i][j])) {
                    count += 1;
                }
            }
            if (count == 1) {
                gencount += 1;
            }
        }
        if (gencount == razmer1) {
            System.out.println("Da");
        } else {
            System.out.println("Lox");
        }
    }
    
    private static boolean checkchetnix(int numb){
       boolean flag = true;
       while (numb > 0) {
           if ((numb % 10) % 2 == 0) {
               flag = true;
           } else {
               flag = false;
           }
           numb /= 10;
       }
       if (flag == true) {
           return true;
       } else {
           return false;
       }
    }
}