public class Department {
    private String departmentName;
    private String headOfDepartment;
    private String officeRoom;
    private String email;
    private String phoneNumber;
    private double budget;

    private static int totalDepartments = 0;
    public static final double UNIVERSITY_BUDGET = 10000000.0;

    public Department() {
        this("Кафедра информатики", "Иванов И.И.", "101", "cfu@university.ru", "88005553535", 500000.0);
    }

    public Department(String departmentName, String headOfDepartment, String officeRoom) {
        this(departmentName, headOfDepartment, officeRoom, "department@university.ru", "88000000000", 100000.0);
    }

    public Department(String departmentName, String headOfDepartment, String officeRoom, String email, String phoneNumber, double budget) {
        this.departmentName = departmentName;
        this.headOfDepartment = headOfDepartment;
        this.officeRoom = officeRoom;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.budget = budget;
        totalDepartments++;
    }

    public String getDepartmentName() { return departmentName; }
    public String getHeadOfDepartment() { return headOfDepartment; }
    public String getOfficeRoom() { return officeRoom; }
    public String getEmail() { return email; }
    public String getPhoneNumber() { return phoneNumber; }
    public double getBudget() { return budget; }

    public void setDepartmentName(String departmentName) {
        if (departmentName != null && !departmentName.isEmpty()) {
            this.departmentName = departmentName;
        } else {
            this.departmentName = "Неизвестная кафедра";
        }
    }

    public void setHeadOfDepartment(String headOfDepartment) {
        if (headOfDepartment != null && !headOfDepartment.isEmpty()) {
            this.headOfDepartment = headOfDepartment;
        } else {
            this.headOfDepartment = "Неизвестно";
        }
    }

    public void setOfficeRoom(String officeRoom) {
        if (officeRoom != null && !officeRoom.isEmpty()) {
            this.officeRoom = officeRoom;
        } else {
            this.officeRoom = "000";
        }
    }

    public void setEmail(String email) {
        if (email.matches("[A-Za-zа-яА-Я0-9.,-]+@[A-Za-zа-яА-Я0-9,.-]{3,}")) {
            System.out.println("Иба чоткй имайлчик");
            this.email = email;
        } else {
            System.out.println("Имайл фуфло");
        }

    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber != null && phoneNumber.matches("[0-9]+")) {
            this.phoneNumber = phoneNumber;
        } else {
            this.phoneNumber = "88000000000";
        }
    }

    public void setBudget(double budget) {
        if (budget >= 0) {
            this.budget = budget;
        } else {
            this.budget = 0;
        }
    }

    public static int getTotalDepartments() {
        return totalDepartments;
    }

    public void contact() {
        System.out.println("Кафедра: " + departmentName);
        System.out.println("Email: " + email);
        System.out.println("Телефон: " + phoneNumber);
        System.out.println("Кабинет: " + officeRoom);
    }

    public void contact(String message) {
        contact();
        System.out.println("Сообщение: " + message);
    }

    public void allocateBudget(double amount) {
        if (amount > 0) {
            budget += amount;
            System.out.println("Бюджет увеличен на " + amount);
        }
    }

    public void allocateBudget(double amount, String purpose) {
        if (amount > 0) {
            budget += amount;
            System.out.println("Бюджет увеличен на " + amount + " для: " + purpose);
        }
    }
}