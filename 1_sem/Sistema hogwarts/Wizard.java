import java.util.Scanner;

public class Wizard {
    private String name;
    private int mana;
    private int age;
    private int spellPower;
    private Scanner myScan;
    private static int totalWizards = 0;
    private static int totalSpellPower = 0;

    public Wizard() {
        this("Unknown", 50, 11, 10);
    }

    public Wizard(String name, int mana, int age, int spellPower) {
        this.name = name;
        this.mana = mana;
        this.age = age;
        this.spellPower = spellPower;
    }

    public String getName() { return name; }
    public int getMana() { return mana; }
    public int getAge() { return age; }
    public int getSpellPower() { return spellPower; }

    public void setMana(int mana) {
        if (mana < 0) {
            this.mana = 0;
        } else if (mana > 100) {
            this.mana = 100;
        } else {
            this.mana = mana;
        }
    }
    public void setAge(int age){
        if (age < 0){
            throw new IllegalArgumentException("возраст не может быть меньше 0");
        }
        this.age = age;
    }
    public void setSpellPower(int spellPower){
        if (spellPower < 0){
            throw new IllegalArgumentException("сила должна быть больше от 0 и больше");
        }
    }
    public void castSpell(String spellName) {
        if (mana >= 10) {
            mana -= 10;
            setSpellPower(spellPower + 5);
            System.out.println(name + " кастует заклинание '" + spellName + "'!");
        } else {
            System.out.println("Недостаточно маны! Попей мятный чай пожалуйста...");
        }
    }

    public void castSpell() {
        if (mana >= 5) {
            mana -= 5;
            setSpellPower(spellPower + 3);
            System.out.println(name + " кастует заклинание 'Lumos'!");
        } else {
            System.out.println("Недостаточно маны! Попей мятный чай пожалуйста...");
        }
    }

    public void castSpell(String spellName, int power) {
        if (mana >= power) {
            mana -= power;
            setSpellPower(spellPower + power);
            System.out.println(name + " кастует усиленное заклинание '" + spellName + "' с силой " + power + "!");
        } else {
            System.out.println("Недостаточно маны! Попей мятный чай пожалуйста...");
        }
    }

    public void displayInfo() {
        String status;
        if (mana > 50) {
            status = "готов шалить";
        } else if (mana > 20) {
            status = "весёлый";
        } else {
            status = "уставший";
        }
        System.out.println("=== Информация о волшебнике ===");
        System.out.println("Имя: " + name);
        System.out.println("Мана: " + mana);
        System.out.println("Возраст: " + age);
        System.out.println("Сила заклинаний: " + spellPower);
        System.out.println("Статус: " + status);
        System.out.println("===============================");
    }
    public void rechargeMana(int amount) {
        int oldMana = mana;
        setMana(mana + amount);
        if (mana > oldMana) {
            System.out.println("Мана восстановлена! Заклинания почти вызывают фейерверк!");
        }
    }
    public static void showAcademyStats() {
        System.out.println("=== Статистика Академии ===");
        System.out.println("Всего волшебников: " + totalWizards);
        System.out.println("Суммарная сила заклинаний: " + totalSpellPower);
        System.out.println("===========================");
    }
}
