class MagicalCreature extends Wizard {
    private String creatureType;

    public MagicalCreature(String name, int mana, int age, int spellPower, String creatureType) {
        super(name, mana, age, spellPower);
        this.creatureType = creatureType;
    }

    public String getCreatureType() { return creatureType; }
    public void setCreatureType(String creatureType) { this.creatureType = creatureType; }

    public void specialAbility(Wizard target) {
        if (getMana() >= 5) {
            setMana(getMana() - 5);
            target.setMana(target.getMana() - getSpellPower());
            target.setSpellPower(target.getSpellPower() + getSpellPower() / 2);
            System.out.println(creatureType + " " + getName() + " использует способность на " + target.getName() + "!");
        } else {
            System.out.println(getName() + " слишком устал для использования способности!");
        }
    }

    public void specialAbility() {
        System.out.println(creatureType + " " + getName() + " демонстрирует свою способность: начинает танцевать макарену!");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Тип существа: " + creatureType);
    }
}