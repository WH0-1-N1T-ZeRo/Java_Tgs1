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
public class Video_7b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inp = new Scanner(System.in);

        int nilai;

        System.out.print("Inputkan Nilai : ");
        nilai = inp.nextInt();

        if (nilai > 90) {
            System.out.println("A");
        } else if (nilai > 80) {
            System.out.println("AB");
        } else if (nilai > 70) {
            System.out.println("B");
        } else if (nilai > 60) {
            System.out.println("BC");
        } else if (nilai > 50) {
            System.out.println("C");
        } else if (nilai > 40) {
            System.out.println("D");
        } else {
            System.out.println("E");
        }

        SwitchCase();
        Nested();
    }

    static void SwitchCase() {
        String lampu;
        Scanner inp = new Scanner(System.in);

        System.out.print("Masukkan warna lampu : ");
        lampu = inp.nextLine();

        switch (lampu) {
            case "merah":
                System.out.println("Lampu Merah, Berhenti!");
                break;
            case "kuning":
                System.out.println("Lampu Kuning, Harap hati-hati!");
                break;
            case "hijau":
                System.out.println("Lampu Merah, Silahkan jalan!");
                break;
            default:
                System.out.println("warna Lampu slah!");
                break;
        }
    }
    
    static void Nested (){
        Scanner inp = new Scanner(System.in);
        String kartu;
        int belanja, diskon, bayar;
        
        System.out.println("Apakah punya katru member ? : ya/tidak");
        kartu = inp.nextLine();
        
        System.out.print("Total belanja : Rp.");
        belanja = inp.nextInt();
        
        if(kartu.equalsIgnoreCase("ya")){
            if(belanja > 500000){
                diskon = 50000;
            }
            else if(belanja > 100000){
                diskon = 10000;
            }else{
                diskon = 0;
            }
        }else{
            if(belanja > 100000){
                diskon = 5000;
            }else{
                diskon = 0;
            }
        }
        
        System.out.println("Total bayar = Rp."+ (bayar = belanja-diskon));
    }

}
