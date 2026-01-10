# Laporan Praktikum Minggu 1 (sesuaikan minggu ke berapa?)
Bab 9 – Exception Handling, Custom Exception, dan Penerapan Design Pattern

## Identitas
- Nama  : Muhammad Rafi Adyatma
- NIM   : 240202842
- Kelas : 3IKRA

---

## Tujuan
(Tuliskan tujuan praktikum minggu ini.  
Contoh: *Mahasiswa memahami konsep class dan object serta dapat membuat class Produk dengan enkapsulasi.*)

---

## Dasar Teori
Menjelaskan perbedaan antara error dan exception.
Mengimplementasikan try–catch–finally dengan tepat.
Membuat custom exception sesuai kebutuhan program.
Mengintegrasikan exception handling ke dalam aplikasi sederhana (kasus keranjang belanja).
(Opsional) Menerapkan design pattern sederhana (Singleton/MVC) dan unit testing dasar.
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
package com.upb.agripos;

public class MainExceptionDemo {
    public static void main(String[] args) {
        System.out.println("Hello, I am Muhammad Rafi Adyatma-240202842 (Week9)");

        ShoppingCart cart = new ShoppingCart();
        Product p1 = new Product("P01", "Pupuk Organik", 25000, 3);
        // contoh penambahan stok
        try {
            // menambahkan produk dengan stok negatif
            cart.addProduct(p1, -1);
        } catch (InvalidQuantityException e) {
            // menampilkan informasi quantity tidak valid
            System.out.println("Kesalahan: " + e.getMessage());
        }
        // contoh pengurangan stok
        try {
            cart.removeProduct(p1);
        } catch (ProductNotFoundException e) {
            // menampilkan informasi produk tidak ditemukan
            System.out.println("Kesalahan: " + e.getMessage());
        }
        // jika stok kurang dari 5 maka tidak bisa checkout
        try {
            cart.addProduct(p1, 5);
            cart.checkout();
        } catch (Exception e) {
            System.out.println("Kesalahan: " + e.getMessage());
        }
        // insufficient stock
        try {
            cart.checkout();
        } catch (InsufficientStockException e) {
            System.out.println("Kesalahan: " + e.getMessage());
        }
    }
}
)
---

## Hasil Eksekusi
<img width="1005" height="275" alt="week9" src="https://github.com/user-attachments/assets/043406c3-8d7d-4dc0-961a-fb6859f844c0" />

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
1. Jelaskan perbedaan error dan exception.
jawab: Error: Masalah sistem fatal (tidak bisa ditangani).
Exception: Masalah runtime yang bisa ditangani.
2. Apa fungsi finally dalam blok try–catch–finally?
jawab: Finally: Blok yang selalu dijalankan, biasanya untuk bersihkan resource.
3. Mengapa custom exception diperlukan?
jawab: Custom exception: Diperlukan agar error sesuai konteks bisnis dan mudah ditangani.
4. Berikan contoh kasus bisnis dalam POS yang membutuhkan custom exception.
jawab: Contoh POS: InsufficientStockException saat stok tidak cukup saat transaksi.
