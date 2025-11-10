public class Main {
    public static void main(String[] args){
        Car car1 = new Car();
        car1.displayInfo();
        car1.drive(103.7);
        car1.repaint("purple");
        car1.updatePrice(12035.4);
        System.out.println("//////////////////////////");
        car1.displayInfo();
        if ((2025 - car1.getYear()) < 4){
            System.out.println("Норм, бери эту ласточку");
        } else System.out.println("tte");
    }
}