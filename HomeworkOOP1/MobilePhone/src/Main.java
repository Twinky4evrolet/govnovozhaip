public class Main {
    public static void main(String[] args){
        MobilePhone mobilePhone = new MobilePhone();
        mobilePhone.chargeBattery(200);
        System.out.println("////////////////////");
        mobilePhone.displayInfo();
        mobilePhone.useBattery(200);
        System.out.println("//////////");
        mobilePhone.displayInfo();
    }
}