public class Warrior extends GameCharacter {
    private double strength;
    private double armor;
    private String weaponType;

    public Warrior() {
        this("Неизвестный воин", 1, 150.0, 20.0, true, 15.0, 10.0, "Меч");
    }

    public Warrior(String name, int level, double health, double mana, boolean isAlive,
                   double strength, double armor, String weaponType) {
        super(name, level, health, mana, isAlive);
        this.strength = strength;
        this.armor = armor;
        this.weaponType = weaponType;
    }

    public double getStrength() { return strength; }
    public void setStrength(double strength) { this.strength = strength; }

    public double getArmor() { return armor; }
    public void setArmor(double armor) { this.armor = armor; }

    public String getWeaponType() { return weaponType; }
    public void setWeaponType(String weaponType) { this.weaponType = weaponType; }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Класс: Воин");
        System.out.println("Сила: " + strength);
        System.out.println("Броня: " + armor);
        System.out.println("Оружие: " + weaponType);
    }

    @Override
    public void useSpecialAbility() {
        System.out.println(getName() + " входит в состояние БЕРСЕРК!");
        System.out.println("Сила увеличена в 2 раза!");
        strength *= 2;
    }

    @Override
    public void attack() {
        System.out.println(getName() + " атакует с силой " + strength + " используя " + weaponType);
    }

    public void attack(String weapon) {
        System.out.println(getName() + " атакует с силой " + strength + " используя " + weapon);
    }
}