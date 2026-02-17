public class Student {

	private String firstName;
	private String lastName;
	private int age;
	private String group;
	private double averageGrade;
	private boolean isActive;

	public Student(){
		this("Name", "LastName", "11-504", 18, 0.0, true);
	}

	public Student(String firstName, String lastName, String group){
		this(firstName, lastName, group, 18, 0.0, true);
	}

	public Student(String firstName, String lastName, String group, int age, double averageGrade, boolean isActive){
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.group = group;
		this.averageGrade = averageGrade;
		this.isActive = isActive;
	}

	public String displayInfo(){
		String result = firstName + "\n" + lastName + "\n" + group;
		return result;
	}
	public void updateGrade(double newGrade) {
        this.averageGrade = newGrade;
    }
    public void activateStudent() {
        this.isActive = true;
    }
    public void deactivateStudent() {
        this.isActive = false;
    }
    public void transferToNewGroup(String newGroup) {
        System.out.println("Студент переведен из группы " + this.group + " в группу " + newGroup);
        this.group = newGroup;
    }
}