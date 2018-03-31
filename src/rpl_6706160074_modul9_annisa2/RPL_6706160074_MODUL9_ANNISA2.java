/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpl_6706160074_modul9_annisa2;

/**
 *
 * @author APEX
 */
public class RPL_6706160074_MODUL9_ANNISA2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        java.util.Scanner pramana = new java.util.Scanner(System.in);
        System.out.print("Masukkan Ukuran : ");
        int ukuran = pramana.nextInt();
        
        int[] modul8 = new int[ukuran];
        // Mulai
        for(int i = 0; i < ukuran; i++){
            if(i == 0)
                modul8[i] = (i+1);
            else if(i == 1)
                modul8[i] = modul8[i-1];
            else{
                modul8[i] = modul8[i-1] + modul8[i-2];
            }
        }
        // Integer Baru
        int angka = 0;
        
        for(int i = ukuran-1; i >= 0; i--){
            angka += modul8[i];
            System.out.print(modul8[i] + " ");
        }
        
        System.out.println("");
        System.out.println("Total : " + angka);
    }
    
}
