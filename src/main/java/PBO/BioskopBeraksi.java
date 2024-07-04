package PBO;

import java.util.Scanner;

public class BioskopBeraksi {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Masukkan jumlah tiket bioskop yang akan dimasukkan: ");
            int jumlahTiket = scanner.nextInt();
            scanner.nextLine();  // Mengonsumsi karakter newline

            Bioskop[] tiketBioskop = new Bioskop[jumlahTiket];

            for (int i = 0; i < jumlahTiket; i++) {
                System.out.println("\nMasukkan data untuk tiket bioskop ke-" + (i + 1));

                System.out.print("Masukkan Nama: ");
                String nama = scanner.nextLine();

                System.out.print("Masukkan Kode Tiket: ");
                String kodeTiket = scanner.nextLine();

                if (kodeTiket.length() != 7) {
                    throw new IllegalArgumentException("Kode Tiket harus terdiri dari 7 karakter.");
                }

                String nomorKursi = kodeTiket.substring(0, 3);
                String nomorStudioStr = kodeTiket.substring(3, 5);
                int nomorStudio = Integer.parseInt(nomorStudioStr);

                tiketBioskop[i] = new BioskopDetail(nama, kodeTiket, nomorKursi, nomorStudio);

                System.out.println("----------------------------------------");
                System.out.println(tiketBioskop[i].infoTiket(nomorKursi, nomorStudio));
                System.out.println("----------------------------------------");
            }

        } catch (NumberFormatException e) {
            System.out.println("Kesalahan format nomor: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Kesalahan: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Kesalahan umum: " + e.getMessage());
        }
    }
}
