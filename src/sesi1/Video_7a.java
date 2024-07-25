/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesi1;

import java.util.Scanner;

/**
 *
 * @author Xuan Ling
 */
public class Video_7a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a;
        Scanner inp = new Scanner(System.in);

        System.out.print("Harga Total belanjaan anda : Rp.");
        a = inp.nextInt();

        if (a > 100000) {
            System.out.println("Selamat, anda mendapatkan minyak goreng");
        }
        System.out.println("Terima kasih!\n\n");
        Base();
    }

    static void Base() {
        Scanner inp = new Scanner(System.in);
        String a;
        int b;

        System.out.print("Nama :");
        a = inp.nextLine();
        System.out.print("Nilai :");
        b = inp.nextInt();

//        if (b >= 75) {
//            System.out.println("Selamat " + a + " anda lulus");
//        } else {
//            System.out.println("Maaf " + a + " anda gagal");
//        }

        String cetak = (b>=75) ? "Selamat "+a+" anda lulus!": "Maaf "+a+"anda gagal";
        System.out.println(cetak);

    }

}
