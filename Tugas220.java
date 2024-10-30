import java.util.Scanner;

public class Tugas220 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah pesanan: ");
        int jumlahPesanan = scanner.nextInt();
        scanner.nextLine();

        String[] namaPesanan = new String[jumlahPesanan];
        double[] hargaPesanan = new double[jumlahPesanan];

        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.print("Masukkan nama makanan/minuman ke-" + (i + 1) + ": ");
            namaPesanan[i] = scanner.nextLine();
            System.out.print("Masukkan harga " + namaPesanan[i] + ": ");
            hargaPesanan[i] = scanner.nextDouble();
            scanner.nextLine(); 
        }

        double totalBiaya = 0;
        for (double harga : hargaPesanan) {
            totalBiaya += harga;
        }

        System.out.println("\nDaftar Pesanan:");
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.printf("%d. %s - Harga: %.2f\n", i + 1, namaPesanan[i], hargaPesanan[i]);
        }

        System.out.printf("\nTotal Biaya: %.2f\n", totalBiaya);

    }
}