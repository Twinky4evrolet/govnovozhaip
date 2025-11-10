import java.util.Scanner;

public class Task13{
	public static void main(String[] args){
		Scanner vvod = new Scanner(System.in);
		int a = -1000;
		int vvodchislo = 0;
		while (vvodchislo > a){
			a = vvodchislo;
			vvodchislo = vvod.nextInt();
		}
	}
}