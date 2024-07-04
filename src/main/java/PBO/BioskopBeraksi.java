package PBO;

import java.util.Scanner;

public class BioskopBeraksi {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            // IO Sederhana
            System.out.print("Masukkan jumlah tiket bioskop yang akan dimasukkan: ");
            int jumlahTiket = scanner.nextInt();
            scanner.nextLine();  // Mengonsumsi karakter newline

            // Array
            Bioskop[] tiketBioskop = new Bioskop[jumlahTiket];

            // Perulangan
            for (int i = 0; i < jumlahTiket; i++) {
                System.out.println("\nMasukkan data untuk tiket bioskop ke-" + (i + 1));

                System.out.print("Masukkan Kode Tiket : ");
                String kodeTiket = scanner.nextLine();

                // Validasi panjang kode tiket
                if (kodeTiket.length() != 7) {
                    throw new IllegalArgumentException("Kode Tiket harus terdiri dari 7 karakter.");
                }

                String nomorKursi = kodeTiket.substring(0, 3);
                
                String nomorStudioStr = kodeTiket.substring(3, 5);
                
                int nomorStudio = Integer.parseInt(nomorStudioStr);

                // Polimorfisme untuk menggunakan BioskopDetail
                tiketBioskop[i] = new BioskopDetail(kodeTiket, nomorKursi, nomorStudio);
            }

            // IO Sederhana
            System.out.println("\nData Tiket Bioskop: ");
            for (int i = 0; i < tiketBioskop.length; i++) {
                System.out.println(tiketBioskop[i].infoTiket());
                if (i < tiketBioskop.length - 1) {
                    System.out.println("------------------------");
                }
            }

        } catch (NumberFormatException e) {
            // Error Handling
            System.out.println("Kesalahan format nomor: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            // Error Handling
            System.out.println("Kesalahan: " + e.getMessage());
        } catch (Exception e) {
            // Error Handling
            System.out.println("Kesalahan umum: " + e.getMessage());
        }
    }
}
