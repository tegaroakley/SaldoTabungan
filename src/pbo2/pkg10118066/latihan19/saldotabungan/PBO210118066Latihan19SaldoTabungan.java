/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118066.latihan19.saldotabungan;

/**
 *
 * @author
 * NAMA    : Tegar Lucky'q Oakley
 * KELAS   : IF 2
 * NIM     : 10118066
 */
public class PBO210118066Latihan19SaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int saldo = 2500000;
         for (int i = 1; i <= 6; i++){
            saldo = saldo + (int)((float) saldo*0.15F);
             System.out.printf(", : .", saldo);
            System.out.println("Saldo di bulan ke-"+ i +" Rp. " + saldo);
        }
        
    }
    
}
