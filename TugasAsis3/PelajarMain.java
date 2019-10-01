/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasAsis3;
import java.util.Scanner;

/**
 *
 * @author Dhea
 */
public class PelajarMain {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan NIP \t\t: ");
        int setNip = input.nextInt();
        System.out.print("Masukkan Nama \t\t: ");
        String setNama = input.next();
        System.out.print("Masukkan Nilai Ujian 1 \t: ");
        double setNilaiUjian1 = input.nextDouble();
        System.out.print("Masukkan Nilai Ujian 2 \t: ");
        double setNilaiUjian2 = input.nextDouble();
        System.out.print("Masukkan Nilai Tugas \t: ");
        double setNilaiTugas = input.nextDouble();
        System.out.print("\n________________________________________");
        
        
        System.out.print("\n(Pake Inputan)");
        System.out.print("\n");
        System.out.print("\nDATA PELAJAR");
        System.out.print("\nNIP \t\t: " +setNip);
        System.out.print("\nNama \t\t: " +setNama);
        System.out.print("\nNilai Ujian 1 \t: " +setNilaiUjian1);
        System.out.print("\nNilai Ujian 2\t: " +setNilaiUjian2);
        System.out.print("\nNilai Tugas \t: " +setNilaiTugas);
        
        Pelajar p1 = new Pelajar();
        p1.setNip(setNip);
        p1.setNama(setNama);
        p1.setNilaiUjian1(setNilaiUjian1);
        p1.setNilaiUjian2(setNilaiUjian2);
        p1.setNilaiTugas(setNilaiTugas);
        p1.nilaiAkhir();
        p1.lulusGak();
        
        System.out.print("\nNilai Akhir \t: " +p1.nilaiAkhir());
        System.out.print("\nStatus\t\t: " +p1.lulusGak());
        System.out.print("\n________________________________________");
        
        System.out.print("\n(Tanpa Parameter)");
        System.out.print("\n");
        Pelajar p2 = new Pelajar();
        p2.infoPelajar();
        System.out.print("\n________________________________________");
        
        System.out.print("\n(Dengan Parameter)");
        System.out.print("\n");
        Pelajar p3 = new Pelajar(75, "Stella", 75, 60, 40);
        p3.infoPelajar();
        System.out.print("\n");
        
        
        
        
        
        
    }
    
}
