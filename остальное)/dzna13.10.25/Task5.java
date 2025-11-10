public class Task5 {
    public static void main(String[] args) {
        String[][] array = {
                {"один", "два", "три", "дианочка"},
                {"четыре", "пять", "шесть", "солнышко"}
        };
        String[][] result = new String[array[0].length][array.length];
        for (int i = 0; i < array[0].length; i++) {
            for (int j = 0; j < array.length; j++) {
                result[i][j] = array[j][i];
            }
        }
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                if (j != result[0].length - 1){
                    System.out.print("{" + result[i][j] + ", ");
                }else{
                    System.out.print(result[i][j] + "}");
                }
            }
            System.out.println(" ");
        }
    }
}