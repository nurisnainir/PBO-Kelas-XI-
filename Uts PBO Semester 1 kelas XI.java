/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rohmauts;

import java.util.Scanner;
/**
 *
 * @author LAB KOMPUTER 1
 */
public class Rohmauts {

    /**
     * @param args the command line arguments
    */
    public static void main(String[] args) {
        String nama;
        Scanner scanner = new Scanner (System.in);
        System.out.println(" input Nama :");
        nama = scanner.nextLine();
        System.out.println("Nama: + nama");
        
        int kelas =11;
        System.out.println(" input Kelas :");
        kelas = scanner.nextInt();
        System.out.println("Kelas: + kelas");
        
        float absen =16;
        System.out.println(" input Absen:");
        absen = scanner.nextFloat();
        System.out.println("Absen: + absen");
        
        
        int tugas = 85;
        int uts = 88;
        int uas = 89;
        int nilaiakhir;
        
        nilaiakhir = (tugas + uts + uas )/3;
        System.out.println("nilai akhir= "+ nilaiakhir);
        if(tugas<85){
            System.out.println("a");
        }
        else {
            System.out.println("b");
        }
        if(uts<88){
            System.out.println("b");
        }
        else {
            System.out.println("a");
        }
        if(uas<89){
            System.out.println("b");
        }
        else {
            System.out.println("a");
    }   
}
