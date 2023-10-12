/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DasarPemprogramanJava;

import java.util.Scanner;
/**
 *
 * @author LAB1PC16
 */
public class Switchcase {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String nama;   
        
        System.out.println("Panggil nama siswa :");
        nama = input.next();
        switch (nama){
            case "rohma":
                System.err.println(" rohma Hadir");
                break;
            default:
                System.err.println(" Tidak Hadir");
        }
    }    
}
