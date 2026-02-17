class HogwartsStudent extends Wizard {
    private String house;
    private int mischiefLevel;

    public HogwartsStudent(String name, int mana, int age, int spellPower, String house, int mischiefLevel) {
        super(name, mana, age, spellPower);
        setHouse(house);
        setMischiefLevel(mischiefLevel);
    }

    public String getHouse() { return house; }
    public int getMischiefLevel() { return mischiefLevel; }

    public void setHouse(String house) {
        this.house = house;
    }

    public void setMischiefLevel(int mischiefLevel) {
        if (mischiefLevel < 0) {
            this.mischiefLevel = 0;
        } else if (mischiefLevel > 100) {
            this.mischiefLevel = 100;
        } else {
            this.mischiefLevel = mischiefLevel;
        }
    }

    public void prank() {
        if (getMana() >= 5) {
            setMischiefLevel(mischiefLevel + 10);
            setMana(getMana() - 5);
            System.out.println(getName() + " подложил " + getHouse().toLowerCase() + "скому студенту лягушку в учебник!");
        } else {
            System.out.println(getName() + " слишком устал для шалостей!");
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Факультет: " + house);
        System.out.println("Уровень шалостей: " + mischiefLevel);
    }
}