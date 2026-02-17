import java.util.Scanner;

public class Task6{
	public static void main(String[] args){
		Scanner chisl = new Scanner(System.in);
		System.out.println("Введи x:");
		float x = chisl.nextFloat();
		System.out.println("Введи y:");
		float y = chisl.nextFloat();
		System.out.println("Введи радиус:");
		int radius = chisl.nextInt();
		if (((x * x) + (y * y)) < radius * radius){
			System.out.println("точка в круге");
		}else if (((x * x) + (y * y)) == (radius * radius)){
			System.out.println("точка на линии");
		}else{
			System.out.println("точка не в круге");
		}
	}
}