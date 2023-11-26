import java.util.Scanner;

public class NilaiMhs29 {

  static Scanner sc = new Scanner(System.in);
  static String[] namaSiswa;
  static int[][] nilaiSiswa;

  static void namaMhs() {
    namaSiswa = new String[5];
    for (int i = 0; i < namaSiswa.length; i++) {
      System.out.print("Masukkan Siswa " + (i + 1) + " Dengan Nama: ");
      namaSiswa[i] = sc.nextLine();
    }
  }

  static void nilaiMhs() {
    nilaiSiswa = new int[5][7];
    for (int i = 0; i < nilaiSiswa.length; i++) {
      for (int j = 0; j < nilaiSiswa[i].length; j++) {
        System.out.print("Masukkan Nilai " + namaSiswa[i] + " Di minggu ke- " + (j + 1) + ": ");
        nilaiSiswa[i][j] = sc.nextInt();
      }
    }
  }

  public static void main(String[] args) {
    // Memanggil fungsi `namaMhs()`
    namaMhs();

    // Memanggil fungsi `nilaiMhs()`
    nilaiMhs();

    // Mencetak hasil
    System.out.println("\nNama  | Week 1 | Week 2 | Week 3 | Week 4 | Week 5 | Week 6 | Week 7");
    for (int i = 0; i < nilaiSiswa.length; i++) {
      System.out.printf("%-5s | %6d | %6d | %6d | %6d | %6d | %6d | %6d\n",
              namaSiswa[i], nilaiSiswa[i][0], nilaiSiswa[i][1], nilaiSiswa[i][2], nilaiSiswa[i][3], nilaiSiswa[i][4], nilaiSiswa[i][5], nilaiSiswa[i][6]);
    }
  }
}
