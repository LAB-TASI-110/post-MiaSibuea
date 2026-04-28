package model;

public class Model2 {

    public int hitungTotal(int[] stok, int kodeKategori) {
        int total = 0;

        for (int i = 0; i < stok.length; i++) {
            if (kodeKategori == 1) {
                // indeks ganjil
                if (i % 2 == 1) {
                    total += stok[i];
                }
            } else if (kodeKategori == 2) {
                // indeks genap
                if (i % 2 == 0) {
                    total += stok[i];
                }
            }
        }

        return total;
    }
}