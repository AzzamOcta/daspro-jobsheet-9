import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int price;
        int jml;
        int jumlah = 0;
        int total = 0;
        int j = 0;
        String selesai;
        String key;
        
        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};
        String[] baru = new String[100];

        int[] jmlPesanan = new int[100];
        int[] subTotal = new int[100];
        

        System.out.println("======= Selamat Datang. Selamat Berbelanja =======");
        
        do {
            boolean ada = false;

            System.out.print("\nCari menu: ");
            key = sc.nextLine();
    
            for (int i = 0; i < menu.length; i++) {
                if (menu[i].equalsIgnoreCase(key)) {
                    System.out.println("Harganya: " + harga[i]);
                    ada = true;
                    
                    System.out.print("Masukkan jumlah barang (0: kembali): ");
                    jml = sc.nextInt();
                    sc.nextLine();
                        
                        if (jml > 0 ) {
                            price = harga[i] * jml;
                            jumlah = jumlah + jml;
                            total = total + price;
                            
                            baru[j] = menu[i];
                            jmlPesanan[j] = jml;
                            subTotal[j] = price;
                            j++;
                        }

                    break;
                        
                    } 
                }

            if (!ada) {
                System.out.println("Menu tidak tersedia");
            }

            System.out.print("Sudah semua? (Y/T): ");
            selesai = sc.nextLine();

        } while (!selesai.equalsIgnoreCase("Y"));

        System.out.println("\n======== Nota Belanja ========");
        System.out.println("\nJenis Item: " + j);
        System.out.println("Total item: " + jumlah);
        System.out.println("\nDaftar Item:");

        for (int i = 0; i <= j; i++) {
            if (baru[i] != null){
                System.out.println(baru[i] + " x " + jmlPesanan[i] + " = " + subTotal[i]);
            }
        }

        // System.out.println(Arrays.toString(baru));
        System.out.println("\nTotal Belanja: " + total);

        System.out.println("\n===== Terimakasih. Datang Kembali =====");
    }
}
