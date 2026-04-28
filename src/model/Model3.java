package model;

import java.util.ArrayList;

public class Model3 {

    // ===== DATA MENU =====
    private String[] namaMenu = {
        "Nasi Goreng", "Mie Goreng", "Teh", "Kopi"
    };

    private int[] hargaMenu = {
        15000, 12000, 5000, 8000
    };

    private String[] kategoriMenu = {
        "Makanan", "Makanan", "Minuman", "Minuman"
    };

    // ===== DATA PESANAN =====
    private ArrayList<Integer> indexMenuPesanan = new ArrayList<>();
    private ArrayList<Integer> jumlahPesanan = new ArrayList<>();

    // ===== METHOD MENU =====
    public int getJumlahMenu() {
        return namaMenu.length;
    }

    public String getNamaMenu(int i) {
        return namaMenu[i];
    }

    public int getHargaMenu(int i) {
        return hargaMenu[i];
    }

    public String getKategoriMenu(int i) {
        return kategoriMenu[i];
    }

    // ===== TAMBAH PESANAN =====
    public void tambahPesanan(int indexMenu, int jumlah) {
        indexMenuPesanan.add(indexMenu);
        jumlahPesanan.add(jumlah);
    }

    // ===== SUBTOTAL PER ITEM =====
    public int getSubtotal(int i) {
        int indexMenu = indexMenuPesanan.get(i);
        int jumlah = jumlahPesanan.get(i);
        return hargaMenu[indexMenu] * jumlah;
    }

    // ===== TOTAL SEMUA PESANAN =====
    public int getTotal() {
        int total = 0;
        for (int i = 0; i < indexMenuPesanan.size(); i++) {
            total += getSubtotal(i);
        }
        return total;
    }

    // ===== AKSES DATA PESANAN =====
    public int getJumlahPesanan() {
        return indexMenuPesanan.size();
    }

    public String getNamaPesanan(int i) {
        return namaMenu[indexMenuPesanan.get(i)];
    }

    public int getJumlahItem(int i) {
        return jumlahPesanan.get(i);
    }
}