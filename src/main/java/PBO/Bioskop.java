package PBO;

public class Bioskop {
    // Atribut untuk menyimpan data tiket bioskop
    private String kodeTiket;
    private String nomorKursi;
    private int nomorStudio;

    // Konstruktor untuk menginisialisasi objek Bioskop
    public Bioskop(String kodeTiket, String nomorKursi, int nomorStudio) {
        this.kodeTiket = kodeTiket;
        this.nomorKursi = nomorKursi;
        this.nomorStudio = nomorStudio;
    }

    // Getter dan setter lainnya sesuai kebutuhan
    public String getKodeTiket() {
        return kodeTiket;
    }

    public void setKodeTiket(String kodeTiket) {
        this.kodeTiket = kodeTiket;
    }

    public String getNomorKursi() {
        return nomorKursi;
    }

    public void setNomorKursi(String nomorKursi) {
        this.nomorKursi = nomorKursi;
    }

    public int getNomorStudio() {
        return nomorStudio;
    }

    public void setNomorStudio(int nomorStudio) {
        this.nomorStudio = nomorStudio;
    }

    // Metode untuk mendapatkan informasi tiket bioskop
    public String infoTiket() {
        return "Kode Tiket: " + getKodeTiket()
                + "\nNomor Kursi: " + getNomorKursi()
                + "\nNomor Studio: " + getNomorStudio();
    }
}
