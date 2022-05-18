package Posttest6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KostPutra extends KOS implements PeraturanKost {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    public KostPutra(String NamaKos, String Alamat, String Pemilik, String KamarKosong, int Harga) {
        super(NamaKos, Alamat, Pemilik, Harga);
        this.KamarKosong = KamarKosong;
    }


    public String getKamarKosong() {
        return KamarKosong;
    }

    public void setKamarKosong(String KamarKosong) {
        this.KamarKosong = KamarKosong;
    }

    /**
     *
     * @param input
     */
    @Override
    public void EditData(BufferedReader input) throws IOException {
        System.out.print("Masukkan Nama Kos             : ");
        this.NamaKos = input.readLine();

        System.out.print("Masukkan Alamat Kos           : ");
        this.Alamat = input.readLine();

        System.out.print("Masukkan Nama Pemilik Kos     : ");
        this.Pemilik = input.readLine();

        System.out.print("Masukkan Jumlah Kamar Kosong  : ");
        this.KamarKosong = input.readLine();

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
        System.out.println("=============================== ");
    }

    public void edit(BufferedReader input){}

    @Override
    public void kostPutra() {
        System.out.println("1. Wajib Mematuhi Jam Malam.\n" +
            "2. Menerima Tamu di Ruang Tamu.\n" +
            "3. Tidak Menerima Tamu Lawan Jenis.\n" +
            "4. Membawa Alat Elektronik dengan Izin.\n" +
            "5. Tidak Membawa Hewan Peliharaan.\n" +
            "6. Memarkir Kendaraan dengan Rapi.\n" +
            "7. Membayar Tagihan Kost Tepat Waktu.\n" +
            "8. Izin Ketika Mengajak Teman Menginap.");
    }

    @Override
    public void kostPutri() {
        System.out.println("1. Wajib Mematuhi Jam Malam.\n" +
            "2. Menerima Tamu di Ruang Tamu.\n" +
            "3. Tidak Menerima Tamu Lawan Jenis.\n" +
            "4. Membawa Alat Elektronik dengan Izin.\n" +
            "5. Tidak Membawa Hewan Peliharaan.\n" +
            "6. Memarkir Kendaraan dengan Rapi.\n" +
            "7. Membayar Tagihan Kost Tepat Waktu.\n" +
            "8. Izin Ketika Mengajak Teman Menginap.");
    }

   
}