public class GameParty {
    private GameCharacter[] partyMembers;
    private int memberCount;
    private static final int MAX_PARTY_SIZE = 10;

    public GameParty() {
        partyMembers = new GameCharacter[MAX_PARTY_SIZE];
        memberCount = 0;
    }

    public void addCharacter(GameCharacter character) {
        if (memberCount < MAX_PARTY_SIZE) {
            partyMembers[memberCount] = character;
            memberCount++;
            System.out.println(character.getName() + " добавлен в группу!");
        } else {
            System.out.println("Группа заполнена! Нельзя добавить больше персонажей");
        }
    }

    public void removeCharacter(String name) {
        for (int i = 0; i < memberCount; i++) {
            if (partyMembers[i].getName().equals(name)) {
                System.out.println(partyMembers[i].getName() + " удален из группы");

                for (int j = i; j < memberCount - 1; j++) {
                    partyMembers[j] = partyMembers[j + 1];
                }
                partyMembers[memberCount - 1] = null;
                memberCount--;
                return;
            }
        }
        System.out.println("Персонаж с именем " + name + " не найден в группе");
    }

    public void displayPartyInfo() {
        System.out.println("=== ИНФОРМАЦИЯ О ГРУППЕ ===");
        System.out.println("Количество членов: " + memberCount);
        System.out.println("Свободных мест: " + (MAX_PARTY_SIZE - memberCount));

        for (int i = 0; i < memberCount; i++) {
            System.out.println("\n--- Член группы " + (i + 1) + " ---");
            partyMembers[i].displayInfo();
        }
    }

    public void useAllSpecialAbilities() {
        System.out.println("=== ВСЕ ПЕРСОНАЖИ ИСПОЛЬЗУЮТ СПОСОБНОСТИ ===");
        for (int i = 0; i < memberCount; i++) {
            partyMembers[i].useSpecialAbility();
        }
    }

    public GameCharacter[] findCharactersByClass(String className) {
        int count = 0;
        for (int i = 0; i < memberCount; i++) {
            if (getCharacterClassName(partyMembers[i]).equals(className)) {
                count++;
            }
        }
        GameCharacter[] result = new GameCharacter[count];
        int index = 0;

        for (int i = 0; i < memberCount; i++) {
            if (getCharacterClassName(partyMembers[i]).equals(className)) {
                result[index] = partyMembers[i];
                index++;
            }
        }

        return result;
    }

    private String getCharacterClassName(GameCharacter character) {
        if (character instanceof Warrior) {
            return "Warrior";
        } else if (character instanceof Mage) {
            return "Mage";
        } else if (character instanceof Archer) {
            return "Archer";
        } else {
            return "GameCharacter";
        }
    }

    public double calculatePartyPower() {
        double totalPower = 0;

        for (int i = 0; i < memberCount; i++) {
            if (partyMembers[i] instanceof Warrior) {
                Warrior warrior = (Warrior) partyMembers[i];
                totalPower += warrior.getStrength() + warrior.getArmor();
            } else if (partyMembers[i] instanceof Mage) {
                Mage mage = (Mage) partyMembers[i];
                totalPower += mage.getIntelligence() + mage.getSpellPower();
            } else if (partyMembers[i] instanceof Archer) {
                Archer archer = (Archer) partyMembers[i];
                totalPower += archer.getAgility() + archer.getAccuracy();
            } else {
                totalPower += partyMembers[i].getLevel() * 10;
            }
        }

        return totalPower;
    }

    public int getMemberCount() {
        return memberCount;
    }

    public int getMaxPartySize() {
        return MAX_PARTY_SIZE;
    }
}