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
  static int cariHariMaks() {
    if (nilaiSiswa.length == 0 || nilaiSiswa[0].length == 0) {
        // Menghandle kasus dimana array kosong
        return -1; // atau nilai yang sesuai
    }

    int maxDay = 1; // Mulai dari minggu pertama
    int maxSum = 0;

    for (int j = 0; j < nilaiSiswa[0].length; j++) {
        int sum = 0;
        for (int i = 0; i < nilaiSiswa.length; i++) {
            sum += nilaiSiswa[i][j];
        }

        if (sum > maxSum) {
            maxSum = sum;
            maxDay = j + 1;
        }
    }

        return maxDay;
}
static void tampilkanNilaiTertinggi() {
    int MhsNilaiTertinggi = -1;
    int totNilaiTertinggi = 0; // Inisialisasi dengan 0

    for (int i = 0; i < nilaiSiswa.length; i++) {
        int jmlNilai = 0;
        System.out.print("\nNilai " + namaSiswa[i] + ":\n");

        for (int j = 0; j < nilaiSiswa[i].length; j++) {
            System.out.println("Week " + (j + 1) + ": " + nilaiSiswa[i][j]);

            totNilaiTertinggi += nilaiSiswa[i][j];
        }

        if (jmlNilai > totNilaiTertinggi || totNilaiTertinggi == -1) {
            totNilaiTertinggi = jmlNilai;
            MhsNilaiTertinggi = i;
        }
        System.out.println("Total Nilai: " + jmlNilai + "\n");
    }

    if (MhsNilaiTertinggi != -1) {
        System.out.println("Mahasiswa dengan Nilai Tertinggi: " + namaSiswa[MhsNilaiTertinggi]);
        System.out.println("Total Nilai Tertinggi: " + totNilaiTertinggi);
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
    int maxDay = cariHariMaks();
    System.out.println("\nHari dengan nilai tertinggi secara keseluruhan: Week " + maxDay);

    tampilkanNilaiTertinggi();
  }
}
