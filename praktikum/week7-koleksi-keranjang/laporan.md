# Laporan Praktikum Minggu 1 (sesuaikan minggu ke berapa?)
Bab 7 – Collections dan Implementasi Keranjang Belanja
## Identitas
- Nama  : Muhammad Rafi Adyatma
- NIM   : 240202842
- Kelas : 3IKRA

---

## Tujuan
Menjelaskan konsep collection dalam Java (List, Map, Set).
Menggunakan ArrayList untuk menyimpan dan mengelola objek.
Mengimplementasikan Map atau Set sesuai kebutuhan pengelolaan data.
Melakukan operasi dasar pada collection: tambah, hapus, dan hitung total.
Menganalisis efisiensi penggunaan collection dalam konteks sistem Agri-POS.


---

## Dasar Teori
1. Collections Framework
Java Collections Framework menyediakan struktur data untuk mengelola objek secara dinamis dan efisien.

Struktur utama:

List (implementasi: ArrayList) — Terurut, dapat menyimpan elemen duplikat.
Map (implementasi: HashMap) — Menyimpan pasangan key–value, akses cepat berdasarkan key.
Set (implementasi: HashSet) — Tidak menerima duplikat dan tidak mempertahankan urutan.
2. Studi Kasus: Keranjang Belanja Agri-POS
Keranjang belanja harus dapat:

Menambahkan produk
Menghapus produk
Menampilkan isi keranjang
Menghitung total nilai transaksi
Menangani jumlah (quantity) menggunakan Map
Kasus ini mencerminkan penggunaan struktur data dalam aplikasi nyata seperti POS.
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

public class MainCart {
    public static void main(String[] args) {
        System.out.println("Hello, I am Muhammad Rafi Adyatma-240202842 (Week7)");

        Product p1 = new Product("P01", "Beras", 50000);
        Product p2 = new Product("P02", "Pupuk", 30000);

        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(p1);
        cart.addProduct(p2);
        cart.printCart();

        cart.removeProduct(p1);
        cart.printCart();
    }
}
)
---

## Hasil Eksekusi
(
<img width="1920" height="1080" alt="week7" src="https://github.com/user-attachments/assets/d563ef50-7de8-4559-8beb-e49cd2d1025f" />
)
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
1. Jelaskan perbedaan mendasar antara List, Map, dan Set.
jawab: List: Urutan elemen penting, boleh duplikat (misal: [A, B, A]).
Set: Tidak ada duplikat, urutan tidak dijamin (kecuali LinkedHashSet).
Map: Menyimpan pasangan kunci-nilai (key → value), kunci unik.
2. Mengapa ArrayList cocok digunakan untuk keranjang belanja sederhana?
jawab: ArrayList untuk keranjang belanja karena:
→ Boleh ada barang sama lebih dari sekali,
→ Urutan barang penting (sesuai ditambahkan).
3. Bagaimana struktur Set mencegah duplikasi data?
jawab: Set mencegah duplikasi dengan memeriksa kesetaraan objek (equals() dan hashCode()) saat menambah; jika sudah ada, tambahan diabaikan.
4. Kapan sebaiknya menggunakan Map dibandingkan List? Jelaskan dengan contoh
jawab: Gunakan Map daripada List saat butuh akses cepat berdasarkan kunci.
Contoh: Simpan harga barang → Map<String, Double> harga = {"apel": 5000, "pisang": 3000}.
Cari harga "apel" langsung via kunci, tanpa iterasi seperti di List.


