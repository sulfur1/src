package algorithms;

public class IsPalindromNumber {

    public static boolean isPalindrom(String number) {
        boolean isPalindrom = true;
        char[] chars = number.toCharArray();

        for (int x = 0; x < chars.length; x++) {
            char element = chars[x];
            if (element != chars[chars.length - 1 - x]) {
                isPalindrom = false;
            }
        }
        return isPalindrom;
    }



    public static void main(String[] args) {

        System.out.println(isPalindrom("123321"));
        System.out.println(isPalindrom("1234"));
        System.out.println(isPalindrom("10001"));

    }
}
