/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasAsis2;
import java.util.Scanner;

/**
 *
 * @author Dhea
 */
public class BukuMain {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nama Pengarang\t : ");
        String setNamaPengarang = input.nextLine();
        System.out.print("Masukkan Judul Buku\t : ");
        String setJudulBuku = input.nextLine();
        System.out.print("Masukkan Tahun Terbit\t : ");
        int setTahunTerbit = input.nextInt();
        System.out.print("Masukkan Cetakan Ke\t : ");
        int setCetakanKe = input.nextInt();
        System.out.print("Masukkan Harga Jual\t : ");
        double setHargaJual = input.nextDouble();
        System.out.print("\n________________________________________");
        
        System.out.print("\n(Pake Inputan)");
        System.out.print("\n");
        System.out.print("\nDATA BUKU");
        System.out.print("\nNama Pengarang\t : " +setNamaPengarang);
        System.out.print("\nJudul Buku\t : " +setJudulBuku);
        System.out.print("\nTahun Terbit\t : " +setTahunTerbit);
        System.out.print("\nCetakan Ke\t : " +setCetakanKe);
        System.out.print("\nHarga Jual\t : " +setHargaJual);
        System.out.print("\n________________________________________");
        
        Buku b1 = new Buku();
        System.out.print("\n(Tanpa Parameter)");
        System.out.print("\n");
        System.out.print("\nDATA BUKU");
        b1.infoBuku();
        System.out.print("\n________________________________________");
        
        Buku b2 = new Buku("Ika Natassa", "Twivortiare", 2012, 10, 70000);
        System.out.print("\n(Dengan Parameter)");
        System.out.print("\n");
        System.out.print("\nDATA BUKU");
        b2.infoBuku();
       System.out.print("\n");
        
    }
    
}
