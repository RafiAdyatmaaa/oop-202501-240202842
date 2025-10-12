# Laporan Praktikum Minggu 1 (sesuaikan minggu ke berapa?)
Topik: [Tuliskan judul topik, misalnya "Class dan Object"]

## Identitas
- Nama  : Muhammad Rafi Adyatma
- NIM   : 240202842
- Kelas : 3IKRA

---

## Tujuan
Mahasiswa diharapkan mampu memahami konsep dasar class dan object dalam pemrograman berorientasi objek (OOP), serta dapat menerapkan prinsip enkapsulasi melalui pembuatan class Produk yang memiliki atribut dan method sesuai kebutuhan.
Selain itu, mahasiswa juga mampu:
- Membuat class pendukung seperti CreditBy untuk menampilkan identitas mahasiswa.
- Melakukan instansiasi objek dari class Produk dan menampilkan informasi produk tersebut ke layar (console).
- Menerapkan method tambahan seperti tambahStok() dan kurangiStok() untuk mengatur jumlah stok produk dengan menggunakan logika kondisi yang tepat.

---

## Dasar Teori
- Pemrograman Berorientasi Objek (OOP)
Pemrograman Berorientasi Objek atau OOP (Object-Oriented Programming) merupakan paradigma pemrograman yang menitikberatkan pada konsep objek — yaitu representasi dari entitas dunia nyata yang memiliki atribut (data) dan perilaku (fungsi).
Tujuan utama OOP adalah menciptakan kode yang terstruktur, mudah dikembangkan, serta dapat digunakan kembali (reusable).
- Class dan Object
Class dapat diibaratkan sebagai cetak biru (blueprint) yang digunakan untuk membuat objek.
Di dalam sebuah class terdapat atribut (sebagai data) dan method (sebagai perilaku).
Sementara itu, object adalah hasil nyata (instansiasi) dari class tersebut.
Contohnya, class Produk bisa digunakan untuk membuat beberapa objek seperti p1, p2, dan p3 yang masing-masing memiliki nilai atribut yang berbeda.
- Enkapsulasi (Encapsulation)
Enkapsulasi adalah prinsip dalam OOP yang menggabungkan data dan fungsi ke dalam satu kesatuan, yaitu class.
Prinsip ini juga berfungsi untuk melindungi data dengan cara membatasi akses terhadap atribut melalui access modifier seperti private, protected, dan public.
Dengan begitu, data di dalam class tidak bisa diubah secara sembarangan dari luar class.
- Method Getter dan Setter
Untuk menjaga keamanan data yang bersifat private, digunakan method getter dan setter.
Getter berfungsi untuk mengambil (membaca) nilai atribut, sedangkan setter digunakan untuk mengubah (menulis) nilainya.
Dalam class Produk, method getter dan setter digunakan untuk mengelola atribut seperti kode, nama, harga, dan stok.
- Instansiasi dan Pemanggilan Method
Instansiasi adalah proses pembuatan objek dari sebuah class.
Setelah objek terbentuk, method yang ada di dalam class dapat dipanggil untuk menjalankan fungsinya.
Contohnya, pada class Produk, method seperti tambahStok() dan kurangiStok() digunakan untuk mengelola jumlah stok produk dengan logika tertentu.

---

## Langkah Praktikum
1. Buka File Explorer, lalu buat struktur folder seperti ini:

oop-202501-240202842
└── praktikum
    └── week2-class-object
        └── src
            └── com
                └── upb
                    └── agripos
                        └── model
                            └── Produk.java

2. Membuat class Produk
  - Class Produk dibuat di dalam package model.
  - Berisi atribut: kode, nama, harga, dan stok dengan access modifier private.
  - Menambahkan constructor, getter-setter, serta method tambahan:
  - tambahStok(int jumlah) untuk menambah stok.
  - kurangiStok(int jumlah) untuk mengurangi stok dengan validasi jika stok tidak mencukupi.

3. Membuat class CreditBy
  - Class ini diletakkan di package util.
  - Berisi method statis print(String nim, String nama) yang menampilkan identitas mahasiswa dengan format:
         ```
         credit by: <NIM> - <Nama>
         ```
 4. Membuat class MainProduk
  - Class utama untuk menjalankan program.
  - Melakukan instansiasi tiga produk pertanian:
         ```
         Produk p1 = new Produk("BNH-001", "Benih Padi IR64", 25000, 100);
         Produk p2 = new Produk("PPK-101", "Pupuk Urea 50kg", 350000, 40);
         Produk p3 = new Produk("ALT-501", "Cangkul Baja", 90000, 15);
         ```
      - Menampilkan informasi setiap produk menggunakan System.out.println().
      - Menguji method tambahStok() dan kurangiStok() untuk memperbarui stok produk.
      - Menambahkan logika agar muncul pesan ketika stok tidak mencukupi atau habis.
      - Menampilkan identitas mahasiswa menggunakan:
         ```
         CreditBy.print("240202841", "Pandu Dewanata");
         ```

5. Menjalankan program dan mengamati hasil output
  - Program dijalankan melalui MainProduk.java.
  - Hasilnya menampilkan daftar produk, perubahan stok, pesan stok habis/tidak cukup, dan identitas mahasiswa di bagian akhir console.

---

## Kode Program

```java
//Produk
package com.upb.agripos.model;

public class Produk {
    private String kode;
    private String nama;
    private double harga;
    private int stok;

    // Constructor
    public Produk(String kode, String nama, double harga, int stok) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    // Getter dan Setter
    public String getKode() { return kode; }
    public void setKode(String kode) { this.kode = kode; }

    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public double getHarga() { return harga; }
    public void setHarga(double harga) { this.harga = harga; }

    public int getStok() { return stok; }
    public void setStok(int stok) { this.stok = stok; }

    // Method tambahan untuk stok
    public void tambahStok(int jumlah) {
        this.stok += jumlah;
    }

    public void kurangiStok(int jumlah) {
        if (this.stok >= jumlah) {
            this.stok -= jumlah;
        } else {
            System.out.println("Stok tidak mencukupi!");
        }
    }
}

//CreditBy
package com.upb.agripos.util;

public class CreditBy {
    public static void print(String nim, String nama) {
        System.out.println("\ncredit by: " + nim + " - " + nama);
    }
}

//MainProduk
package com.upb.agripos;

import com.upb.agripos.model.Produk;
import com.upb.agripos.util.CreditBy;

public class MainProduk {
    public static void main(String[] args) {
        // Instansiasi 3 produk pertanian
        Produk p1 = new Produk("BNH-001", "Benih Padi IR64", 25000, 100);
        Produk p2 = new Produk("PPK-101", "Pupuk Urea 50kg", 350000, 40);
        Produk p3 = new Produk("ALT-501", "Cangkul Baja", 90000, 15);

        // Tampilkan informasi produk
        System.out.println("Kode: " + p1.getKode() + ", Nama: " + p1.getNama() + ", Harga: " + p1.getHarga() + ", Stok: " + p1.getStok());
        System.out.println("Kode: " + p2.getKode() + ", Nama: " + p2.getNama() + ", Harga: " + p2.getHarga() + ", Stok: " + p2.getStok());
        System.out.println("Kode: " + p3.getKode() + ", Nama: " + p3.getNama() + ", Harga: " + p3.getHarga() + ", Stok: " + p3.getStok());

        // Tambahkan sedikit simulasi stok
        System.out.println("\nMenambah stok Benih Padi IR64 sebanyak 20...");
        p1.tambahStok(20);
        System.out.println("Stok baru: " + p1.getStok());

        System.out.println("Mengurangi stok Pupuk Urea sebanyak 5...");
        p2.kurangiStok(1000);
        System.out.println("Stok baru: " + p2.getStok());

        System.out.println("Mengurangi stok Cangkul Baja:"+p3.getStok());
        p3.kurangiStok(12);
        System.out.println("Stok baru: " + p3.getStok());

        // Tampilkan identitas mahasiswa
        CreditBy.print("240202841", "Pandu Dewanata");
    }   
    
}
---
## Hasil Eksekusi
(Sertakan screenshot hasil eksekusi program.  
![Screenshot hasil](screenshots/hasil.png)
)
---

## Analisis
1. Penjelasan Jalannya Kode Program

Program dimulai dari method main() pada class MainProduk. Tiga objek dari class Produk dibuat untuk menyimpan data produk pertanian berupa kode, nama, harga, dan stok.
Data setiap produk ditampilkan melalui pemanggilan method getKode(), getNama(), getHarga(), dan getStok().
Method tambahStok() dan kurangiStok() digunakan untuk mengubah jumlah stok, dengan validasi ketika pengurangan melebihi stok tersedia akan menampilkan pesan “Stok tidak mencukupi”.
Program diakhiri dengan pemanggilan method print() dari class CreditBy untuk menampilkan identitas mahasiswa.
2. Perbedaan Pendekatan dengan Minggu Sebelumnya

Pendekatan sebelumnya bersifat prosedural dengan seluruh logika berada dalam satu file.
Pada minggu ini digunakan paradigma OOP, di mana program dibagi menjadi beberapa class sesuai fungsinya:
- Produk berfungsi sebagai blueprint data produk.
- CreditBy menampilkan identitas mahasiswa.
- MainProduk sebagai class utama yang menjalankan program.
Dengan pendekatan ini, kode menjadi lebih modular, terstruktur, dan mudah dikembangkan.
3. Kendala yang Dihadapi dan Cara Mengatasinya
Kendala 1: Struktur folder tidak sesuai dengan deklarasi package.
Solusi: Menyesuaikan struktur folder dengan package com/upb/agripos/model.
Kendala 2: Nilai stok tidak berubah setelah pemanggilan method.
Solusi: Menambahkan output setelah setiap pemanggilan method untuk menampilkan stok terkini.
Kendala 3: Kesalahan argumen saat memanggil method CreditBy.print().
Solusi: Mengecek kembali parameter method agar sesuai dengan tipe data dan urutan yang benar.

## Kesimpulan
Dari praktikum minggu ini, saya belajar dan paham bagaimana konsep dasar OOP diterapkan dalam program Java. Saya berhasil membuat class Produk dengan atribut dan method yang bisa digunakan untuk menambah dan mengurangi stok produk.
Selain itu, saya juga memisahkan program ke beberapa class, seperti CreditBy untuk menampilkan identitas mahasiswa dan MainProduk sebagai class utama yang menjalankan program. Dengan cara ini, kode jadi lebih rapi, mudah dibaca, dan gampang dikembangkan.
Saya juga belajar menggunakan logika if-else untuk menangani kondisi stok produk, misalnya ketika stok tidak cukup. Secara keseluruhan, praktikum ini membantu saya memahami bahwa pemrograman berorientasi objek lebih terstruktur dan efisien dibanding cara prosedural.
---

## Quiz
1. Mengapa atribut sebaiknya dideklarasikan sebagai private dalam class?
Melindungi data (data hiding)
Dengan menjadikan atribut private, data tidak bisa diakses atau diubah langsung dari luar class. Hal ini mencegah perubahan nilai atribut secara sembarangan yang bisa menyebabkan error atau inkonsistensi data.
2. Apa fungsi getter dan setter dalam enkapsulasi?
Getter dan setter adalah jembatan antara dunia luar dan data di dalam class.
Mereka menjaga agar data tetap terlindungi (data hiding) tetapi tetap bisa diakses dan diubah dengan cara yang terkontrol dan aman.
3. Bagaimana cara class Produk mendukung pengembangan aplikasi POS yang lebih kompleks?
Class Produk mendukung pengembangan aplikasi POS (Point of Sale) yang lebih kompleks karena berfungsi sebagai pondasi data utama yang merepresentasikan setiap barang yang dijual. Dengan adanya class ini, setiap produk memiliki atribut seperti kode, nama, harga, dan stok yang terenkapsulasi dengan baik, sehingga mudah dikelola dan diamankan.
Selain itu, method seperti tambahStok() dan kurangiStok() memungkinkan sistem untuk secara otomatis memperbarui jumlah stok saat terjadi transaksi penjualan atau pembelian. Hal ini membuat class Produk mudah diintegrasikan dengan fitur lain seperti laporan penjualan, manajemen inventori, atau sistem pembayaran.
Dengan struktur yang terorganisir dan berorientasi objek, Produk dapat dikembangkan lebih lanjut—misalnya dengan menambahkan kategori, diskon, atau supplier—tanpa harus mengubah keseluruhan sistem. Jadi, class ini membantu membuat aplikasi POS menjadi modular, fleksibel, dan mudah dikembangkan di masa depan.
