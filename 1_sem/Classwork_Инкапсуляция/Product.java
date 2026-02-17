public class Product {
    private String name;
    private double price;
    private String category;
    private boolean inStock;
    private int quantity;

    private static int totalProducts = 0;
    public static final String STORE_NAME = "Супермаркет 'У дома'";

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
        totalProducts++;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
    public String getCategory() { return category; }
    public boolean isInStock() { return inStock; }
    public int getQuantity() { return quantity; }


    public void setName(String name) { this.name = name; }

    public void setPrice(double price) {
        if (price >= 0 && price <= 1000000) {
            this.price = price;
        }
    }

    public void setCategory(String category) { this.category = category; }
    public void setInStock(boolean inStock) { this.inStock = inStock; }

    public void setQuantity(int quantity) {
        if (quantity >= 0) {
            this.quantity = quantity;
        }
    }

    public static int getTotalProducts() {
        return totalProducts;
    }

    public static double calculateTotalValue(Product[] products) {
        double total = 0;
        for (int i = 0; i < products.length; i++) {
            total += products[i].getPrice() * products[i].getQuantity();
        }
        return total;
    }

    public void displayInfo() {
        System.out.println("Название: " + name);
        System.out.println("Цена: " + price);
        System.out.println("Категория: " + category);
    }

    public void displayInfo(boolean showStockStatus) {
        System.out.println("Название: " + name);
        System.out.println("Цена: " + price);
        System.out.println("Категория: " + category);
        if (showStockStatus) {
            System.out.println("В наличии: " + (inStock ? "Да" : "Нет"));
            System.out.println("Количество: " + quantity);
        }
    }

    public void applyDiscount(double percent) {
        price = price * (1 - percent / 100);
    }

    public void applyDiscount(double percent, String promoCode) {
        price = price * (1 - percent / 100);
        System.out.println("Промокод: " + promoCode);
    }

    public void restock(int amount) {
        quantity = quantity + amount;
        inStock = quantity > 0;
    }

    public void restock(int amount, String supplier) {
        quantity = quantity + amount;
        inStock = quantity > 0;
        System.out.println("Поставщик: " + supplier);
    }

    public void sell(int amount) {
        if (amount <= quantity) {
            quantity = quantity - amount;
            inStock = quantity > 0;
        } else {
            System.out.println("Недостаточно товара");
        }
    }

    public void sell(int amount, String customer) {
        if (amount <= quantity) {
            quantity = quantity - amount;
            inStock = quantity > 0;
            System.out.println("Покупатель: " + customer);
        } else {
            System.out.println("Недостаточно товара");
        }
    }
}