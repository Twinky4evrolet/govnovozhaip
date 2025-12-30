public class TransportMain {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[6];

        vehicles[0] = new Car("Toyota", 180, "Бензин");
        vehicles[1] = new Car("Tesla", 250, "Электричество");
        vehicles[2] = new Bicycle("Stels", 30, 6);
        vehicles[3] = new Bicycle("Forward", 25, 1);
        vehicles[4] = new Motorcycle("Harley-Davidson", 180, 1200);
        vehicles[5] = new Motorcycle("Yamaha", 220, 600);

        System.out.println("=== ДЕМОНСТРАЦИЯ ПОЛИМОРФИЗМА ===");
        System.out.println("Все транспортные средства двигаются:");

        for (Vehicle vehicle : vehicles) {
            System.out.print(vehicle.getBrand() + ": ");
            vehicle.move();
        }

        System.out.println("\n=== ПРИВЕДЕНИЕ ТИПОВ ДЛЯ СПЕЦИАЛЬНЫХ МЕТОДОВ ===");

        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof Car) {
                Car car = (Car) vehicle;
                car.refuel();
            } else if (vehicle instanceof Bicycle) {
                Bicycle bicycle = (Bicycle) vehicle;
                bicycle.changeGear();
            } else if (vehicle instanceof Motorcycle) {
                Motorcycle motorcycle = (Motorcycle) vehicle;
                motorcycle.wheelie();
            }
        }

        System.out.println("\n=== ИНФОРМАЦИЯ О ТРАНСПОРТЕ ===");
        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
            vehicle.move();
            vehicle.stop();
            System.out.println("---");
        }
    }
}