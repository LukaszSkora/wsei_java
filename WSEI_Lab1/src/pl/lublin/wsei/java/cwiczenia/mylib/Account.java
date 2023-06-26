package pl.lublin.wsei.java.cwiczenia.mylib;


import org.apache.commons.lang3.StringUtils;

import java.util.Locale;

public class Account {
    private String name;

    private static String ukrAlphabet = "абвгдеєжзиіїйклмнопрстуфхцчшщьюя";
    private static String translitRepl[] = {"a", "b", "v", "g", "d", "e", "je", "zh", "z", "y", "i", "ji", "j", "k",
            "l", "m", "n", "o", "p", "r", "s", "t", "u", "f", "h", "c", "ch", "sh", "shh", "'", "ju", "ja"};

    public static String capitalize(String aStr) {
        String[] tokens = StringUtils.split(aStr);
        for (int i = 0; i < tokens.length; i++) tokens[i] = StringUtils.capitalize(tokens[i]);
        return StringUtils.join(tokens, ' ');
    }

    public void setName(String name) {
        this.name = capitalize(name);
    }

    public String getName() {
        return name;
    }

    public static String translit(String arg) {
        arg = arg.toLowerCase();
        String res = "";
        for (int i = 0; i < arg.length(); i++) {
            char ch = arg.charAt(i);
            int idx = ukrAlphabet.indexOf(ch);
            if (idx == -1) {
                res += ch;
            } else {
                res += translitRepl[idx];
            }
        }
        return res;
    }
}
