public class Product {
    private String name;
    private double price;
    private String category;
    private boolean inStock;
    private int quantity;

    public Product() {
        this("name", 257, "Для кухни", true, 1000);
    }

    public Product(String name, double price, String category) {
        this(name, price, category, true, 1000);
    }

    public Product(String name, double price, String category, boolean inStock, int quantity) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.inStock = inStock;
        this.quantity = quantity;
    }

    public void displayInfo() {
        System.out.println("Название: " + name);
        System.out.println("Цена: " + price);
        System.out.println("Категория: " + category);
        System.out.println("В наличии: " + (inStock ? "Да" : "Нет"));
        System.out.println("Количество: " + quantity);
    }

    public void applyDiscount(double percent) {
        price *= (1 - percent / 100);
    }

    public void restock(int amount) {
        quantity += amount;
        inStock = quantity > 0;
    }

    public void sell(int amount) {
        if (amount <= quantity) {
            quantity -= amount;
            inStock = quantity > 0;
        } else {
            System.out.println("Недостаточно товара");
        }
    }
}