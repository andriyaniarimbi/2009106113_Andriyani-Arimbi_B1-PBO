package Posttest6;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public abstract class KOS {
    protected String NamaKos;
    protected String Alamat;
    protected String Pemilik;
    protected String KamarKosong;
    protected int Harga;
    protected int jumlahKasur = 1;
    
    public KOS(String NamaKos, String Alamat, String Pemilik, int Harga)
    {
        this.NamaKos = NamaKos;
        this.Alamat = Alamat;
        this.Pemilik = Pemilik;
        this.Harga = Harga;
    }

    public String getNamaKos() {
        return NamaKos;
    }

    public void setNamaKos(String NamaKos) {
        this.NamaKos = NamaKos;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

    public String getPemilik() {
        return Pemilik;
    }

    public void setPemilik(String Pemilik) {
        this.Pemilik = Pemilik;
    }
    
    public int getHarga() {
        return Harga;
    }

    public void setHarga(int Harga) {
        this.Harga = Harga;
    }

    public int getJumlahKasur() {
        return jumlahKasur;
    }

    public void setJumlahKasur(int jumlahKasur) {
        this.jumlahKasur = jumlahKasur;
    }
    
    public void TambahData(){
         System.out.println("Selamat, Data Berhasil ditambahkan !\n");
     }
    
    void EditData(){
         System.out.println("Data Berhasil diubah !\n");
     }
    
    void HapusData(){
         System.out.println("Data Terhapus !\n");
    }
    
    public abstract void EditData(BufferedReader input) throws IOException;
}
