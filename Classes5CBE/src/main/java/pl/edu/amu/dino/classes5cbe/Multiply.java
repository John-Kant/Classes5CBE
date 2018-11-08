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

       int inta = Integer.getInteger(a);
       int intb = Integer.getInteger(b);

       int result = inta * intb;

       return String.valueOf(result);

   }
}
