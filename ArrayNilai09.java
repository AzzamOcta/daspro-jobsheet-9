import java.util.Scanner;

public class ArrayNilai09 {
    public static void main(String[] args) {
        
        int[] nilaiAkhir = new int[10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiAkhir[i] = sc.nextInt();
        }

        int l = 0;
        int t = 0;

        for (int i = 0; i < nilaiAkhir.length; i++) {
            String status = (nilaiAkhir[i] > 70) ? "LULUS" : "TIDAK LULUS";

            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiAkhir[i] + " (" + status + ")");
            if (nilaiAkhir[i] > 70) {
                l++;
            } else {
                t++;
            }
        }

        System.out.println("Jumlah mahasiswa lulus: " + l);
        System.out.println("Jumlah mahasiswa tidak lulus: " + t);
    }
}
