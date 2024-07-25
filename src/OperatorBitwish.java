/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Xuan Ling
 */
public class OperatorBitwish {
    public static void main(String[] args) {
        int a= 60;
        int b= 13;
        int c= 0;
        
         System.out.println("a & b = " + (c=a&b));
         System.out.println("a | b = " + (c=a|b));
         System.out.println("a ^ b = " + (c=a^b));
         System.out.println("~a = " + (c=~a));
         System.out.println("a >> b = " + (c=a>>2));
         System.out.println("a << b = " + (c=a<<2));
    }
}
