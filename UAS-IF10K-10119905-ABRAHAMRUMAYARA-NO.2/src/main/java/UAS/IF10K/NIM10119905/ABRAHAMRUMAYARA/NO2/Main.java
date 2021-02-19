/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS.IF10K.NIM10119905.ABRAHAMRUMAYARA.NO2;

/**
 *
NAMA : ABRAHAM RUMAYARA
NIM : 10119905
KELAS : IF10K
TANGGAL : 19/2/2021
NO SOAL : 2
 */
public class Main {

    static int akhir;
    static void hitung(int a, int b){
         akhir = (a + (b));
    }
    
    public static void main(String[] args) {

        int saldo = 100000;
        int bunga = 500;
        int lama = 5;
        
        for (int i = 1; i <= lama; i++){
            hitung(saldo,bunga);
            System.out.println("Saldo di bulan ke-"+i+" " + (akhir));
         saldo = akhir;
        }
}
}
