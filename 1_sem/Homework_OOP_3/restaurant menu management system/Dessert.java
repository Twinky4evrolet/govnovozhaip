public class Dessert extends MenuItem {
    private int sweetnessLevel;
    private boolean containsNuts;
    private boolean isGlutenFree;

    public Dessert() {
        this("dessert_001", "Тирамису", 350.0, 15, true, 7, false, false);
    }

    public Dessert(String itemId, String name, double price, int cookingTime, boolean isAvailable,
                   int sweetnessLevel, boolean containsNuts, boolean isGlutenFree) {
        super(itemId, name, price, cookingTime, isAvailable);
        setSweetnessLevel(sweetnessLevel);
        this.containsNuts = containsNuts;
        this.isGlutenFree = isGlutenFree;
    }

    public int getSweetnessLevel() { return sweetnessLevel; }
    public void setSweetnessLevel(int sweetnessLevel) {
        if (sweetnessLevel >= 1 && sweetnessLevel <= 10) {
            this.sweetnessLevel = sweetnessLevel;
        } else {
            this.sweetnessLevel = 5;
        }
    }

    public boolean isContainsNuts() { return containsNuts; }
    public void setContainsNuts(boolean containsNuts) { this.containsNuts = containsNuts; }

    public boolean isGlutenFree() { return isGlutenFree; }
    public void setGlutenFree(boolean glutenFree) { isGlutenFree = glutenFree; }

    @Override
    public String getItemType() {
        return "Десерт";
    }

    @Override
    public void prepare() {
        System.out.println("Готовим десерт: " + getName());
    }

    public void prepare(boolean withExtraDecoration) {
        prepare();
        if (withExtraDecoration) {
            System.out.println("Добавлены дополнительные украшения");
        }
    }

    public void addTopping(String topping) {
        System.out.println("Добавлен топпинг: " + topping);
    }

    public void checkAllergies() {
        System.out.println("=== Проверка аллергенов для " + getName() + " ===");
        if (containsNuts) {
            System.out.println(" СОДЕРЖИТ ОРЕХИ");
        }
        if (!isGlutenFree) {
            System.out.println(" СОДЕРЖИТ ГЛЮТЕН");
        }
        if (!containsNuts && isGlutenFree) {
            System.out.println(" Безопасно для большинства аллергиков");
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Уровень сладости: " + sweetnessLevel + "/10");
        System.out.println("Содержит орехи: " + (containsNuts ? "Да" : "Нет"));
        System.out.println("Без глютена: " + (isGlutenFree ? "Да" : "Нет"));
    }
}