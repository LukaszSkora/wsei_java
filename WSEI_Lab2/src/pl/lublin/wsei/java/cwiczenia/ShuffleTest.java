package pl.lublin.wsei.java.cwiczenia;

import pl.lublin.wsei.java.cwiczenia.myLib.StringFun;

import java.util.Scanner;

public class ShuffleTest {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        do {
            System.out.print("Podaj tekst do sprawdzenia (0, jak Ci się znudzi): ");
            String tekst = scn.nextLine();
            if (tekst.equals("0")) break;
            System.out.print("Tekst: " + tekst + " --> " + StringFun.shuffle(tekst) + "\n");
        } while (true);
    }
}