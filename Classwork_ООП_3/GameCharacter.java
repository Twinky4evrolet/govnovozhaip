public class GameCharacter {
    private String name;
    private int level;
    private double health;
    private double mana;
    private boolean isAlive;

    private static int totalCharacters = 0;
    public static final int MAX_LEVEL = 100;

    public GameCharacter() {
        this("Неизвестный", 1, 100.0, 50.0, true);
    }

    public GameCharacter(String name, int level, double health, double mana, boolean isAlive) {
        this.name = name;
        this.level = level;
        this.health = health;
        this.mana = mana;
        this.isAlive = isAlive;
        totalCharacters++;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getLevel() { return level; }
    public void setLevel(int level) {
        if (level >= 1 && level <= MAX_LEVEL) {
            this.level = level;
        }
    }

    public double getHealth() { return health; }
    public void setHealth(double health) { this.health = health; }

    public double getMana() { return mana; }
    public void setMana(double mana) { this.mana = mana; }

    public boolean isAlive() { return isAlive; }
    public void setAlive(boolean alive) { isAlive = alive; }

    public static int getTotalCharacters() {
        return totalCharacters;
    }

    public void displayInfo() {
        System.out.println("=== Информация о персонаже ===");
        System.out.println("Имя: " + name);
        System.out.println("Уровень: " + level);
        System.out.println("Здоровье: " + health);
        System.out.println("Мана: " + mana);
        System.out.println("Статус: " + (isAlive ? "Жив" : "Мертв"));
    }

    public void useSpecialAbility() {
        System.out.println(name + " использует особую способность!");
    }

    public void attack() {
        System.out.println(name + " атакует!");
    }

    public void takeDamage(double damage) {
        if (isAlive) {
            health -= damage;
            System.out.println(name + " получает " + damage + " урона");

            if (health <= 0) {
                health = 0;
                isAlive = false;
                System.out.println(name + " погиб!");
            }
        } else {
            System.out.println(name + " уже мертв!");
        }
    }

    public void heal(double amount) {
        if (isAlive) {
            health += amount;
            System.out.println(name + " восстанавливает " + amount + " здоровья");
        } else {
            System.out.println("Нельзя лечить мертвого персонажа!");
        }
    }
}