public class Main {
    public static void main(String[] args) {
        Bank bank1 = new Bank("007", "Молодой Окунь", 100.0, "Рубли", true);
        bank1.displayInfo();
        bank1.activateAccount();
        System.out.println("/////////////////////////////////");
        bank1.deposit(5.5);
        bank1.displayInfo();
        bank1.deactivateAccount();
        System.out.println("/////////////////////////////////");
        bank1.withdraw(10000000.0);
        System.out.println("/////////////////////////////////");
        bank1.displayInfo();

    }
}
