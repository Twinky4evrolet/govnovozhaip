public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];

        animals[0] = new Animal("Медведь", 5);
        animals[1] = new Bird("Орел", 3, true);
        animals[2] = new Bird("Пингвин", 2, false);
        animals[3] = new Bird("Воробей", 1, true);

        System.out.println("=== ДЕМОНСТРАЦИЯ ПОЛИМОРФИЗМА ===");
        System.out.println("Все животные издают звуки:");

        for (Animal animal : animals) {
            animal.makeSound();
        }

        System.out.println("\n=== ПРИВЕДЕНИЕ ТИПОВ ===");
        System.out.println("Только птицы могут летать:");

        for (Animal animal : animals) {
            if (animal instanceof Bird) {
                Bird bird = (Bird) animal;
                bird.fly();
            }
        }

        System.out.println("\n=== ИНФОРМАЦИЯ О ЖИВОТНЫХ ===");
        for (Animal animal : animals) {
            animal.displayInfo();
            animal.makeSound();
            System.out.println("---");
        }
    }
}