import java.util.Scanner;

public class Tugas5_No1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N = ");
        int n = sc.nextInt(); // untuk memberikan inputan nilai yang akan diproses
        if (n > 2) {
            for (int i = 1; i <= n; i++) { // perulangan baris
                int number = 1; // deklarasi untuk outputan dan diurutkan
                for (int j = 1; j <= n; j++) { // perulangan kolom
                    if (j > n - i) { // kondisi ketika kolom lebih dari inputan dikurangi baris
                        System.out.print(number); // menampilkan angka secara berurutan
                        number++; // deklarasi number akan bertambah terus menerus
                    } else {
                        System.out.print(" "); // memberikan spasi untuk angka yang tidak memenuhi inputan secara urut
                    }
                }
                System.out.println(); // memberikan enter di perulangan
            }
        } else {
            System.out.println("Nilai terlalu kecil pastikan inputan benar");
        }

    }
}