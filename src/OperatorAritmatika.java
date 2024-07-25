/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Xuan Ling
 */
public class OperatorAritmatika {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int a;
        int b;
        int c;
        
        Scanner inp = new Scanner(System.in);
        
        System.out.println("Penjumlahan : ");
        System.out.print("Nilai 1 : ");
        a = inp.nextInt();
        System.out.print("Nilai 2 : ");
        b = inp.nextInt();
        
        System.out.print("Hasil : "+(c=a+b));
        
        System.out.println("\n\nPengurangan : ");
        System.out.print("Nilai 1 : ");
        a = inp.nextInt();
        System.out.print("Nilai 2 : ");
        b = inp.nextInt();
        
        System.out.print("Hasil : "+(c=a-b));
        
        System.out.println("\n\nPerkalian : ");
        System.out.print("Nilai 1 : ");
        a = inp.nextInt();
        System.out.print("Nilai 2 : ");
        b = inp.nextInt();
        
        System.out.print("Hasil : "+(c=a*b));
        
        System.out.println("\n\nPembagian : ");
        System.out.print("Nilai 1 : ");
        a = inp.nextInt();
        System.out.print("Nilai 2 : ");
        b = inp.nextInt();
        
        System.out.print("Hasil : "+(c=a/b));
        
    }
    
}
