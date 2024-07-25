/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesi1;

/**
 *
 * @author Xuan Ling
 */
public class Video_8a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        for (int a = 1; a <= 10; a++) {
//            System.out.println("Ngoding Java");
//        }
        
//        for (int a = 1; a <= 10; a++) {
//            System.out.print(a+", ");
//        }
        
        for (int a = 1; a <= 20; a+=2) {
            System.out.print(a+", ");
        }
        
        ArrayFor();
        
    }

    static void ArrayFor(){
        int a[] = {2,5,2,7,54,2,12};
        String b[] = {"Satu","Dua","Tiga","Empat","Lima"};
        
        for (String x : b){
            System.out.print(x+", ");
        }
    }
}
