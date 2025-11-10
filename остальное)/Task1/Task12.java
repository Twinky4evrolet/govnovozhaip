import java.util.Scanner;

public class Task12{
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int ch10 = scan.nextInt();
        String ch2 = "";
        while (ch10 > 0) {
            String popka = String.valueOf(ch10 % 2);
            ch2 = popka + ch2;
            ch10 = ch10 / 2;
        } {
            System.out.println(ch2);
        }
    }
}