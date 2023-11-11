import java.util.Scanner;

public class Tugas5_No2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int number = sc.nextInt(); // inputan angka
        if (number > 4) {
            for (int i = 0; i < number; i++) { // perulangan baris

                for (int k = 0; k < number - i; k++) { // perulangan kolom dan jika kolom kurang dari inputan dikurangi
                                
                    System.out.print("*"); // mencetak bintang
                }
                System.out.println(); // memberikan enter untuk setiap output
            }
        } else {
            System.out.println("Nilai terlalu kecil pastikan inputan benar");
        }

    }
}