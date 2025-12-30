public class Main {
    public static void main(String[] args) {
        System.out.println("=== СИСТЕМА УПРАВЛЕНИЯ ИГРОВЫМИ ПЕРСОНАЖАМИ ===\n");

        Warrior warrior = new Warrior("Артурка", 10, 200.0, 30.0, true, 25.0, 15.0, "Двуручный меч");
        Mage mage = new Mage("Мерлин", 12, 90.0, 150.0, true, 35.0, 28.0, "Лед");
        Archer archer = new Archer("Леня", 8, 120.0, 40.0, true, 22.0, 90.0, "Острые");

        GameParty party = new GameParty();

        party.addCharacter(warrior);
        party.addCharacter(mage);
        party.addCharacter(archer);

        System.out.println("\n=== ИНФОРМАЦИЯ О ГРУППЕ ===");
        party.displayPartyInfo();

        System.out.println("\n=== СПОСОБНОСТИ ПЕРСОНАЖЕЙ ===");
        party.useAllSpecialAbilities();

        System.out.println("\n=== ПОИСК МАГОВ ===");
        GameCharacter[] mages = party.findCharactersByClass("Mage");
        System.out.println("Найдено магов: " + mages.length);
        for (GameCharacter mageChar : mages) {
            mageChar.displayInfo();
        }

        System.out.println("\n=== ОБЩАЯ СИЛА ГРУППЫ ===");
        double partyPower = party.calculatePartyPower();
        System.out.println("Общая сила группы: " + partyPower);

        System.out.println("\n=== ТЕСТИРОВАНИЕ ПЕРСОНАЖЕЙ ===");

        System.out.println("\n--- Тест воина ---");
        warrior.attack();
        warrior.attack("Топор");
        warrior.takeDamage(50);

        System.out.println("\n--- Тест мага ---");
        mage.attack();
        mage.castSpell("Ледяная стрела");
        mage.meditate();

        System.out.println("\n--- Тест лучника ---");
        archer.attack();
        archer.attack("орк", 25.5);
        archer.dodge();

        System.out.println("\n=== СТАТИСТИКА ===");
        System.out.println("Всего создано персонажей: " + GameCharacter.getTotalCharacters());
        System.out.println("Максимальный уровень: " + GameCharacter.MAX_LEVEL);
        System.out.println("Размер группы: " + party.getMemberCount() + "/" + party.getMaxPartySize());

        System.out.println("\n=== ДЕМОНСТРАЦИЯ ПОЛИМОРФИЗМА ===");
        GameCharacter[] characters = {warrior, mage, archer};

        for (GameCharacter character : characters) {
            character.attack();
        }
    }
}