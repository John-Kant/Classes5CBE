/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.amu.dino.classes5cbe;

/**
 * @author jsiwek
 */
public class Multiply {
    public static int result1;

    public static String multiply(String a, String b) {

        int inta = Integer.getInteger(a);
        int intb = Integer.getInteger(b);

        int inta1 = 0;
        int intb1 = 0;
        for (int i = 0; i < a.length(); i++) {
            inta1 += a.charAt(i);
        }
        for (int i = 0; i < b.length(); i++) {
            intb1 += b.charAt(i);
        }

        result1 = inta1 * intb1;

        int result = inta * intb;

        return String.valueOf(result);
    }
}
