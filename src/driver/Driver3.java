package driver;

import java.util.Scanner;
import model.Model3;

public class Driver3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Model3 model = new Model3();

        // ===== TAMPILKAN MENU =====
        System.out.println("===== DAFTAR MENU =====");
        for (int i = 0; i < model.getJumlahMenu(); i++) {
            System.out.println(
                (i + 1) + ". " +
                model.getNamaMenu(i) + " - " +
                model.getHargaMenu(i) + " - " +
                model.getKategoriMenu(i)
            );
        }

        // ===== INPUT PESANAN =====
        boolean lanjut = true;

        while (lanjut) {
            System.out.print("Pilih nomor menu: ");
            int pilihan = input.nextInt();

            // validasi sederhana
            if (pilihan < 1 || pilihan > model.getJumlahMenu()) {
                System.out.println("Pilihan tidak valid!");
                continue;
            }

            System.out.print("Masukkan jumlah: ");
            int jumlah = input.nextInt();

            // simpan pesanan (index = pilihan - 1)
            model.tambahPesanan(pilihan - 1, jumlah);

            System.out.print("Tambah pesanan? (y/n): ");
            String jawab = input.next();

            if (!jawab.equalsIgnoreCase("y")) {
                lanjut = false;
            }
        }

        // ===== TAMPILKAN STRUK =====
        System.out.println("\n===== STRUK PEMESANAN =====");

        for (int i = 0; i < model.getJumlahPesanan(); i++) {
            System.out.println(
                (i + 1) + ". " +
                model.getNamaPesanan(i) + " x" +
                model.getJumlahItem(i) + " = " +
                model.getSubtotal(i)
            );
        }

        System.out.println("--------------------------");
        System.out.println("Total = " + model.getTotal());

        input.close();
    }
}