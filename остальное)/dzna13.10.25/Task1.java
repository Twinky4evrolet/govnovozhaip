public class Task1 {
    public static void main(String[] args) {
        System.out.println(isPalindrom("А роза упала на лапу Азора"));
    }
    private static boolean isPalindrom(String vxodStroka){
        String array = vxodStroka.replaceAll("[^a-zA-Zа-яА-Я]", "").toLowerCase();
        int left = 0;
        int right = array.length() - 1;

        while (left < right) {
            if (array.charAt(left) != array.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}