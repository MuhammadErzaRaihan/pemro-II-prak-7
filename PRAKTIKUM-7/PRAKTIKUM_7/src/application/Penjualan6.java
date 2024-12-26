package application;

import java.util.Date;

public class Penjualan6 {
    private int penjualanId;
    private int jumlah;
    private long totalHarga; // Total harga dalam satuan terkecil (misalnya sen)
    private Date tanggal;
    private Pelanggan6 pelanggan; // Relasi ke Pelanggan6
    private Buku6 buku; // Relasi ke Buku6

    // Constructor
    public Penjualan6(int penjualanId, int jumlah, long totalHarga, Date tanggal, Pelanggan6 pelanggan, Buku6 buku) {
        this.penjualanId = penjualanId;
        this.jumlah = jumlah;
        this.totalHarga = totalHarga;
        this.tanggal = tanggal;
        this.pelanggan = pelanggan;
        this.buku = buku;
    }

    // Getter and Setter
    public int getPenjualanId() {
        return penjualanId;
    }

    public void setPenjualanId(int penjualanId) {
        this.penjualanId = penjualanId;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public long getTotalHarga() {
        return totalHarga;
    }

    public void setTotalHarga(long totalHarga) {
        this.totalHarga = totalHarga;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public Pelanggan6 getPelanggan() {
        return pelanggan;
    }

    public void setPelanggan(Pelanggan6 pelanggan) {
        this.pelanggan = pelanggan;
    }

    public Buku6 getBuku() {
        return buku;
    }

    public void setBuku(Buku6 buku) {
        this.buku = buku;
    }
}
