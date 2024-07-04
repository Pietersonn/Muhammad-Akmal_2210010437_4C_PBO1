package PBO;

public class Bioskop {
    private String nama;
    private String kodeTiket;

    // Konstruktor
    public Bioskop(String nama, String kodeTiket) {
        this.nama = nama;
        this.kodeTiket = kodeTiket;
    }

    // Getter dan Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKodeTiket() {
        return kodeTiket;
    }

    public void setKodeTiket(String kodeTiket) {
        this.kodeTiket = kodeTiket;
    }

    // Metode untuk mendapatkan informasi tiket bioskop
    public String infoTiket(String nomorKursi, int nomorStudio) {
        return "Nama: " + getNama() +
               "\nKode Tiket: " + getKodeTiket() +
               "\nNomor Kursi: " + nomorKursi +
               "\nNomor Studio: " + nomorStudio;
    }
}
