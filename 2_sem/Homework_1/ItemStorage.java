public class ItemStorage<T>{
    private T value;
    public ItemStorage(T value){
        this.value = value;
    }
    public T getValue(){
        return value;
    }
    public void setValue(T value){
        this.value = value;
    }

    public void compareWith(T otherValue){
        try {
            if (this.value==(otherValue)){
                System.out.println("Значения идентичны. Контроль качества пройден");
            } else {
                System.out.println("Значения разные");
            }
        } catch (NullPointerException e){
            System.out.println("гавно");
        }
    }
}
