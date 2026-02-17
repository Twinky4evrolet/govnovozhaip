import java.util.Scanner;

public class Car {
    private static Scanner scan = new Scanner(System.in);
    private String brand;
    private String model;
    private int year;
    private String color;
    private double price;
    private boolean isRunning;
    private double mileage;

    public Car() {
        this("Автоваз", "7", 1975, "g(r)ay", 999.0, true, 2000.0);
    }

    public Car(String brand, String model, int year) {
        this(brand, model, year, "g(r)ay", 999.0, true, 2000.0);
    }

    public Car(String brand, String model, int year, String color, double price, boolean isRunning, double mileage) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        this.isRunning = isRunning;
        this.mileage = mileage;
    }

    public void setYear(int newYear){

        while (newYear < 1885 || newYear > 2025){
            System.out.println("Введи нормальный год лох");
            newYear = scan.nextInt();
        }
        year = newYear;
    }
    public int getYear(){
        return year;
    }

    public void displayInfo() {
        System.out.println("Марка: " + brand);
        System.out.println("Модель: " + model);
        System.out.println("Год: " + year);
        System.out.println("Цвет: " + color);
        System.out.println("Цена: " + price);
        System.out.println("Заведена: " + (isRunning ? "Да" : "Нет"));
        System.out.println("Пробег: " + mileage);
    }

    public void startEngine() {
        isRunning = true;
    }

    public void stopEngine() {
        isRunning = false;
    }

    public void drive(double distance) {
        if (isRunning) {
            mileage += distance;
        } else {
            System.out.println("Двигатель не заведен");
        }
    }

    public void repaint(String newColor) {
        color = newColor;
    }

    public void updatePrice(double newPrice) {
        price = newPrice;
    }
}