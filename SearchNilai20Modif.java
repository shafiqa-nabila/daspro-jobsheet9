import java.util.Scanner;

public class SearchNilai20Modif {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        int jumlahData = scanner.nextInt();

        int[] nilaiMahasiswa = new int[jumlahData];

        
        for (int i = 0; i < jumlahData; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMahasiswa[i] = scanner.nextInt();
        }

        
        System.out.print("Masukkan nilai yang ingin dicari: ");
        int nilaiDicari = scanner.nextInt();

       
        boolean ditemukan = false;
        for (int i = 0; i < jumlahData; i++) {
            if (nilaiMahasiswa[i] == nilaiDicari) {
                ditemukan = true;
                break;
            }
        }

        if (ditemukan) {
            System.out.println("Nilai yang dicari ditemukan.");
        } else {
            System.out.println("Nilai yang dicari tidak ditemukan.");
        }
    }
}