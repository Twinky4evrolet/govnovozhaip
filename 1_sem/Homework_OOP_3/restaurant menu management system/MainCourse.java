public class MainCourse extends MenuItem {
    private String mainIngredient;
    private String sideDish;
    private int calories;

    public MainCourse() {
        this("main_001", "Стейк из говядины", 1200.0, 25, true, "говядина", "овощи гриль", 650);
    }

    public MainCourse(String itemId, String name, double price, int cookingTime, boolean isAvailable,
                      String mainIngredient, String sideDish, int calories) {
        super(itemId, name, price, cookingTime, isAvailable);
        this.mainIngredient = mainIngredient;
        this.sideDish = sideDish;
        this.calories = calories;
    }

    public String getMainIngredient() { return mainIngredient; }
    public void setMainIngredient(String mainIngredient) { this.mainIngredient = mainIngredient; }

    public String getSideDish() { return sideDish; }
    public void setSideDish(String sideDish) { this.sideDish = sideDish; }

    public int getCalories() { return calories; }
    public void setCalories(int calories) { this.calories = calories; }

    @Override
    public String getItemType() {
        return "Основное блюдо";
    }

    @Override
    public void prepare() {
        System.out.println("Готовим основное блюдо: " + getName());
    }

    public void updatePrice(double newPrice) {
        super.updatePrice(newPrice);
    }

    public void updatePrice(double newPrice, String reason) {
        super.updatePrice(newPrice);
        System.out.println("Причина изменения цены: " + reason);
    }

    public void changeSideDish(String newSideDish) {
        this.sideDish = newSideDish;
        System.out.println("Гарнир изменен на: " + newSideDish);
    }

    public void getCookingInstructions() {
        System.out.println("=== Инструкции по приготовлению ===");
        System.out.println("1. Подготовить " + mainIngredient);
        System.out.println("2. Приготовить гарнир: " + sideDish);
        System.out.println("3. Общее время: " + getCookingTime() + " минут");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Основной ингредиент: " + mainIngredient);
        System.out.println("Гарнир: " + sideDish);
        System.out.println("Калории: " + calories + " ккал");
    }
}