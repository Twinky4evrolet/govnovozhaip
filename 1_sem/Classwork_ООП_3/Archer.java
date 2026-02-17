public class Archer extends GameCharacter {
    private double agility;
    private double accuracy;
    private String arrowType;

    public Archer() {
        this("Неизвестный лучник", 1, 100.0, 30.0, true, 18.0, 85.0, "Обычные");
    }

    public Archer(String name, int level, double health, double mana, boolean isAlive,
                  double agility, double accuracy, String arrowType) {
        super(name, level, health, mana, isAlive);
        this.agility = agility;
        this.accuracy = accuracy;
        this.arrowType = arrowType;
    }

    public double getAgility() { return agility; }
    public void setAgility(double agility) { this.agility = agility; }

    public double getAccuracy() { return accuracy; }
    public void setAccuracy(double accuracy) { this.accuracy = accuracy; }

    public String getArrowType() { return arrowType; }
    public void setArrowType(String arrowType) { this.arrowType = arrowType; }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Класс: Лучник");
        System.out.println("Ловкость: " + agility);
        System.out.println("Меткость: " + accuracy + "%");
        System.out.println("Тип стрел: " + arrowType);
    }

    @Override
    public void useSpecialAbility() {
        System.out.println(getName() + " использует ПРИЦЕЛЬНЫЙ ВЫСТРЕЛ!");
        System.out.println("Меткость увеличена до 100%!");
        accuracy = 100.0;
    }

    @Override
    public void attack() {
        System.out.println(getName() + " стреляет из лука с меткостью " + accuracy + "%");
    }

    public void attack(String target, double distance) {
        System.out.println(getName() + " стреляет в " + target + " с расстояния " + distance + " метров");
        System.out.println("Меткость: " + accuracy + "%");
    }

    public void dodge() {
        System.out.println(getName() + " уворачивается с ловкостью " + agility);
    }
}