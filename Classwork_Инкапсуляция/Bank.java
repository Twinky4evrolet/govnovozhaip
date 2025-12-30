public class Bank {
    private String accountNumber;
    private String ownerName;
    private double balance;
    private String currency;
    private boolean isActive;

    private static int totalAccounts = 0;
    public static final String BANK_NAME = "Национальный Банк";

    public Bank() {
        this("accountNumber", "ownerName", 1000.0, "currency", true);
    }

    public Bank(String accountNumber, String ownerName) {
        this(accountNumber, ownerName, 1000.0, "Рубли", true);
    }

    public Bank(String accountNumber, String ownerName, double balance, String currency, boolean isActive) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
        this.currency = currency;
        this.isActive = isActive;
        totalAccounts++;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public String getCurrency() {
        return currency;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setBalance(double balance) {
        if (balance >= 0 && balance <= 1000000000) {
            this.balance = balance;
        }
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public static double calculateInterest(double amount, double rate, int years) {
        double result = amount;
        for (int i = 0; i < years; i++) {
            result = result * (1 + rate / 100);
        }
        return result;
    }

    public void displayInfo() {
        System.out.println("Номер аккаунта: " + this.accountNumber);
        System.out.println("Владелец: " + this.ownerName);
        if (this.isActive) {
            System.out.println("АКТИВЕН");
        } else {
            System.out.println("ЗАБЛОКИРОВАН");
        }
    }

    public void displayInfo(boolean showStatus) {
        if (showStatus) {
            System.out.println("Номер аккаунта: " + this.accountNumber);
            System.out.println("Владелец: " + this.ownerName);
            System.out.println("Баланс: " + this.balance);
            System.out.println("Валюта: " + this.currency);
            if (this.isActive) {
                System.out.println("АКТИВЕН");
            } else {
                System.out.println("ЗАБЛОКИРОВАН");
            }
        } else {
            displayInfo();
        }
    }


    public void deposit(double amount){
        balance += amount;
    }

    public void deposit(double amount, String description){
        balance += amount;
        System.out.println("Операция: " + description);
    }

    public void withdraw(double amount){
        if (balance >= amount){
            balance -= amount;
            System.out.println("Успешное снятие денег");
        }
        else{
            System.out.println("Недостаточно средств");
        }
    }

    public void withdraw(double amount, String purpose){
        if (balance >= amount){
            balance -= amount;
            System.out.println("Цель снятия: " + purpose);
        }
        else{
            System.out.println("Недостаточно средств");
        }
    }

    public void activateAccount(){
        isActive = true;
    }

    public void deactivateAccount(){
        isActive = false;
    }
}
