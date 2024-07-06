package PBO;

//inheritance
public class BioskopDetail extends Bioskop {
    private String judulFilm;
    private int barisKursi;

    
    public BioskopDetail(String nama, String kodeTiket, String nomorKursi, int nomorStudio) {
        super(nama, kodeTiket);
        this.judulFilm = judulFilm(kodeTiket);
        this.barisKursi = calculateRow(nomorKursi.charAt(0));
    }
    //seleksi
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
    

    private int calculateRow(char barisKursiChar) {
        int nomorBaris = barisKursiChar - 'A' + 1;
        if (nomorBaris < 1 || nomorBaris > 14) {
            throw new IllegalArgumentException("Baris Kursi tidak valid.");
        }
        return nomorBaris;
    }

  
    @Override
    public String infoTiket(String nomorKursi, int nomorStudio) {
        String kategori;
        if (nomorStudio >= 1 && nomorStudio <= 5) {
            kategori = "Standar";
        } else if (nomorStudio >= 6 && nomorStudio <= 10) {
            kategori = "Premier";
        } else {
            throw new IllegalArgumentException("Nomor Studio tidak valid.");
        }

        return super.infoTiket(nomorKursi, nomorStudio) +
               "\nBaris Kursi Ke: " + barisKursi +
               "\nJudul Film: " + judulFilm +
               "\nKategori Kelas: " + kategori;
    }
}
