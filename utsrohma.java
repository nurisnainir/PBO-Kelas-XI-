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
import java.util.Scanner;

public class utsrohma {
    public static void main (String [] args){
        String nama;
        Scanner scanner = new Scanner (System.in);
        System.out.println("input nama;");
        nama = scanner.nextLine();
        
        int kelas;
        System.out.println("input kelas;");
        kelas = scanner.nextInt();
        
        float absen;
        System.out.println("input absen;");
        absen = scanner.nextFloat();
        
        float tugas;
        System.out.println("input tugas;");
        tugas = scanner.nextFloat();
        
        float uts;
        System.out.println("input uts;");
        uts = scanner.nextFloat();
        
        float uas;
        System.out.println("input uas;");
        uas = scanner.nextFloat();
        
        float rata ;
        
        rata = (tugas * 10/100)+(uts * 30/100)+(uas * 60/100);
        System.out.println("nilai rata; "+ rata);
        
        if (rata >=90 && rata <=100){
        System.out.println("A");
        }    
        else if (rata >80 && rata <=80){
        System.out.println("B");
        }       
        else if (rata >70 && rata <=75){       
        System.out.println("C");
        }  
        else if (rata >=60 && rata <=60){
        System.out.println("D");
        }
        else{
        System.out.println("E");
   }
 }      
}
