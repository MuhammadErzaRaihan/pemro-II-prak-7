package application;

public class Buku6 {
    private int bukuId;
    private String judul;
    private String penulis;
    private long harga; // Harga dalam satuan terkecil (misalnya sen)
    private int stok;

    // Constructor
    public Buku6(int bukuId, String judul, String penulis, long harga, int stok) {
        this.bukuId = bukuId;
        this.judul = judul;
        this.penulis = penulis;
        this.harga = harga;
        this.stok = stok;
    }

    // Getter and Setter
    public int getBukuId() {
        return bukuId;
    }

    public void setBukuId(int bukuId) {
        this.bukuId = bukuId;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public long getHarga() {
        return harga;
    }

    public void setHarga(long harga) {
        this.harga = harga;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
}
