public class Main {
    public static void main(String[] args) {
        Wizard[] hogwarts = new Wizard[6];

        hogwarts[0] = new HogwartsStudent("Гарри Поттер", 80, 14, 25, "Гриффиндор", 30);
        hogwarts[1] = new HogwartsStudent("Драко Малфой", 70, 14, 20, "Слизерин", 40);
        hogwarts[2] = new Professor("Северус Снегг", 90, 38, 35, "Зельеварение");
        hogwarts[3] = new Professor("Минерва Макгонагалл", 95, 45, 40, "Трансфигурация");
        hogwarts[4] = new MagicalCreature("Добби", 60, 100, 15, "Эльф");
        hogwarts[5] = new MagicalCreature("Фоукс", 75, 150, 30, "Феникс");

        System.out.println("=== ДЕНЬ В ХОГВАРТСЕ ===\n");

        for (Wizard wizard : hogwarts) {
            wizard.displayInfo();
            wizard.castSpell();
            System.out.println();
        }

        System.out.println("=== МАГИЧЕСКИЕ СУЩЕСТВА В ДЕЙСТВИИ ===");
        for (Wizard wizard : hogwarts) {
            if (wizard instanceof MagicalCreature) {
                MagicalCreature creature = (MagicalCreature) wizard;
                creature.specialAbility();
                Wizard randomTarget = hogwarts[(int)(Math.random() * hogwarts.length)];
                if (randomTarget != creature) {
                    creature.specialAbility(randomTarget);
                }
                System.out.println();
            }
        }

        HogwartsStudent studentWithLeastMana = null;
        for (Wizard wizard : hogwarts) {
            if (wizard instanceof HogwartsStudent) {
                HogwartsStudent student = (HogwartsStudent) wizard;
                if (studentWithLeastMana == null || student.getMana() < studentWithLeastMana.getMana()) {
                    studentWithLeastMana = student;
                }
            }
        }

        if (studentWithLeastMana != null) {
            System.out.println("=== ВОССТАНОВЛЕНИЕ МАНЫ ===");
            System.out.println("Студент с наименьшей маной: " + studentWithLeastMana.getName() +
                    " (мана: " + studentWithLeastMana.getMana() + ")");
            studentWithLeastMana.rechargeMana(50);
            System.out.println();
        }

        HogwartsStudent mostMischievous = null;
        for (Wizard wizard : hogwarts) {
            if (wizard instanceof HogwartsStudent) {
                HogwartsStudent student = (HogwartsStudent) wizard;
                if (mostMischievous == null || student.getMischiefLevel() > mostMischievous.getMischiefLevel()) {
                    mostMischievous = student;
                }
            }
        }

        if (mostMischievous != null) {
            System.out.println("=== ШАЛОСТИ ===");
            System.out.println("Самый шаловливый студент: " + mostMischievous.getName() +
                    " (уровень шалостей: " + mostMischievous.getMischiefLevel() + ")");
            mostMischievous.prank();
            System.out.println();
        }

        System.out.println("=== УРОКИ В ХОГВАРТСЕ ===");
        for (Wizard wizard : hogwarts) {
            if (wizard instanceof Professor) {
                Professor professor = (Professor) wizard;
                professor.teach();
                for (Wizard target : hogwarts) {
                    if (target instanceof HogwartsStudent && professor.getMana() >= 10) {
                        professor.castOnStudent((HogwartsStudent) target, "Educatus Maximus");
                        break;
                    }
                }
            }
        }
        System.out.println();

        Wizard.showAcademyStats();
    }
}