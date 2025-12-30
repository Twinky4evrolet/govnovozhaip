public class StudentManager {
    private Student[] students;
    private Course[] courses;
    private int studentCount;
    private int courseCount;

    private static final int MAX_STUDENTS = 100;
    private static final int MAX_COURSES = 50;

    public StudentManager() {
        students = new Student[MAX_STUDENTS];
        courses = new Course[MAX_COURSES];
        studentCount = 0;
        courseCount = 0;
    }

    public void addStudent(Student student) {
        if (student != null && studentCount < MAX_STUDENTS) {
            students[studentCount] = student;
            studentCount++;
        } else if (studentCount >= MAX_STUDENTS) {
            System.out.println("Достигнут лимит студентов!");
        }
    }

    public void addCourse(Course course) {
        if (course != null && courseCount < MAX_COURSES) {
            courses[courseCount] = course;
            courseCount++;
        } else if (courseCount >= MAX_COURSES) {
            System.out.println("Достигнут лимит курсов!");
        }
    }

    public void addStudentToCourse(Student student, Course course) {
        if (student != null && course != null) {
            course.enrollStudent(student.getStudentId());
            System.out.println("Студент " + student.getFirstName() + " " + student.getLastName() +
                    " добавлен на курс " + course.getCourseName());
        }
    }

    public Student findStudentById(String studentId) {
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getStudentId().equals(studentId)) {
                return students[i];
            }
        }
        System.out.println("Студент с ID " + studentId + " не найден");
        return null;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public int getCourseCount() {
        return courseCount;
    }
}