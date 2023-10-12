/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DasarPemprogramanJava;

/**
 *
 * @author LAB1PC16
 */
public class Operatorrohma {
    public static void main (String [] args) {
        int  nilaimat = 89, bindo = 90, pbo =91, basis = 92, ppl = 93, iot =94;
        int rr;
        
       rr = (nilaimat + bindo + pbo + basis + ppl + iot)/6;
        
        System.out.println("nilai rata-rata = "+rr);
        if(rr>75){
            System.out.println("Lulus");
        }
        else{
            System.out.println("Tidak Lulus");
        }
    }
}
