public class Task3 {
    public static void main(String[] args) {
        String[][] array = {
                {"кошк", "стола"},
                {"собака", "стул"}
        };
        boolean flag = true;
        for (int i = 0; i < array[0].length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (checkglas(array[j][i])) {
                    flag = true;
                    break;
                }
                if (!checkglas(array[j][i])) {
                    flag = false;
                    break;
                }
            }
        }
        System.out.println(flag);

    }
    private static boolean checkglas(String word){
        char[] myarray = {'а', 'о', 'у', 'э', 'и', 'ы', 'е', 'ё', 'ю', 'я'};
        char lastglas = word.charAt(word.length() -1 );
        for (int i = 0; i < myarray.length; i++) {
            if (lastglas == myarray[i]) {
                return true;
            }
        }
        return false;
    }
}
