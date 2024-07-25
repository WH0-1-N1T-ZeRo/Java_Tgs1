/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesi1;
import java.util.Scanner; 
import sesi1.Video5;
/**
 *
 * @author Xuan Ling
 */
public class Video4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        String nama;
        String jurusan;
        int Umur;
        Double Ipk;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nama Mahasiswa : ");
        nama = input.nextLine();
        
        System.out.print("Jurusan : ");
        jurusan = input.nextLine();
        
        System.out.print("Umur Mahasiswa : ");
        Umur = input.nextInt();
        
        System.out.print("Ipk Mahasiswa : ");
        Ipk = input.nextDouble();
        
        
        System.out.print("======================================");
        System.out.print("\nNama : "+nama);
        System.out.print("\nJurusan : "+jurusan);
        System.out.print("\nUmur : "+Umur);
        System.out.print("\nIpk : "+Ipk+"\n\n");
        
        System.out.print("======================================");
        
    }
    
}
