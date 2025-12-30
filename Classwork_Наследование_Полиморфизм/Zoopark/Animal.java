public class Animal {
    private String name;
    private int age;

    public Animal() {
        this("Неизвестное животное", 0);
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("Животное издает звук");
    }

    public void eat() {
        System.out.println(name + " кушает");
    }

    public void displayInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age + " лет");
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
}