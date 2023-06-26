package pl.lublin.wsei.java.cwiczenia;

import pl.lublin.wsei.java.cwiczenia.mylib.Account;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Integer.toBinaryString;
import static java.lang.Integer.toHexString;

public class Main {
    /**
     * Oto javadoc.
     *
     * @param args
     * @return nic
     */

//    private static String leftPad(String aText, char aChar, int aWidth) {
//        String res = aText;
//        for (int i = 0; i < aWidth - aText.length(); i++)
//            res = aChar + res;
//        return res;
//    }

    public static void main(String[] args) {
        // System.out.println("Hello Java world\n");

        // oto kometarz jednolinijkowy
        /* oto komentarz wielolinijkowy
        ciągnie się ...
        i ciągnie się ...
         */
//        System.out.print("Ala");
//        System.out.print("ma");
//        System.out.print("kota");
//
//        System.out.print("\n\n");
//
//        System.out.print("Ala\n");
//        System.out.print("ma\n");
//        System.out.print("kota\n");

//        int a =3;
//        double b = 4.21;
//        String s = "jakiś tekst";
//
//        System.out.printf("a = %d, b = %f, s = %s %n", a, b, s);
//
//        System.out.printf("a = %d, b = %.2f, s = %20s %n", a, b, s);

//        System.out.println("Nazywaliśmy to \"witaminą B3\"");

//        System.out.printf("alfa\tsin(alfa)\n");
//        for (int i = 0; i < 370; i += 10) {
//            System.out.printf("%d\t%f\t\n", i, Math.sin(i/360.0 * 2 * Math.PI));
//        }

//        System.out.printf("arg\tlog2(arg)\tsum(arg)\n");
//        double sum = 0;
//        for (int i = 0; i < 11; i++) {
//            double power = Math.pow(2, i);
//            double log2 = Math.log(power) / Math.log(2);
//            sum += power;
//            System.out.printf("%d\t%f\t%f\n", i, log2, sum);
//        }

//        Scanner input = new Scanner(System.in);
//        int num1, num2;
//        System.out.print("Podaj pierwszą liczbę: ");
//        num1 = input.nextInt();
//        System.out.print("Podaj drugą liczbę: ");
//        num2 = input.nextInt();
//        System.out.printf("Wynik dodawania %d + %d = %d%n", num1, num2, num1 + num2);

//        Scanner input = new Scanner(System.in);
//        int num1 = 0, num2 = 0;
//        do {
//            System.out.print("Podaj liczbę: ");
//            num1 = input.nextInt();
//            num2 = input.nextInt();
//            if ((num1 == 0) || (num2 == 0)) break;
//            System.out.printf("Wynik dodawania %d + %d = %d%n", num1, num2, num1 + num2);
//        } while (true);
//    }

//        Scanner input = new Scanner(System.in);
//        int num1 = 0;
//        do {
//            System.out.print("Podaj liczbę: ");
//            num1 = input.nextInt();
//            if (num1 == 0) break;
//            String num_bin = toBinaryString(num1);
//            String num_hex = toHexString(num1).toUpperCase();
//            num_bin = leftPad(num_bin, '0', 8);
//            num_hex = leftPad(num_hex, '0', 4);
//            System.out.printf("DEC = %d, BIN = %s, HEX = %%%s\n", num1, num_bin, num_hex);
//        } while (true);
//    }

//        int[] liczby = new int[30];
//        Random rnd = new Random();
//
//        for (int i = 0; i < 30; i++)
//            liczby[i] = rnd.nextInt();
//
//        int mx = Integer.MIN_VALUE;
//        int mn = Integer.MAX_VALUE;
//        long avg = 0;
//        for (int l : liczby) {
//            System.out.println(l);
//            if (l < mn) mn = l;
//            if (l > mn) mx = l;
//            avg += l;
//        }
//        System.out.printf("MIX = %d, MAX = %d, AVG = %f", mn, mx, (float) avg / liczby.length);

//        Account acc = new Account();
//        acc.setName("łukasz Skóra");
////        acc.name("Łukasz Skóra");
//        System.out.println(acc.getName());
//
//        System.out.printf("%s%n",Account.capitalize("stanisŁaw maruSARz"));

        System.out.print(Account.translit("Йосип Данило"));
    }
}