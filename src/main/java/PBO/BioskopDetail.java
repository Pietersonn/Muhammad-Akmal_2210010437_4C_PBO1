package PBO;

public class BioskopDetail extends Bioskop {
    private String judulFilm;
    private int barisKursi;  // Mengubah tipe data barisKursi menjadi int untuk nomor baris

    // Constructor
    public BioskopDetail(String kodeTiket, String nomorKursi, int nomorStudio) {
        super(kodeTiket, nomorKursi, nomorStudio);
        this.judulFilm = judulFilm(kodeTiket);
        this.barisKursi = calculateRow(nomorKursi.charAt(0)); // Menghitung nomor baris dari karakter pertama nomorKursi
    }

    // Method untuk mengekstrak judul film dari kodeTiket
    private String judulFilm(String kodeTiket) {
        String kodeFilmStr = kodeTiket.substring(5, 7);
        switch (kodeFilmStr) {
            case "01":
                return "Pengabdi Setan";
            case "02":
                return "Pemandi Jenazah";
            case "03":
                return "Siska Kubur";
            case "04":
                return "The Conjuring";
            case "05":
                return "The Exorcist";
            case "06":
                return "Annabelle";
            case "07":
                return "Insidious";
            case "08":
                return "A Quiet Place";
            case "09":
                return "Get Out";
            case "10":
                return "Hereditary";
            default:
                throw new IllegalArgumentException("Kode Judul Film tidak valid.");
        }
    }

    // Method untuk menghitung nomor baris dari karakter baris kursi (A-N)
    private int calculateRow(char barisKursiChar) {
        // Mengubah karakter baris kursi menjadi nomor baris
        int nomorBaris = barisKursiChar - 'A' + 1;
        if (nomorBaris < 1 || nomorBaris > 14) {
            throw new IllegalArgumentException("Baris Kursi tidak valid.");
        }
        return nomorBaris;
    }

    // Getter untuk judulFilm
    public String getJudulFilm() {
        return judulFilm;
    }

    // Getter untuk barisKursi
    public int getBarisKursi() {
        return barisKursi;
    }

    // Override untuk mendapatkan informasi tiket dengan tambahan kategori kelas dan baris kursi
    @Override
    public String infoTiket() {
        String kategori;
        if (getNomorStudio() >= 1 && getNomorStudio() <= 5) {
            kategori = "Standar";
        } else if (getNomorStudio() >= 6 && getNomorStudio() <= 10) {
            kategori = "Premier";
        } else {
            throw new IllegalArgumentException("Nomor Studio tidak valid.");
        }

        return super.infoTiket() +
                "\nBaris Kursi Ke: " + barisKursi+
               "\nJudul Film: " + judulFilm +
               "\nKategori Kelas: " + kategori;
    }
}
