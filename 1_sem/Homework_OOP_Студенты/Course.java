public class Course {
    private String courseCode;
    private String courseName;
    private int maxStudents;
    private int currentStudents;
    private boolean isActive;

    private static int totalCourses = 0;
    public static final int MAX_CREDITS_PER_SEMESTER = 30;

    public Course() {
        this("CS101", "Программирование", 30, 0, true);
    }

    public Course(String courseCode, String courseName, int maxStudents) {
        this(courseCode, courseName, maxStudents, 0, true);
    }

    public Course(String courseCode, String courseName, int maxStudents, int currentStudents, boolean isActive) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.maxStudents = maxStudents;
        this.currentStudents = currentStudents;
        this.isActive = isActive;
        totalCourses++;
    }

    public String getCourseCode() { return courseCode; }
    public String getCourseName() { return courseName; }
    public int getMaxStudents() { return maxStudents; }
    public int getCurrentStudents() { return currentStudents; }
    public boolean isActive() { return isActive; }

    public void setCourseCode(String courseCode) {
        if (courseCode != null && !courseCode.isEmpty()) {
            this.courseCode = courseCode;
        } else {
            this.courseCode = "CS000";
        }
    }

    public void setCourseName(String courseName) {
        if (courseName != null && !courseName.isEmpty()) {
            this.courseName = courseName;
        } else {
            this.courseName = "Неизвестный курс";
        }
    }

    public void setMaxStudents(int maxStudents) {
        if (maxStudents > 0) {
            this.maxStudents = maxStudents;
        } else {
            this.maxStudents = 30;
        }
    }

    public void setCurrentStudents(int currentStudents) {
        if (currentStudents >= 0 && currentStudents <= maxStudents) {
            this.currentStudents = currentStudents;
        } else if (currentStudents < 0) {
            this.currentStudents = 0;
        } else {
            this.currentStudents = maxStudents;
        }
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public static int getTotalCourses() {
        return totalCourses;
    }

    public static int calculateWorkload(int credits) {
        return credits * 36; // 36 часов на 1 кредит
    }

    public void enrollStudent() {
        if (currentStudents < maxStudents) {
            currentStudents++;
            System.out.println("Студент записан на курс");
        } else {
            System.out.println("Курс заполнен, запись невозможна");
        }
    }

    public void enrollStudent(String studentId) {
        if (currentStudents < maxStudents) {
            currentStudents++;
            System.out.println("Студент " + studentId + " записан на курс " + courseName);
        } else {
            System.out.println("Курс заполнен, студент " + studentId + " не может быть записан");
        }
    }

    public void displayInfo() {
        System.out.println("Курс: " + courseName + " (" + courseCode + ")");
        System.out.println("Студентов: " + currentStudents + "/" + maxStudents);
    }

    public void displayInfo(boolean showAvailability) {
        displayInfo();
        if (showAvailability) {
            int availableSpots = maxStudents - currentStudents;
            System.out.println("Свободных мест: " + availableSpots);
            System.out.println("Статус: " + (isActive ? "Активен" : "Неактивен"));
        }
    }
}