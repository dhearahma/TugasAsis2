/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasAsis3;

/**
 *
 * @author Dhea
 */
public class Pelajar {
    private int nip;
    private String nama;
    private double nilaiUjian1;
    private double nilaiUjian2;
    private double nilaiTugas;
    
    public Pelajar() {
        this.nip = 107;
        this.nama = "Laras";
        this.nilaiUjian1 = 91;
        this.nilaiUjian2 = 87;
        this.nilaiTugas = 89;
    }

    public Pelajar(int nip, String nama, double n1, double n2, double nT) {
        this.nip = nip;
        this.nama = nama;
        this.nilaiUjian1 = n1;
        this.nilaiUjian2 = n2;
        this.nilaiTugas = nT;
    }

    public void setNip(int nip) {
        this.nip = nip;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNilaiUjian1(double n1) {
        this.nilaiUjian1 = n1;
    }

    public void setNilaiUjian2(double n2) {
        this.nilaiUjian2 = n2;
    }

    public void setNilaiTugas(double nT) {
        this.nilaiTugas = nT;
    }

    public int getNip() {
        return nip;
    }

    public String getNama() {
        return nama;
    }

    public double getNilaiUjian1() {
        return nilaiUjian1;
    }

    public double getNilaiUjian2() {
        return nilaiUjian2;
    }

    public double getNilaiTugas() {
        return nilaiTugas;
    }
    
    public double nilaiAkhir() {
        double nA = (0.4 * getNilaiUjian1()) + (0.4 * getNilaiUjian2()) + (0.2 * getNilaiTugas());
        return nA;
    }
    
    public String lulusGak() {
        String Status;
        if(nilaiAkhir() >= 60) {
            Status = "ANDA LULUS";
        }
        else {
            Status = "ANDA TIDAK LULUS";
        }
        return Status;
    }
    
    public void infoPelajar() {
        System.out.print("\nDATA PELAJAR");
        System.out.print("\nNIP \t\t: " +getNip());
        System.out.print("\nNama \t\t: " +getNama());
        System.out.print("\nNilai Ujian 1 \t: " +getNilaiUjian1());
        System.out.print("\nNilai Ujian 2 \t: " +getNilaiUjian2());
        System.out.print("\nNilai Tugas \t: " +getNilaiTugas());
        System.out.print("\nNilai Akhir \t: " +nilaiAkhir());
        System.out.print("\nStatus \t\t: " +lulusGak());
    }
    
}
