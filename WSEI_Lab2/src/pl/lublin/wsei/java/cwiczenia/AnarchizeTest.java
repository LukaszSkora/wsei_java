package pl.lublin.wsei.java.cwiczenia;

import pl.lublin.wsei.java.cwiczenia.myLib.*;
import java.util.Scanner;

public class AnarchizeTest {
    public static void main(String[] args) {
//        String tekst;
//        String res;
//
//        tekst = "ala";
//        res = StringFun.anarchize(tekst);
//        if (res == "AlA") System.out.println("OK"); else System.out.println("ŹLE");
//
//        tekst = "ALA";
//        res = StringFun.anarchize(tekst);
//        if (res == "aLa") System.out.println("OK"); else System.out.println("ŹLE");

        Scanner scn = new Scanner(System.in);
        do {
            System.out.print("Podaj tekst do sprawdzenia (0, jak Ci się znudzi): ");
            String tekst = scn.next();
            if (tekst.equals("0")) break;
            System.out.print("Tekst: " + tekst + " --> " + StringFun.anarchize(tekst) + "\n");
        } while (true);
    }
}