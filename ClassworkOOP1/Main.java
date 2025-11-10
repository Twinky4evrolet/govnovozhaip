package Student;

public class Main {
	public static void main(String[] args){
		Student student = new Student();
		Student student1 = new Student("Robert", "Mirgaleev", "11-504");
		Student student2 = new Student("Robert", "Mirgaleev", "11-504", 18, 86.0, true);
		System.out.println(student);

		String result = student2.displayInfo();
		System.out.println(result);
		studend2.transferToNewGroup("11-541");
	}
}