package PBO;

public class Bioskop {
    //atribut dan encapsulation
    private String nama;
    private String kodeTiket;

    // Konstruktor
    public Bioskop(String nama, String kodeTiket) {
        this.nama = nama;
        this.kodeTiket = kodeTiket;
    }

    // setter (mutator)
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setKodeTiket(String kodeTiket) {
        this.kodeTiket = kodeTiket;
    }

    // Getter (Accesor)
    public String getNama() {
        return nama;
    }

    public String getKodeTiket() {
        return kodeTiket;
    }



    // Metode untuk mendapatkan informasi tiket bioskop
    public String infoTiket(String nomorKursi, int nomorStudio) {
        return "Nama: " + getNama()
                + "\nKode Tiket: " + getKodeTiket()
                + "\nNomor Kursi: " + nomorKursi
                + "\nNomor Studio: " + nomorStudio;
    }
}
