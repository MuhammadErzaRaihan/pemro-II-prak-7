package application;

public class Pelanggan6 {
    private int pelangganId;
    private String nama;
    private String email;
    private String telepon;

    // Constructor
    public Pelanggan6(int pelangganId, String nama, String email, String telepon) {
        this.pelangganId = pelangganId;
        this.nama = nama;
        this.email = email;
        this.telepon = telepon;
    }

    // Getter and Setter
    public int getPelangganId() {
        return pelangganId;
    }

    public void setPelangganId(int pelangganId) {
        this.pelangganId = pelangganId;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }
}
