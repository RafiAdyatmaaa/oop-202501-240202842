# Laporan Praktikum Minggu 1 (sesuaikan minggu ke berapa?)
Topik: [Tuliskan judul topik, misalnya "Class dan Object"]

## Identitas
- Nama  : Muhammad Rafi Adyatma
- NIM   : 240202842
- Kelas : 3IKRA

---

## Tujuan
Mahasiswa mampu menggambar UML Class Diagram dengan relasi antar class yang tepat.
Mahasiswa mampu mengidentifikasi kebutuhan sistem ke dalam diagram UML.
Mahasiswa mampu menjelaskan prinsip desain OOP (SOLID).

---

## Dasar Teori
(Tuliskan ringkasan teori singkat (3–5 poin) yang mendasari praktikum.  
Contoh:  
1. Class adalah blueprint dari objek.  
2. Object adalah instansiasi dari class.  
3. Enkapsulasi digunakan untuk menyembunyikan data.)

---

## Langkah Praktikum
(Tuliskan Langkah-langkah dalam prakrikum, contoh:
1. Langkah-langkah yang dilakukan (setup, coding, run).  
2. File/kode yang dibuat.  
3. Commit message yang digunakan.)

---

## Kode Program
(Tuliskan kode utama yang dibuat, contoh:  

```java
// Contoh
Produk p1 = new Produk("BNH-001", "Benih Padi", 25000, 100);
System.out.println(p1.getNama());
```
)
---

## Hasil Eksekusi
![Activity Checkout](https://github.com/user-attachments/assets/165ab726-b6a3-48b9-9c2e-e63cbd0effbb)
![class diagram- sistem agri-Pos](https://github.com/user-attachments/assets/891031f3-65e3-4928-84ed-4cc87a3c8bc6)
![sequence diagram-payment process (cash E-wallet)](https://github.com/user-attachments/assets/ba9aba5d-53a8-40e0-9bae-4c6a5171406e)
![use case diagram](https://github.com/user-attachments/assets/cb5ac8d6-23a3-47a2-9b3c-1815a554a1e4)
![use case ui ux](https://github.com/user-attachments/assets/e0b1ed8c-4b32-409e-a97f-26943749e241)

---

## Analisis
(
- Jelaskan bagaimana kode berjalan.  
- Apa perbedaan pendekatan minggu ini dibanding minggu sebelumnya.  
- Kendala yang dihadapi dan cara mengatasinya.  
)
---

## Kesimpulan
(Tuliskan kesimpulan dari praktikum minggu ini.  
Contoh: *Dengan menggunakan class dan object, program menjadi lebih terstruktur dan mudah dikembangkan.*)

---

## Quiz
1. Jelaskan perbedaan aggregation dan composition serta berikan contoh penerapannya pada desain Anda.
   jawab: Aggregation dan Composition adalah dua jenis hubungan “has-a” dalam pemodelan berorientasi objek (misalnya dalam UML – Unified Modeling Language), yang menggambarkan bagaimana objek saling terkait satu sama lain. Keduanya termasuk dalam kategori association, tetapi berbeda dalam hal kepemilikan (ownership) dan siklus hidup (lifetime) objek.
2. Bagaimana prinsip Open/Closed dapat memastikan sistem mudah dikembangkan?
   jawab: Prinsip Open/Closed memastikan sistem mudah dikembangkan karena:
- Mendorong desain yang fleksibel melalui abstraksi.
- Meminimalkan modifikasi kode yang sudah teruji.
- Memungkinkan ekspansi fitur tanpa mengganggu komponen yang ada.
- Meningkatkan kemampuan pengujian, pemeliharaan, dan kolaborasi tim.
3. Mengapa Dependency Inversion Principle (DIP) meningkatkan testability? Berikan contoh penerapannya.
  Karena DIP memisahkan ketergantungan konkret, sehingga:
- Komponen dapat diuji secara terisolasi — Anda bisa mengganti dependensi nyata dengan mock atau stub saat pengujian.
- Tidak perlu menjalankan infrastruktur eksternal (seperti database, API, file system) saat unit testing.
- Kode menjadi lebih fleksibel dan modular, memungkinkan substitusi implementasi tanpa mengubah logika inti.
  contoh:
  '''java
  class NotifikasiEmail {
    public void kirim(String pesan) {
        // Mengirim email via SMTP (bergantung pada layanan nyata)
        System.out.println("Email terkirim: " + pesan);
    }
}

class PendaftaranUser {
    private NotifikasiEmail emailService = new NotifikasiEmail(); // Ketergantungan konkret!

    public void daftar(String nama) {
        // Simpan user...
        emailService.kirim("Selamat datang, " + nama + "!");
    }
}
'''
