package Posttest6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KostPutri extends KOS {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    int diskonRamadhan;

    public KostPutri(String NamaKos, String Alamat, String Pemilik, int Harga) {
        super(NamaKos, Alamat, Pemilik, Harga);
        this.KamarKosong = "Silahkan Konfirmasi Pada Pemilik";
    }

    @Override
    public void EditData(BufferedReader input) throws IOException {
         System.out.print("Masukkan Nama Kos             : ");
        this.NamaKos = input.readLine();

        System.out.print("Masukkan Alamat Kos           : ");
        this.Alamat = input.readLine();

        System.out.print("Masukkan Nama Pemilik Kos     : ");
        this.Pemilik = input.readLine();
        
        System.out.print("Harga Sewa Per Bulan          : ");
        this.Harga= Integer.parseInt(input.readLine());
        input.readLine();
        System.out.println("\n\n\n");
    }
    
    public void tampilData(){
        System.out.println("=============================== ");
        System.out.print("Nama Kos                      : ");
        System.out.println(this.NamaKos);
        System.out.print("Alamat Kos                    : ");
        System.out.println(this.Alamat);
        System.out.print("Nama Pemilik Kos              : ");
        System.out.println(this.Pemilik);
        System.out.print("Harga Sewa Per Bulan          : ");
        System.out.println(this.Harga);
        System.out.print("Jumlah Kasur dalam 1 kamar    : ");
        System.out.println(this.jumlahKasur);
        System.out.println("=============================== \n");
    }
    
    public void edit(BufferedReader input) {}

    public void PeraturanKost() throws IOException {
        KostPutra kostputra = new KostPutra(NamaKos,Alamat,Pemilik,KamarKosong,Harga);
        System.out.println("\n=================");
        System.out.println("Jenis Kost Anda :");
        System.out.println("=================");
        System.out.println("| 1. Kost Putra |");
        System.out.println("| 2. Kost Putri |");
        System.out.println("==================");
        int pilih;
        System.out.print("\nMenu yang anda Inginkan : ");
        pilih = Integer.parseInt(input.readLine());
        
        if (pilih == 1){
            kostputra.kostPutra();
        }
            
        else if (pilih == 2){
            kostputra.kostPutri();
        }
    }

}
