/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 *
 * @author LAB1PC16
 */
import java.util.Scanner;

public class Scanner1 {
    public static void main (String [] args){
        String nama;
        Scanner scanner = new Scanner (System.in); 
        System.out.println("Masukkan nama: ");
        nama = scanner.nextLine(); 
        
        System.out.println("Nama: " + nama);
        
        float absen =16;
        System.out.println("masukkan absen: ");
        absen = scanner.nextFloat();
        
        System.out.println("Absen: " + absen);
        
        int kelas =11;
        System.out.println("masukkan kelas: ");
        kelas = scanner.nextInt();
        
        System.out.println("Kelas: " + kelas);
        
        double usia = 16;
        System.out.println("masukkan usia: ");
        usia = scanner.nextDouble();
        
        System.out.println("Kelas: " + kelas);
    }
}
