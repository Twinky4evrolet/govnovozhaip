public class Main {
    public static void main(String[] args) {
        System.out.println("=== ТЕСТИРОВАНИЕ КЛАССА BOOK ===");

        // Создаем книги разными конструкторами
        Book book1 = new Book();
        Book book2 = new Book("Война и мир", "Лев Толстой", 1869);
        Book book3 = new Book("Преступление и наказание", "Федор Достоевский", 1866, true, 672);

        // Тестируем методы
        System.out.println("--- Полная информация о книге ---");
        System.out.println(book1.displayInfo(true));

        System.out.println("\n--- Краткая информация о книге ---");
        System.out.println(book2.displayInfo(false));

        System.out.println("\n--- Тест взятия книги ---");
        book3.borrowBook("Иван Иванов");

        System.out.println("\n--- Статистика книг ---");
        System.out.println("Всего книг создано: " + Book.getTotalBooks());
        System.out.println("Максимальный год: " + Book.MAX_YEAR);

        System.out.println("\n=== ТЕСТИРОВАНИЕ КЛАССА BANK ===");

        // Создаем счета
        Bank account1 = new Bank();
        Bank account2 = new Bank("123456789", "Петр Петров");
        Bank account3 = new Bank("987654321", "Мария Сидорова", 50000, "Рубли", true);

        // Тестируем методы
        System.out.println("--- Информация о счете (со статусом) ---");
        account1.displayInfo(true);

        System.out.println("\n--- Информация о счете (без статуса) ---");
        account2.displayInfo(false);

        System.out.println("\n--- Тест операций ---");
        account3.deposit(10000, "Зарплата");
        account3.withdraw(5000, "Покупка телефона");

        System.out.println("\n--- Статистика банка ---");
        System.out.println("Всего счетов: " + Bank.getTotalAccounts());
        System.out.println("Название банка: " + Bank.BANK_NAME);

        // Тест сложного процента
        double futureValue = Bank.calculateInterest(1000, 5, 3);
        System.out.println("Сложный процент (1000 под 5% на 3 года): " + futureValue);

        System.out.println("\n=== ТЕСТИРОВАНИЕ КЛАССА MOBILEPHONE ===");

        // Создаем телефоны
        MobilePhone phone1 = new MobilePhone();
        MobilePhone phone2 = new MobilePhone("Samsung", "Galaxy S21", 128);
        MobilePhone phone3 = new MobilePhone("Apple", "iPhone 13", 256, 50, true);

        // Тестируем методы
        System.out.println("--- Полная информация о телефоне ---");
        phone1.displayInfo(true);

        System.out.println("\n--- Информация без статуса питания ---");
        phone2.displayInfo(false);

        System.out.println("\n--- Тест батареи ---");
        phone3.chargeBattery(20, 30);
        phone3.useBattery(10, "YouTube");

        System.out.println("\n--- Статистика телефонов ---");
        System.out.println("Всего телефонов: " + MobilePhone.getTotalPhones());
        System.out.println("Максимальный заряд: " + MobilePhone.MAX_BATTERY);

        System.out.println("\n--- Техподдержка ---");
        MobilePhone.displayTechSupport();

        System.out.println("\n=== ТЕСТИРОВАНИЕ КЛАССА PRODUCT ===");

        // Создаем товары
        Product product1 = new Product();
        Product product2 = new Product("Хлеб", 50, "Продукты");
        Product product3 = new Product("Молоко", 80, "Молочные продукты", true, 25);

        // Тестируем методы
        System.out.println("--- Полная информация о товаре ---");
        product1.displayInfo(true);

        System.out.println("\n--- Информация без статуса наличия ---");
        product2.displayInfo(false);

        System.out.println("\n--- Тест операций с товаром ---");
        product3.applyDiscount(10, "SUMMER2024");
        product3.restock(50, "Молочный комбинат");
        product3.sell(10, "Анна");

        System.out.println("\n--- Статистика магазина ---");
        System.out.println("Всего товаров: " + Product.getTotalProducts());
        System.out.println("Название магазина: " + Product.STORE_NAME);

        // Тест расчета общей стоимости
        Product[] products = {product1, product2, product3};
        double totalValue = Product.calculateTotalValue(products);
        System.out.println("Общая стоимость всех товаров: " + totalValue);

        System.out.println("\n=== ТЕСТИРОВАНИЕ ГЕТТЕРОВ И СЕТТЕРОВ ===");

        // Тест геттеров и сеттеров для Book
        Book testBook = new Book();
        testBook.setTitle("Новая книга");
        testBook.setAuthor("Новый автор");
        testBook.setYear(2023);
        testBook.setPageCount(300);

        System.out.println("Книга после изменений:");
        System.out.println("Название: " + testBook.getTitle());
        System.out.println("Автор: " + testBook.getAuthor());
        System.out.println("Год: " + testBook.getYear());
        System.out.println("Страниц: " + testBook.getPageCount());

        // Тест геттеров и сеттеров для Bank
        Bank testAccount = new Bank();
        testAccount.setBalance(15000);
        testAccount.setOwnerName("Тестовый пользователь");

        System.out.println("\nСчет после изменений:");
        System.out.println("Владелец: " + testAccount.getOwnerName());
        System.out.println("Баланс: " + testAccount.getBalance());

        System.out.println("\n=== ВСЕ ТЕСТЫ ЗАВЕРШЕНЫ ===");
    }
}