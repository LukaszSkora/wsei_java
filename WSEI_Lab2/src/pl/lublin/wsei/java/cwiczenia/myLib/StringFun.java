package pl.lublin.wsei.java.cwiczenia.myLib;

import org.apache.commons.lang3.StringUtils;

import static java.lang.Character.*;
import java.util.*;

public class StringFun {
    public static String anarchize(String arg) {
        String res = "";
        for (int i = 0; i < arg.length(); i++) {
            if ( isLowerCase(arg.charAt(0)) ) {
                if ( i % 2 == 0 ) res += toUpperCase(arg.charAt(i));
                else res += toLowerCase(arg.charAt(i));
            }
            else {
                if ( i % 2 == 0 ) res += toLowerCase(arg.charAt(i));
                else res += toUpperCase(arg.charAt(i));
            }
        }
        return res;
    }

    public static String camelize(String arg) {
        String res = "";
        String lower = arg.toLowerCase();
        String norm = StringUtils.normalizeSpace(lower);
        String[] arr = StringUtils.split(norm, ' ');
        for (int i = 0; i < arr.length; i++) {
            String word = arr[i];
            word = word.substring(0, 1).toUpperCase() + word.substring(1);
            res += word;
        }
        return res;
    }

    public static String decamelize(String arg) {
        String res = arg.substring(0, 1);
        for (int i = 1; i < arg.length() - 1; i++) {
            if ( isUpperCase(arg.charAt(i)) ) res += " " + arg.charAt(i); else res += arg.charAt(i);
        }
        res += arg.substring(arg.length() - 1);
        return res;
    }

    public static boolean isPalindrome(String arg) {
        boolean res;
        String lower = arg.toLowerCase();
        String alpha = lower.replaceAll("[^a-zA-Z0-9]", "");
        String odwr = "";
        for (int i = alpha.length() - 1; i >= 0; i--) {
            odwr += alpha.charAt(i);
        }
        res = alpha.equals(odwr);

        return res;
    }

    public static String shuffle(String arg) {
        String res = "";
        Random ran = new Random();
        int len = arg.length();
        for (int i = 0; i < len; i++) {
            int rnd = ran.nextInt( len - i );
            res += arg.charAt(rnd);
            arg = arg.substring(0, rnd) + arg.substring(rnd + 1);
        }
        return res;
    }
}
