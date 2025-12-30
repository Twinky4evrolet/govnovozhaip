public class RestaurantOrder {
    private String orderId;
    private int tableNumber;
    private MenuItem[] orderItems;
    private String orderStatus;
    private int itemCount;

    private static int totalOrders = 0;
    public static final int MAX_TABLE_NUMBER = 50;
    private static final int MAX_ORDER_ITEMS = 20;

    public RestaurantOrder(String orderId, int tableNumber) {
        setOrderId(orderId);
        setTableNumber(tableNumber);
        this.orderItems = new MenuItem[MAX_ORDER_ITEMS];
        this.orderStatus = "Создан";
        this.itemCount = 0;
        totalOrders++;
    }

    public String getOrderId() { return orderId; }
    public void setOrderId(String orderId) {
        if (orderId != null && !orderId.isEmpty()) {
            this.orderId = orderId;
        } else {
            this.orderId = "ORDER_" + System.currentTimeMillis();
        }
    }

    public int getTableNumber() { return tableNumber; }
    public void setTableNumber(int tableNumber) {
        if (tableNumber >= 1 && tableNumber <= MAX_TABLE_NUMBER) {
            this.tableNumber = tableNumber;
        } else {
            this.tableNumber = 1;
        }
    }

    public String getOrderStatus() { return orderStatus; }
    public void setOrderStatus(String orderStatus) { this.orderStatus = orderStatus; }

    public static int getTotalOrders() { return totalOrders; }

    public void addItem(MenuItem item) {
        if (itemCount < MAX_ORDER_ITEMS) {
            orderItems[itemCount] = item;
            itemCount++;
            System.out.println("Блюдо " + item.getName() + " добавлено в заказ");
        } else {
            System.out.println("Достигнут лимит блюд в заказе!");
        }
    }

    public void removeItem(String itemId) {
        for (int i = 0; i < itemCount; i++) {
            if (orderItems[i].getItemId().equals(itemId)) {
                System.out.println("Блюдо " + orderItems[i].getName() + " удалено из заказа");
                for (int j = i; j < itemCount - 1; j++) {
                    orderItems[j] = orderItems[j + 1];
                }
                orderItems[itemCount - 1] = null;
                itemCount--;
                return;
            }
        }
        System.out.println("Блюдо с ID " + itemId + " не найдено в заказе");
    }

    public double calculateTotal() {
        double total = 0;
        for (int i = 0; i < itemCount; i++) {
            total += orderItems[i].getPrice();
        }
        return total;
    }

    public void getOrderDetails() {
        System.out.println("=== Детали заказа ===");
        System.out.println("Номер заказа: " + orderId);
        System.out.println("Стол: " + tableNumber);
        System.out.println("Статус: " + orderStatus);
        System.out.println("Количество блюд: " + itemCount);
        System.out.println("Блюда:");

        for (int i = 0; i < itemCount; i++) {
            System.out.println((i + 1) + ". " + orderItems[i].getName() + " - " +
                    orderItems[i].getPrice() + " руб.");
        }
        System.out.println("Общая сумма: " + calculateTotal() + " руб.");
    }

    public void updateStatus(String newStatus) {
        this.orderStatus = newStatus;
        System.out.println("Статус заказа изменен на: " + newStatus);
    }

    public MenuItem[] getItemsByType(String type) {
        int count = 0;
        for (int i = 0; i < itemCount; i++) {
            if (orderItems[i].getItemType().equals(type)) {
                count++;
            }
        }
        MenuItem[] result = new MenuItem[count];
        int index = 0;

        for (int i = 0; i < itemCount; i++) {
            if (orderItems[i].getItemType().equals(type)) {
                result[index] = orderItems[i];
                index++;
            }
        }

        return result;
    }

    public int estimatePreparationTime() {
        int totalTime = 0;
        for (int i = 0; i < itemCount; i++) {
            totalTime += orderItems[i].getCookingTime();
        }
        return totalTime;
    }
    public int getItemCount() { return itemCount; }
}