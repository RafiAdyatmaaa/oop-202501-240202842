# Laporan Praktikum Minggu 1 (sesuaikan minggu ke berapa?)
Topik: Penerapan Konsep Inheritance dalam Sistem Kate+gori Produk Pertanian

## Identitas
- Nama  : Muhammad Rafi Adyatma
- NIM   : 240202842
- Kelas : 3IKRA

---

## Tujuan
- Memahami konsep inheritance (pewarisan class) dalam pemrograman berorientasi objek (OOP).
- Menerapkan pembuatan superclass dan subclass untuk kategori produk pertanian.
- Menunjukkan hierarki class melalui implementasi kode yang saling berhubungan.
- Menggunakan keyword super untuk memanggil konstruktor dan method dari parent class.
- Menjelaskan perbedaan penggunaan inheritance dibandingkan dengan penggunaan class tunggal.

---

## Dasar Teori
- Inheritance adalah konsep dalam OOP yang memungkinkan suatu class mewarisi atribut dan method dari class lain, sehingga kode dapat digunakan kembali (reusability).
- Superclass (class induk) berisi atribut dan perilaku umum yang dapat diwariskan ke class lain.
- Subclass (class turunan) mewarisi semua atribut dan method dari superclass, serta dapat menambahkan atribut atau perilaku khusus.
- Keyword super digunakan untuk memanggil konstruktor atau method dari superclass di dalam subclass.
- Penerapan inheritance membuat program lebih terstruktur, efisien, dan mudah dikembangkan karena menghindari duplikasi kode.


---

## Langkah Praktikum
  1. Membuat struktur package proyek
      - Buat folder utama dengan struktur:
        com.upb.agripos.model
        com.upb.agripos.util
      - Folder model digunakan untuk menyimpan class produk dan turunannya, sedangkan util untuk class tambahan seperti CreditBy.

   2. Membuat class induk Produk
      - Class ini berisi atribut umum seperti kode, nama, harga, dan stok.
      - Tambahkan konstruktor, getter dan setter, serta method umum (misalnya tampilkanInfo()).

   3. Membuat class turunan
      - Buat tiga class turunan dari Produk, yaitu:
         - Benih (dengan atribut tambahan varietas)
         - Pupuk (dengan atribut tambahan jenis)
         - AlatPertanian (dengan atribut tambahan material)
      - Masing-masing class menggunakan keyword extends Produk.
      - Override method tampilkanInfo() untuk menampilkan data lengkap tiap produk.
   
   4. Membuat class CreditBy
      - Class ini berfungsi untuk menampilkan identitas pembuat program seperti NIM dan nama.

   5. Membuat class utama MainInheritance
      - Buat object dari masing-masing class (Benih, Pupuk, AlatPertanian).
      - Panggil method tampilkanInfo() untuk menampilkan data produk.
      - Panggil CreditBy.print() untuk menampilkan identitas pembuat.

   6. Menjalankan program
      - Jalankan file MainInheritance.java.
      - Hasilnya akan menampilkan data setiap produk pertanian beserta identitas pembuat program di terminal.


---

## Kode Program
```java
//Alat Pertanian
package com.upb.agripos.model;

public class AlatPertanian extends Produk {
    private String material;

    public AlatPertanian(String kode, String nama, double harga, int stok, String material) {
        super(kode, nama, harga, stok);
        this.material = material;
    }

    public String getMaterial() { return material; }
    public void setMaterial(String material) { this.material = material; }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Material: " + material);
    }
}
```
```java
//Benih
package com.upb.agripos.model;

public class Benih extends Produk {
    private String varietas;

    public Benih(String kode, String nama, double harga, int stok, String varietas) {
        super(kode, nama, harga, stok);
        this.varietas = varietas;
    }

    public String getVarietas() { return varietas; }
    public void setVarietas(String varietas) { this.varietas = varietas; }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Varietas: " + varietas);
    }
}
```
```java
//Produk
package com.upb.agripos.model;

public class Produk {
    private String kode;
    private String nama;
    private double harga;
    private int stok;

    public Produk(String kode, String nama, double harga, int stok) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public String getKode() { return kode; }
    public void setKode(String kode) { this.kode = kode; }

    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public double getHarga() { return harga; }
    public void setHarga(double harga) { this.harga = harga; }

    public int getStok() { return stok; }
    public void setStok(int stok) { this.stok = stok; }

    public void tampilkanInfo() {
        System.out.println("Kode: " + kode);
        System.out.println("Nama: " + nama);
        System.out.println("Harga: Rp" + harga);
        System.out.println("Stok: " + stok);
    }
}
```
```java
//Pupuk
package com.upb.agripos.model;

public class Pupuk extends Produk {
    private String jenis;

    public Pupuk(String kode, String nama, double harga, int stok, String jenis) {
        super(kode, nama, harga, stok);
        this.jenis = jenis;
    }

    public String getJenis() { return jenis; }
    public void setJenis(String jenis) { this.jenis = jenis; }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jenis Pupuk: " + jenis);
    }
}
```
```java
//Mainlnheritance
package com.upb.agripos;

import com.upb.agripos.model.*;
import com.upb.agripos.util.CreditBy;

public class MainInheritance {
    public static void main(String[] args) {
        Benih benih = new Benih("BNH-001", "Benih Padi IR64", 25000, 100, "IR64");
        Pupuk pupuk = new Pupuk("PPK-101", "Pupuk Urea", 350000, 40, "Urea");
        AlatPertanian alat = new AlatPertanian("ALT-501", "Cangkul Baja", 90000, 15, "Baja");

        System.out.println("=== Data Produk Pertanian ===");
        System.out.println("\n-- Benih --");
        benih.tampilkanInfo();

        System.out.println("\n-- Pupuk --");
        pupuk.tampilkanInfo();

        System.out.println("\n-- Alat Pertanian --");
        alat.tampilkanInfo();

        CreditBy.print("240202841", "Pandu Dewanata Yaseh Hidayat");
    }
}
```
---

## Hasil Eksekusi
<img width="1920" height="1080" alt="Alatpertanianjv" src="https://github.com/user-attachments/assets/1dc8e4ad-d7d1-4cd3-b1d5-5d4baaf0c946" />
<img width="1920" height="1080" alt="Produkjv" src="https://github.com/user-attachments/assets/98e62d79-209e-4c70-ae04-c8da2eff9e5f" />
<img width="1920" height="1080" alt="Benihjv" src="https://github.com/user-attachments/assets/19fc8779-09ac-4d10-94dc-6871f7b9b25a" />
<img width="1920" height="1080" alt="Pupukjva" src="https://github.com/user-attachments/assets/7219dbee-c72b-45c4-94aa-9fa838f6fcf8" />
<img width="1920" height="1080" alt="Creditby," src="https://github.com/user-attachments/assets/4f4628e3-dc3c-461b-9402-89c57fac0d20" />
<img width="1920" height="1080" alt="MainInherintancee" src="https://github.com/user-attachments/assets/c9e47505-5356-4830-88fd-bf4945aae370" />


## Analisis
(
1. Kode berjalan dengan benar menampilkan semua produk dari subclass masing-masing.
2. Pendekatan inheritance membuat kode lebih terstruktur dibanding minggu sebelumnya yang hanya menggunakan class tunggal Produk.
3. Kendala awal muncul saat memanggil constructor AlatPertanian karena jumlah parameter tidak sesuai, diperbaiki dengan memisahkan material dan keterangan menggunakan koma.   
)
---

## Kesimpulan
Kesimpulan dari praktikum minggu ini adalah bahwa konsep inheritance (pewarisan) dalam pemrograman berorientasi objek memungkinkan satu class untuk mewarisi atribut dan method dari class lain, sehingga kode menjadi lebih efisien dan mudah dikembangkan. Melalui praktikum ini, class Produk berperan sebagai class induk yang menampung atribut umum, sedangkan class Benih, Pupuk, dan AlatPertanian menjadi class turunan yang memiliki atribut dan perilaku khusus masing-masing. Dengan adanya pewarisan, setiap class turunan dapat menambahkan atau mengubah fungsi tertentu tanpa mengubah struktur dasar dari class induk. Secara keseluruhan, praktikum ini memberikan pemahaman yang lebih baik tentang bagaimana inheritance dapat meningkatkan keteraturan, reusabilitas, dan efisiensi dalam pengembangan program berbasis objek.

---

## Quiz
1. Apa keuntungan menggunakan inheritance dibanding membuat class terpisah tanpa hubungan?
   jawaban: Inheritance = hemat kode, mudah dirawat, rapi, fleksibel, dan scalable. Sedangkan class terpisah tanpa hubungan → banyak duplikasi kode, sulit dirawat, dan tidak bisa memanfaatkan polymorphism.
2. Bagaimana cara subclass memanggil konstruktor superclass?
   jawaban: Subclass memanggil konstruktor superclass dengan super(parameter) di baris pertama konstruktor. Ini memastikan atribut atau logika dari superclass diinisialisasi sebelum subclass menjalankan bagian miliknya.
3. Berikan contoh kasus di POS pertanian selain Benih, Pupuk, dan Alat Pertanian yang bisa dijadikan subclass.
   jawaban: subclass lain yang bisa dibuat dalam sistem POS pertanian antara lain Pestisida, Herbisida, PakanTernak, Irigasi, dan MediaTanam.
Masing-masing mewarisi atribut dan method dari Produk, tetapi memiliki ciri khas sendiri sesuai jenis barangnya, sehingga sistem menjadi lebih terstruktur, mudah dikembangkan, dan sesuai kebutuhan toko pertanian.
