import java.util.Scanner;

public class ArrayRataNilai20Modif {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double rataRataLulus = 0.0;
        double rataRataTidakLulus = 0.0;
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();

        int[] nilaiMahasiswa = new int[jumlahMahasiswa];

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMahasiswa[i] = scanner.nextInt();
        }

        int totalNilai = 0;
        for (int nilai : nilaiMahasiswa) {
            totalNilai += nilai;
        }
        double rataRataNilai = (double) totalNilai / jumlahMahasiswa;

        for (int nilai : nilaiMahasiswa) {
            if (nilai >= 85) {
                jumlahLulus++;
            } else {
                jumlahTidakLulus++;
            }
        }

        if (jumlahLulus > 0) {
            rataRataLulus = (double) totalNilai / jumlahLulus;
        }

        if (jumlahTidakLulus > 0) {
            rataRataTidakLulus = (double) totalNilai / jumlahTidakLulus;
        }

        System.out.println("Rata-rata nilai = " + rataRataNilai);
        System.out.println("Rata-rata nilai lulus = " + rataRataLulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rataRataTidakLulus);

        scanner.close();
    }
}