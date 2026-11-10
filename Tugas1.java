import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        double total = 0;
        double rata;
        int tertinggi;
        int terendah;
        String status;

        System.out.print("Masukkan jumlah mahasiswa: ");
        n = sc.nextInt();
        int[] nilai = new int[n];

        int j = 0;
        
        do {
            System.out.print("Masukkan nilai mahasiswa ke-" + (j + 1) + ": ");
            nilai[j] = sc.nextInt();
    
            if (nilai[j] <= 100 && nilai[j] >= 0) {
                total = total + nilai[j];
            } else {
                System.out.println("Nilai tidak valid, masukkan ulang nilai (rentang nilai 0 - 100)");
                continue;
            }

            j++;
        } while (j < nilai.length);

        System.out.println("\n====== Status Penilaian Mahasiswa ======");

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] > 70) {
                status = "LULUS";
            } else {
                status = "TIDAK LULUS";
            }

            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilai[i] + " (" + status + ")");
        }

        rata = total / nilai.length;

        tertinggi = nilai[0];
        terendah = nilai[0];

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];
            } 
            if (nilai[i] < terendah) {
                terendah = nilai[i];
            }
        }

        System.out.println("\n====== Hasil Akhir ======");

        System.out.println("Rata-rata nilai: " + rata);
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
    }
}
