/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO10K.NIM10119905.Latihan35.ProgramTunjangan;
import java.util.Scanner;
/**
 *
 * @author
 * Nama     : Abraham Rumayara
 * Kelas    : IF10K
 * NIM      : 10119905
 * Deskripsi Program : Program ini merupakan program HitungGaji
 */
public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        HitungGaji hitungGaji= new HitungGaji();
        System.out.println("========== Program Gaji Pokok ==========");
        System.out.println("Berapa Gaji Pokok Anda Perbulan ? : ");
        hitungGaji.GajiPokok = scanner.nextFloat();
        
        System.out.println("Status Anda? (Menikah/Belum)      : ");
        hitungGaji.Status =  scanner.next();        

        hitungGaji.hitungTunjangan();
        hitungGaji.hitungTotalgaji();
        
        System.out.println();
        System.out.println("====== Hasil Perhitungan Gaji Anda ======");
        System.out.println("Gaji Pokok     : Rp. "+ hitungGaji.GajiPokok);
        System.out.println("Tunjangan      : Rp. "+ hitungGaji.Tunjangan);
        System.out.println("Total Gaji     : Rp. "+ hitungGaji.TotalGaji);
        System.out.println("(Develloped by Abraham Rumayara)");
        
        
    }
    
}
