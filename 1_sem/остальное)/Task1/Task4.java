import java.util.Scanner;
public class Task3 {
	public static void main(String[] args){
		Scanner fg = new Scanner(System.in);
		float a = fg.nextFloat();
		float b = fg.nextFloat();
		if (a == b) {
			System.out.println("Числа равны");
		} else {
			System.out.println("Числа различны");
		}
	}
}