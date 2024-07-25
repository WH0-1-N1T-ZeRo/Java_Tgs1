/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Xuan Ling
 */
public class OperatorPenugasan {

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println("Penjumlahan : " + (b += a));

        System.out.println("Pengurangan : " + (b -= a));

        System.out.println("Pengalian : " + (b *= a));

        System.out.println("Pembagian : " + (b /= a));

        System.out.println("Pembagian : " + (b %= a));
    }
}
