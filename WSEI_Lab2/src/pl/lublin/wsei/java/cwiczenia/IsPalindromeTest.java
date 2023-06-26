package pl.lublin.wsei.java.cwiczenia;

import pl.lublin.wsei.java.cwiczenia.myLib.*;
import java.util.Scanner;

public class IsPalindromeTest {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        do {
            System.out.print("Podaj tekst do sprawdzenia (0, jak Ci się znudzi): ");
            String tekst = scn.nextLine();
            if (tekst.equals("0")) break;
            System.out.print("Tekst: " + tekst + " " +
                    (StringFun.isPalindrome(tekst) ? "" : "nie ") +
                    "jest palindromem\n");
        } while (true);
    }
}
