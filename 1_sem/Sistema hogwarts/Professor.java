class Professor extends Wizard {
    private String subject;

    public Professor(String name, int mana, int age, int spellPower, String subject) {
        super(name, mana, age, spellPower);
        this.subject = subject;
    }

    public String getSubject() { return subject; }
    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void teach() {
        if (getMana() >= 5) {
            setMana(getMana() - 5);
            System.out.println("Профессор " + getName() + " учит " + subject + "!");
        } else {
            System.out.println("Профессор " + getName() + " слишком устал для преподавания!");
        }
    }

    public void castOnStudent(HogwartsStudent student, String spellName) {
        if (getMana() >= 10) {
            setMana(getMana() - 10);
            student.setMana(student.getMana() - getSpellPower());
            student.setSpellPower(student.getSpellPower() + getSpellPower() / 2);
            System.out.println("Профессор " + getName() + " кастует '" + spellName + "' на студента " + student.getName() + "!");
        } else {
            System.out.println("У профессора " + getName() + " недостаточно маны!");
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Предмет: " + subject);
    }
}