public class MenuItem {
    private String itemId;
    private String name;
    private double price;
    private int cookingTime;
    private boolean isAvailable;

    private static int totalMenuItems = 0;
    public static final int MAX_COOKING_TIME = 120;

    public MenuItem() {
        this("default_id", "Неизвестное блюдо", 0.0, 15, true);
    }

    public MenuItem(String itemId, String name, double price) {
        this(itemId, name, price, 15, true);
    }

    public MenuItem(String itemId, String name, double price, int cookingTime, boolean isAvailable) {
        setItemId(itemId);
        this.name = name;
        setPrice(price);
        setCookingTime(cookingTime);
        this.isAvailable = isAvailable;
        totalMenuItems++;
    }

    public String getItemId() { return itemId; }
    public void setItemId(String itemId) {
        if (itemId != null && !itemId.isEmpty()) {
            this.itemId = itemId;
        } else {
            this.itemId = "default_id";
        }
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getPrice() { return price; }
    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            this.price = 0.0;
        }
    }

    public int getCookingTime() { return cookingTime; }
    public void setCookingTime(int cookingTime) {
        if (cookingTime >= 1 && cookingTime <= MAX_COOKING_TIME) {
            this.cookingTime = cookingTime;
        } else {
            this.cookingTime = 15;
        }
    }

    public boolean isAvailable() { return isAvailable; }
    public void setAvailable(boolean available) { isAvailable = available; }

    public static int getTotalMenuItems() {
        return totalMenuItems;
    }

    public String getItemType() {
        return "Блюдо";
    }

    public void prepare() {
        System.out.println("Готовим " + name);
    }

    public void displayInfo() {
        System.out.println("=== Информация о блюде ===");
        System.out.println("ID: " + itemId);
        System.out.println("Название: " + name);
        System.out.println("Тип: " + getItemType());
        System.out.println("Цена: " + price + " руб.");
        System.out.println("Время приготовления: " + cookingTime + " мин.");
        System.out.println("Доступно: " + (isAvailable ? "Да" : "Нет"));
    }

    public void updatePrice(double newPrice) {
        setPrice(newPrice);
        System.out.println("Цена обновлена: " + newPrice + " руб.");
    }
}