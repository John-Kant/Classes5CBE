/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.amu.dino.classes5cbe;

/**
 *
 * @author jsiwek
 */
public class Multiply {
   public static String multiply(String a, String b){
       int mult1 = Integer.valueOf(a);
       int mult2 = Integer.valueOf(b);
       String result = Integer.toString(mult2*mult1);
    return result;
   }
}
