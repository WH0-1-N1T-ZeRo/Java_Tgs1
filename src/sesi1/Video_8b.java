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
public class Video_8b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=0;
        String b;
        Boolean c= true;
        Scanner inp=new Scanner(System.in);
        
        while(c){
            System.out.println("Apakah anda ingin keluar dari system ? \nJawab [ya/tidak]");
            b = inp.nextLine();
            if(b.equalsIgnoreCase("ya")){
                c= false;
            }
            a++;
        }
        
        System.out.println("Anda sudah melakukan perulangan ke-"+a);
        HitungWhile();
        DoWhile();
        Nested();
    }
    
    static void HitungWhile(){
        int a=0;
        while (a>=10) {  
            System.out.println("Perulangan ke-"+a);
            a++;
        }
    }
    
    static void DoWhile(){
        int a=0;
         do{  
            System.out.println("Perulangan ke-"+a);
            a++;
        }while (a>=10);
    }
    
    static void Nested(){
        int x, y;

        // melakukan perulangan sebanyak x dan y
        /*
        for (x = 0; x <= 5; x++) {
            for (y = 0; y <= 3; y++) {
                System.out.format("Perulangan [x=%d, y=%d] %n", x, y);
            }
        }
        */

        for (x = 1; x <= 5; x++) {
            for (y = 1; y <= x; y++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
