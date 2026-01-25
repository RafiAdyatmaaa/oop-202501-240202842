Bab 1 – Pengenalan Paradigma dan Setup Proyek

## Identitas
- Nama  : Muhammad Rafi Adyatma
- NIM   : 240202842
- Kelas : 3IKRA

---

## Tujuan
1. Mahasiswa memahami konsep dasar pemrograman prosedural, fungsional, dan berorientasi objek (OOP).
2. Mahasiswa mampu membuat dan menjalankan program Java sederhana menggunakan ketiga paradigma tersebut.
3. Mahasiswa memahami struktur dasar program Java, termasuk fungsi main(), deklarasi class, dan method.
4. Mahasiswa dapat mengidentifikasi perbedaan pendekatan antara program Procedural, Functional, dan OOP dalam implementasi kode.

---

## Dasar Teori
1. Pemrograman prosedural adalah pendekatan pemrograman yang berfokus pada urutan langkah atau prosedur (fungsi) untuk menyelesaikan suatu tugas. Setiap fungsi memiliki peran tertentu dalam program.
2. Pemrograman fungsional menekankan pada penggunaan fungsi sebagai elemen utama. Fungsi dianggap sebagai entitas matematis yang tidak mengubah data secara langsung (tanpa efek samping).
3. Pemrograman berorientasi objek berfokus pada penggunaan class dan object. Setiap object memiliki atribut (data) dan method (perilaku) yang saling berinteraksi untuk membentuk sistem.
4. Program Java terdiri dari class utama yang berisi method main(String[] args) sebagai titik awal eksekusi. Java bersifat case-sensitive dan setiap file harus memiliki nama yang sama dengan nama class publiknya.

---

## Langkah Praktikum
1. Membuat Project Baru di VS Code
*Buka Visual Studio Code dan buat folder project dengan nama oop-202501-240202842.
*Pastikan JDK telah terpasang dan dikonfigurasi dengan benar di VS Code.
2. Membuat File Program Java
Buat tiga file Java dengan nama:
*HelloProcedural.java
*HelloFunctional.java
*HelloOOP.java
Setiap file dibuat sesuai paradigma pemrograman yang berbeda.
3. Menuliskan Kode Program
Tambahkan kode untuk menampilkan teks seperti:
*hello world, i am Muhammad Rafi Adyatma - 240202842
Simpan setiap file setelah selesai mengetik.
4. Menjalankan Program di Terminal VS Code
Gunakan perintah:
*javac NamaFile.java
*java NamaFile
atau tekan Ctrl + F5 untuk menjalankan program.
5. Melihat dan Mencatat Hasil Output
Amati hasil yang muncul di terminal.
Catat perbedaan hasil dan struktur kode antara program procedural, functional, dan OOP.

---

## Kode Program
```java
// HelloProcedural.java
public class HelloProcedural {
   public static void main(String[] args) {
      
      String nim = "240202842";
      String nama = "Muhammad Rafi Adyatma";

      // Prosedural dengan method
        panggil("Muhammad Rafi Adyatma", "2402022842");
      // Bisa dipanggil secara berulang

   }
 // Method 
    public static void panggil(String nama, String nim){
        System.out.println("HELLO WORD, IM "+ nama + " -"+ nim);
    }
}

```java
class MAHASISWA {
    String nama; int nim;
    MAHASISWA(String nm, int ni){nama=nm; nim=ni; }
    void panggil(){ System.out.println("HELLO WORD, IM "+ nama + " -"+ nim);}
}

public class HelloOOP {
    public static void main(String[] args) {
        MAHASISWA RAJIN = new MAHASISWA("Muhammad Rafi Adyatma", 240202842);
        RAJIN.panggil();
    }

}

```java
import java.util.function.BiConsumer;
public class HelloFunctional {
    public static void main(String[] args) {
        BiConsumer<String, Integer> panggil =
            (nama, nim)-> System.out.println("hello world, i am "+ nama + "-"+ nim);
            panggil.accept("Muhammad Rafi Adyatma", 240202842);
        
    }
}
---

```
## Hasil Eksekusi
(Sertakan screenshot hasil eksekusi program.  
![Screenshot hasil](screenshots/hasil.png)
)
---

## Analisis
(
- Jelaskan bagaimana kode berjalan.
Program dijalankan dengan memanggil fungsi main() pada masing-masing paradigma:
1. Pada HelloProcedural, program mengeksekusi serangkaian perintah secara berurutan tanpa menggunakan class atau object.
2. Pada HelloFunctional, program memanfaatkan konsep fungsi lambda untuk menjalankan logika yang lebih ringkas dan modular.
3. Pada HelloOOP, eksekusi dimulai dengan membuat objek dari class, kemudian memanggil method milik objek tersebut untuk menampilkan hasil.
Ketiganya menampilkan output serupa di konsol, yaitu menampilkan teks “Hello World” atau sapaan sesuai struktur masing-masing paradigma.  
- Apa perbedaan pendekatan minggu ini dibanding minggu sebelumnya.
Pada minggu ini, fokusnya adalah mengenal tiga paradigma pemrograman (prosedural, fungsional, dan berorientasi objek).
Sementara minggu sebelumnya mungkin hanya menggunakan pendekatan prosedural dasar, minggu ini mahasiswa belajar bagaimana konsep yang sama dapat diterapkan dengan gaya pemrograman berbeda, serta bagaimana OOP memberikan struktur yang lebih jelas dan mudah dikelola dibanding pendekatan konvensional.  
- Kendala yang dihadapi dan cara mengatasinya.  
1. Kendala: Saat menjalankan program di VS Code, muncul error karena konfigurasi JDK belum dikenali oleh ekstensi Java.
Cara mengatasinya: Mengatur ulang path JDK di pengaturan VS Code melalui Java: Configure Runtime dan memastikan compiler menggunakan versi yang benar (misalnya JDK 21).
2. Kendala lain: Program tidak bisa dijalankan karena struktur folder dan package belum sesuai.
Cara mengatasinya: Menyesuaikan struktur direktori dengan deklarasi package di dalam file Java (misalnya main.java.com.upb.agripos harus sesuai dengan letak folder di proyek).
)
---

## Kesimpulan
Berdasarkan hasil praktikum yang telah dilakukan, dapat disimpulkan bahwa mahasiswa telah berhasil memahami tiga paradigma pemrograman dalam Java, yaitu prosedural, berorientasi objek (OOP), dan fungsional.
Pendekatan prosedural menekankan urutan langkah-langkah melalui method yang dijalankan secara berurutan. Pendekatan OOP mengorganisasi program dalam bentuk class dan object sehingga lebih terstruktur, modular, dan mudah dikembangkan. Sedangkan pendekatan fungsional menggunakan lambda expression dan functional interface untuk membuat kode yang lebih ringkas dan efisien.
Meskipun ketiga paradigma menghasilkan output yang sama, masing-masing memiliki cara implementasi dan keunggulan yang berbeda. Melalui praktikum ini, mahasiswa diharapkan mampu memahami kelebihan serta kekurangan dari setiap paradigma, dan dapat memilih pendekatan pemrograman yang paling tepat sesuai kebutuhan permasalahan yang dihadapi.

---

## Quiz
(1. Apakah OOP selalu lebih baik dari prosedural?  
   **Jawaban:** …  
   tidak selalu.
OOP (Object-Oriented Programming) memang punya banyak kelebihan dibanding pemrograman prosedural, tapi bukan berarti selalu lebih baik untuk semua kasus.  
2. Kapan functional programming lebih cocok digunakan dibanding OOP atau prosedural?  
   **Jawaban:** …  
   Ketika program membutuhkan banyak operasi data yang kompleks, seperti filtering, mapping, atau reducing data dalam jumlah besar. Paradigma fungsional memungkinkan penulisan kode yang ringkas dan mudah dibaca, misalnya dengan stream API di Java.

3. Bagaimana paradigma (prosedural, OOP, fungsional) memengaruhi maintainability dan scalability aplikasi?  
   **Jawaban:** …  
   Paradigma prosedural cocok untuk program kecil dan cepat dibuat,
OOP unggul dalam proyek besar yang membutuhkan struktur dan kerja tim,
sedangkan fungsional sangat efisien untuk sistem berskala besar yang memerlukan stabilitas, paralelisme, dan pengujian mudah.


4. Mengapa OOP lebih cocok untuk mengembangkan aplikasi POS dibanding prosedural?
   **Jawaban:** … 
   OOP lebih cocok untuk aplikasi POS karena dapat memodelkan komponen dunia nyata ke dalam objek yang saling berinteraksi, menjadikan program lebih mudah dikembangkan, dipelihara, dan diperluas dibanding pendekatan prosedural.

5. Bagaimana paradigma fungsional dapat membantu mengurangi kode berulang (*boilerplate code*)?
   **Jawaban:** …
   Paradigma fungsional mengurangi boilerplate code dengan memanfaatkan fungsi murni, lambda, dan ekspresi deklaratif, sehingga logika program dapat ditulis secara ringkas tanpa banyak struktur tambahan seperti pada OOP atau prosedural.
   )
