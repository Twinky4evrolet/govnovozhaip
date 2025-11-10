public class Main {
    public static void main(String[] args){
        Product product1 = new Product();
        product1.displayInfo();
        product1.applyDiscount(13);
        product1.restock(1000);
        product1.sell(500);
        System.out.println("///////////////////");
        product1.displayInfo();
    }
}