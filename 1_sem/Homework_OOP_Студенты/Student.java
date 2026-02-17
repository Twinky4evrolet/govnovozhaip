public class Student {
    private String studentId;
    private String firstName;
    private String lastName;
    private int age;
    private double averageGrade;
    private String faculty;

    private static int totalStudents = 0;
    public static final String UNIVERSITY_NAME = "Казанский федеральный уник";

    public Student() {
        this("000000", "Иван", "Иванов", 18, 3.0, "ИТИС");
    }

    public Student(String studentId, String firstName, String lastName) {
        this(studentId, firstName, lastName, 18, 3.0, "ИТИС");
    }

    public Student(String studentId, String firstName, String lastName, int age, double averageGrade, String faculty) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.averageGrade = averageGrade;
        this.faculty = faculty;
        totalStudents++;
    }

    public String getStudentId() { return studentId; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public int getAge() { return age; }
    public double getAverageGrade() { return averageGrade; }
    public String getFaculty() { return faculty; }

    public void setStudentId(String studentId) {
        if (studentId != null && !studentId.isEmpty()) {
            this.studentId = studentId;
        } else {
            this.studentId = "000000";
        }
    }

    public void setFirstName(String firstName) {
        if (firstName != null && !firstName.isEmpty()) {
            this.firstName = firstName;
        } else {
            this.firstName = "Неизвестно";
        }
    }

    public void setLastName(String lastName) {
        if (lastName != null && !lastName.isEmpty()) {
            this.lastName = lastName;
        } else {
            this.lastName = "Неизвестно";
        }
    }

    public void setAge(int age) {
        if (age >= 16 && age <= 70) {
            this.age = age;
        } else {
            this.age = 18;
        }
    }

    public void setAverageGrade(double averageGrade) {
        if (averageGrade >= 0.0 && averageGrade <= 5.0) {
            this.averageGrade = averageGrade;
        } else {
            this.averageGrade = 3.0;
        }
    }

    public void setFaculty(String faculty) {
        if (faculty != null && !faculty.isEmpty()) {
            this.faculty = faculty;
        } else {
            this.faculty = "КФУ";
        }
    }

    public static int getTotalStudents() {
        return totalStudents;
    }

    public void displayInfo() {
        System.out.println("Студент: " + firstName + " " + lastName);
        System.out.println("Номер билета: " + studentId);
        System.out.println("Факультет: " + faculty);
    }

    public void displayInfo(boolean detailed) {
        if (detailed) {
            System.out.println("=== Полная информация о студенте ===");
            System.out.println("Имя: " + firstName);
            System.out.println("Фамилия: " + lastName);
            System.out.println("Номер билета: " + studentId);
            System.out.println("Возраст: " + age);
            System.out.println("Средний балл: " + averageGrade);
            System.out.println("Факультет: " + faculty);
        } else {
            displayInfo();
        }
    }

    public void updateGrade(double newGrade) {
        setAverageGrade(newGrade);
    }

    public void updateGrade(double newGrade, String subject) {
        setAverageGrade(newGrade);
        System.out.println("Оценка по предмету '" + subject + "' обновлена");
    }
}