public class Bank {
    private String accountNumber;
    private String ownerName;
    private double balance;
    private String currency;
    private boolean isActive;

    public Bank(){
        this("accountNumber", "ownerName", 1000.0, "currency", true);
    }
    public Bank(String accountNumber, String ownerName){
        this(accountNumber, ownerName, 1000.0, "Рубли", true);
    }
    public Bank(String accountNumber, String ownerName, double balance, String currency, boolean isActive){
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
        this.currency = currency;
        this.isActive = isActive;
    }
    public void displayInfo() {
        System.out.println("Номер аккаунта: " + this.accountNumber);
        System.out.println("Юз : " + this.ownerName);
        System.out.println("Баланс: " + this.balance);
        System.out.println("Валюта:" + this.currency);
        if (this.isActive){
            System.out.println("АКТИВЕН");
        }
        else{
            System.out.println("ЗАБЛОКИРОВАН");
        }
    }
    public void deposit(double amount){
        balance += amount;
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
    public void activateAccount(){
        isActive = true;
    }
    public void deactivateAccount(){
        isActive = false;
    }

}
