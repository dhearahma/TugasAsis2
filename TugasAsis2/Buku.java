/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasAsis2;

/**
 *
 * @author Dhea
 */
public class Buku {
    private String namaPengarang;
    private String judulBuku;
    private int tahunTerbit;
    private int cetakanKe;
    private double hargaJual;
    
    public Buku() {
        this.namaPengarang = "Tere Liye";
        this.judulBuku = "Tentang Kamu";
        this.tahunTerbit = 2016;
        this.cetakanKe = 13;
        this.hargaJual = 79000;
    }   
    
    public Buku(String n, String j, int t, int c, double h) {
        this.namaPengarang = n;
        this.judulBuku = j;
        this.tahunTerbit = t;
        this.cetakanKe = c;
        this.hargaJual = h;
    }
    
    public void setNamaPengarang(String n) {
        this.namaPengarang = n;
    }    

    public String getNamaPengarang() {
        return namaPengarang;
    }
    
    public void setJudulBuku(String j) {
        this.judulBuku = j;
    }    

    public String getJudulBuku() {
        return judulBuku;
    }
    
    public void setTahunTerbit(int t) {
        this.tahunTerbit = t;
    }    

    public int getTahunTerbit() {
        return tahunTerbit;
    }
    
    public void setCetakanKe(int c) {
        this.cetakanKe = c;
    }    

    public int getCetakanKe() {
        return cetakanKe;
    }
    
    public void setHargaJual(double h) {
        this.hargaJual = h;
    }    

    public double getHargaJual() {
        return hargaJual;
    }
    
    public void infoBuku() {
        System.out.print("\nNama Pengarang \t: " +getNamaPengarang());
        System.out.print("\nJudul Buku \t: " +getJudulBuku());
        System.out.print("\nTahun Terbit \t: " +getTahunTerbit());
        System.out.print("\nCetakan Ke \t: " +getCetakanKe());
        System.out.print("\nHarga Jual \t: " +getHargaJual());
    }
    
}
