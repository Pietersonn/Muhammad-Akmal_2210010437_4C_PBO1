# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data tiket bioskop menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama, kode tiket, dan memberikan output berupa informasi detail dari tiket tersebut seperti judul film, nomor kursi, nomor studio, baris kursi, dan kategori kelas.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Bioskop`, `BioskopDetail`, dan `BioskopBeraksi` adalah contoh dari class.

```bash
public class Bioskop {
    ...
}

public class BioskopDetail extends Bioskop {
    ...
}

public class BioskopBeraksi {
    ...
}

```

2. **Object** adalah instance dari class. Pada kode ini, `tiketBioskop[i] = new BioskopDetail(nama, kodeTiket, nomorKursi, nomorStudio);` adalah contoh pembuatan object.

```bash
tiketBioskop[i] = new BioskopDetail(nama, kodeTiket, nomorKursi, nomorStudio);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama` dan `kodeTiket` adalah contoh atribut.

```bash
String nama;
String kodeTiket;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Bioskop` dan `BioskopDetail`.

```bash
public Bioskop(String nama, String kodeTiket) {
    this.nama = nama;
    this.kodeTiket = kodeTiket;
}

public BioskopDetail(String nama, String kodeTiket, String nomorKursi, int nomorStudio) {
    super(nama, kodeTiket);
    ...
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama` dan `setKodeTiket` adalah contoh method mutator.

```bash
public void setNama(String nama) {
    this.nama = nama;
}

public void setKodeTiket(String kodeTiket) {
    this.kodeTiket = kodeTiket;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, `getKodeTiket`, `getJudulFilm`, dan `getBarisKursi` adalah contoh method accessor.

```bash
public String getNama() {
    return nama;
}

public String getKodeTiket() {
    return kodeTiket;
}

public String getJudulFilm() {
    return judulFilm;
}

public int getBarisKursi() {
    return barisKursi;
}

```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama` dan `kodeTiket` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String nama;
private String kodeTiket;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `BioskopDetail` mewarisi `Bioskop` dengan sintaks `extends`.

```bash
public class BioskopDetail extends Bioskop {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi. Pada kode ini, method `infoTiket` di `BioskopDetail` merupakan override dari method `infoTiket` di `Bioskop`.

```bash
@Override
public String infoTiket(String nomorKursi, int nomorStudio) {
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `infoTiket` dan seleksi `switch` dalam method `judulFfilm`.

```bash
private String judulFilm(String kodeTiket) {
    String kodeFilmStr = kodeTiket.substring(5, 7);
    switch (kodeFilmStr) {
        case "01":
            return "Pengabdi Setan";
        ...
        default:
            throw new IllegalArgumentException("Kode Judul Film tidak valid.");
    }
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
    ...
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i = 0; i < jumlahTiket; i++) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
System.out.print("Masukkan jumlah tiket bioskop yang akan dimasukkan: ");
int jumlahTiket = scanner.nextInt();
scanner.nextLine();  // Mengonsumsi karakter newline
...
System.out.println(tiketBioskop[i].infoTiket(nomorKursi, nomorStudio));

```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `tiketBioskop[i] = new BioskopDetail(nama, kodeTiket, nomorKursi, nomorStudio);` adalah contoh penggunaan array.

```bash
tiketBioskop[i] = new BioskopDetail(nama, kodeTiket, nomorKursi, nomorStudio);
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    ...
} catch (NumberFormatException e) {
    System.out.println("Kesalahan format nomor: " + e.getMessage());
} catch (IllegalArgumentException e) {
    System.out.println("Kesalahan: " + e.getMessage());
} catch (Exception e) {
    System.out.println("Kesalahan umum: " + e.getMessage());
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Muhammad Akmal
NPM: 2110010437
