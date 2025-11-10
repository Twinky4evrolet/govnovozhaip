import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Book Book1 = new Book();

        String result1 = Book1.displayInfo();
        System.out.println("1 " + result1);

        Book1.borrowBook();

        String result12 = Book1.displayInfo();
        System.out.println("2 " + result12);

        Book1.returnBook();

        String result13 = Book1.displayInfo();
        System.out.println("3 " + result13);

        System.out.println("NewYearBook: ");
        int newYear = scan.nextInt();
        Book1.updateYear(newYear);

        String result14 = Book1.displayInfo();
        System.out.println("4 " + result14);
    }
}