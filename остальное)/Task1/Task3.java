import java.util.Scanner;
public class Task3 {
	public static void main(String[] args){
		Scanner fg = new Scanner(System.in);
		float a = fg.nextFloat();
		float b = fg.nextFloat();
		float c = fg.nextFloat();
		if ((a > b) && (a > c)) {
			System.out.println("Число "+ a +" максимальное");
		} else if ((b > a) && (b > c)) {
			System.out.println("Число"+ b + " максимальное");
		} else if ((c > b ) && (c > a)) {
			System.out.println("Число"+ c + " максимальное");
		}
	}
}