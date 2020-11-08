/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO10K.NIM10119905.Latihan35.ProgramTunjangan;

/**
 *
 * @author aruma
 */
public class HitungGaji {
    public float GajiPokok;
    public float TotalGaji;
    public float Tunjangan;
    public String Status;
    
    public void hitungTunjangan(){
    if (Status.equals("Menikah")){
            Tunjangan = GajiPokok*35/100;
        } else {           
            Tunjangan = 0;    
        }  
    }
    public void hitungTotalgaji(){
           TotalGaji= GajiPokok + Tunjangan;
    }
}
