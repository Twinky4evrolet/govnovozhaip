public class Appetizer extends MenuItem {
    private String servingTemperature;
    private boolean isVegetarian;
    private int spiceLevel;

    public Appetizer() {
        this("app_001", "Салат Цезарь", 450.0, 10, true, "холодная", false, 1);
    }

    public Appetizer(String itemId, String name, double price, int cookingTime, boolean isAvailable,
                     String servingTemperature, boolean isVegetarian, int spiceLevel) {
        super(itemId, name, price, cookingTime, isAvailable);
        this.servingTemperature = servingTemperature;
        this.isVegetarian = isVegetarian;
        setSpiceLevel(spiceLevel);
    }

    public String getServingTemperature() { return servingTemperature; }
    public void setServingTemperature(String servingTemperature) { this.servingTemperature = servingTemperature; }

    public boolean isVegetarian() { return isVegetarian; }
    public void setVegetarian(boolean vegetarian) { isVegetarian = vegetarian; }

    public int getSpiceLevel() { return spiceLevel; }
    public void setSpiceLevel(int spiceLevel) {
        if (spiceLevel >= 1 && spiceLevel <= 5) {
            this.spiceLevel = spiceLevel;
        } else {
            this.spiceLevel = 1;
        }
    }

    @Override
    public String getItemType() {
        return "Закуска";
    }

    @Override
    public void prepare() {
        System.out.println("Готовим закуску: " + getName());
    }

    public void displayInfo() {
        super.displayInfo();
    }

    public void displayInfo(boolean showDetails) {
        if (showDetails) {
            super.displayInfo();
            System.out.println("Температура подачи: " + servingTemperature);
            System.out.println("Вегетарианское: " + (isVegetarian ? "Да" : "Нет"));
            System.out.println("Уровень остроты: " + spiceLevel + "/5");
        } else {
            displayInfo();
        }
    }

    public void changeSpiceLevel(int level) {
        setSpiceLevel(level);
        System.out.println("Уровень остроты изменен на " + level);
    }

    public void getNutritionInfo() {
        System.out.println("Информация о питательности закуски " + getName());
        System.out.println("Калории: примерно 200-400 ккал");
    }
}