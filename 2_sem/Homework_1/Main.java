public class Main {
    public static void main(String[] args){
        ItemStorage<Integer> storage_A = new ItemStorage<>(100);
        System.out.print("Результат сценария А: ");
        storage_A.compareWith(100);
        System.out.println();
        //ну там при сравнении через == у нас сравниваются ссылки на значения
        //и там диапазон от -128 до 127 поэтому true

        ItemStorage<Integer> storage_B = new ItemStorage<>(200);
        System.out.print("Результат сценария Б: ");
        storage_B.compareWith(200);
        System.out.println();
        //ну а тут выходим за диапозон кеширования поэтому false

        ItemStorage<Fraction> storage_C = new ItemStorage<>(new Fraction(1, 2));
        System.out.print("Результат сценария В: ");
        Fraction frac = new Fraction(1, 2);
        System.out.println(storage_C.getValue().equals(frac));
        //ну тут мы переопределили equals для Fraction и поэтому всё корректно сравнивается, без геттера там короче неправильно
        // результат вывходит потому что там мы типо сравниваем ItemStorage со Fraction
    }
}