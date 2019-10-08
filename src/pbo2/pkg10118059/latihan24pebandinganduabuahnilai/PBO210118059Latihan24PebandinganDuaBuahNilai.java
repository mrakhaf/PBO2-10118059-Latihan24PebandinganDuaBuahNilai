/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118059.latihan24pebandinganduabuahnilai;
import java.util.Scanner;
/**
 *
 * @author 
 * Nama  : Muhammad Rakha Firdaus
 * NIM   : 10118059
 * Kelas : IF-2
 */
public class PBO210118059Latihan24PebandinganDuaBuahNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("===PROGRAM PERBANDINGAN NILAI===");
        for(String ulang = "ya"; ulang.equals("ya")||ulang.equals("Ya");){        
            System.out.print("Masukkan nilai pertama : ");
            int nilaiPertama = input.nextInt();
            System.out.print("Masukkan nilai kedua : ");
            int nilaiKedua = input.nextInt();
            System.out.println("");
            if(nilaiPertama>nilaiKedua){
                System.out.println("Hasil : " + nilaiPertama + " lebih besar dari " + nilaiKedua);
            } else if(nilaiPertama<nilaiKedua){
                System.out.println("Hasil : " + nilaiPertama + " lebih kecil dari " + nilaiKedua);
            } else if(nilaiPertama==nilaiKedua){
                System.out.println("Hasil : " + nilaiPertama + " sama dengan " + nilaiKedua);
            }
            System.out.print("Ulangi Aktivitas ?(ya/tidak) :  ");
            ulang = input.next();
            System.out.println("");
        }
        System.out.println("(Developed by mrakhaf)");
    }
    
}
