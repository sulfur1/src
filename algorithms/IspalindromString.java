package algorithms;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IspalindromString {

    public static boolean isPalindrom(String exp) {
        boolean isPalindrom = true;
        String expression = exp.replaceAll("\\W", "").toLowerCase();
        char[] chars = expression.toCharArray();

        for (int x = 0; x < chars.length; x++) {
            char element = chars[x];
            if (element != chars[chars.length - 1 - x]) {
                isPalindrom = false;
            }
        }
        return isPalindrom;
    }

    public static void main(String[] args) {
        System.out.println(IspalindromString.isPalindrom("Madam, I'm Adamp!"));
    }
}
