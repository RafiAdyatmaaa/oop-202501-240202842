package main.java.com.upb.agripos.dao;

import java.util.List;
import main.java.com.upb.agripos.model.Produk;

public interface ProductRepository {
    // 1. Simpan Produk Baru
    void save(Produk p) throws Exception;

    // 2. Cari Produk (berdasarkan kode)
    Produk findByCode(String code) throws Exception;

    // 3. Tampilkan Semua Produk
    List<Produk> findAll() throws Exception;

    // 4. Update Produk (Edit stok/harga/nama)
    void update(Produk p) throws Exception;

    // 5. Hapus Produk (PENTING: Jangan sampai tertinggal)
    void delete(String code) throws Exception;
}