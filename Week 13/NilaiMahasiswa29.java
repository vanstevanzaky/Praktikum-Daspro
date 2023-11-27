import java.util.Scanner;

public class NilaiMahasiswa29 {

  static Scanner sc = new Scanner(System.in);
  static String[] namaSiswa;
  static int[][] nilaiSiswa;

  static void namaMhs() {
    System.out.print("Masukkan jumlah mahasiswa: ");
    int jmlMhs = sc.nextInt();
    namaSiswa = new String[jmlMhs];
    for (int i = 0; i < namaSiswa.length; i++) {
      System.out.print("Masukkan nama mahasiswa ke-" + (i + 1) + ": ");
      namaSiswa[i] = sc.nextLine();
    }
  }

  static void nilaiMhs() {
    System.out.print("Masukkan jumlah tugas: ");
    int jmlTugas = sc.nextInt();
    nilaiSiswa = new int[jmlMhs][jmlTugas];
    for (int i = 0; i < nilaiSiswa.length; i++) {
      for (int j = 0; j < nilaiSiswa[i].length; j++) {
        System.out.print("Masukkan nilai " + namaSiswa[i] + " di tugas ke-" + (j + 1) + ": ");
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
        System.out.println("Tugas " + (j + 1) + ": " + nilaiSiswa[i][j]);

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
    System.out.println("\nNama  | Tugas 1 | Tugas 2 | Tugas 3 | Tugas 4 | Tugas 5 | Tugas 6 | Tugas 7");

  }
}