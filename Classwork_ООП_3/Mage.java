public class Mage extends GameCharacter {
    private double intelligence;
    private double spellPower;
    private String element;

    public Mage() {
        this("Неизвестный маг", 1, 80.0, 200.0, true, 20.0, 15.0, "Огонь");
    }

    public Mage(String name, int level, double health, double mana, boolean isAlive,
                double intelligence, double spellPower, String element) {
        super(name, level, health, mana, isAlive);
        this.intelligence = intelligence;
        this.spellPower = spellPower;
        this.element = element;
    }
    public double getIntelligence() { return intelligence; }
    public void setIntelligence(double intelligence) { this.intelligence = intelligence; }

    public double getSpellPower() { return spellPower; }
    public void setSpellPower(double spellPower) { this.spellPower = spellPower; }

    public String getElement() { return element; }
    public void setElement(String element) { this.element = element; }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Класс: Маг");
        System.out.println("Интеллект: " + intelligence);
        System.out.println("Сила заклинаний: " + spellPower);
        System.out.println("Стихия: " + element);
    }

    @Override
    public void useSpecialAbility() {
        System.out.println(getName() + " создает МАГИЧЕСКИЙ ЩИТ!");
        System.out.println("Защита увеличена!");
    }

    @Override
    public void attack() {
        System.out.println(getName() + " атакует магией " + element + " с силой " + spellPower);
    }

    public void castSpell(String spellName) {
        System.out.println(getName() + " произносит заклинание: " + spellName);
        System.out.println("Сила заклинания: " + spellPower);
    }

    public void meditate() {
        double manaRestored = intelligence * 2;
        setMana(getMana() + manaRestored);
        System.out.println(getName() + " медитирует и восстанавливает " + manaRestored + " маны");
    }
}