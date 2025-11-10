import java.util.Scanner;
public class Zad2 {
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		float a = myScanner.nextFloat();
		float b = myScanner.nextFloat();
		if (a > b) {
			System.out.println("Число " + a + "больше числа " + b);
		} else if (a < b) {
			System.out.println("Число " + b + "больше числа " + a);
		} else {
			System.out.println("Числа равны");
		}
	}
}