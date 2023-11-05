import java.util.Scanner;

public class BioskopWithScanner29{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String next;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1/2/3): ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                boolean kursiTidakAda = true;

                do {
                    System.out.print("Masukkan nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan baris: ");
                    int baris = sc.nextInt();
                    System.out.print("Masukkan kolom: ");
                    int kolom = sc.nextInt();
                    sc.nextLine();

                    if (baris >= 1 && baris <= 4 && kolom >= 1 && kolom <= 2) {
                        if (penonton[baris - 1][kolom - 1] == null) {
                            penonton[baris - 1][kolom - 1] = nama;
                            System.out.println("Reservasi tempat duduk berhasil.");
                        } else {
                            System.out.println("Maaf, tempat duduk sudah terisi. Silakan pilih kursi lain.");
                            kursiTidakAda = false;
                        }
                    } else {
                        System.out.println("Maaf, baris/kolom tidak valid. Silakan masukkan baris dan kolom kembali.");
                    }
                } while (!kursiTidakAda);

                break;

                case 2:
                    System.out.println("Daftar Penonton:");
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 2; j++) {
                            String temp = penonton[i][j];
                            if (temp == null) {
                                temp = "***";
                            }
                            System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": " + temp);
                        }
                    }
                    break;


                case 3:
                    System.out.println("Terima kasih. Program selesai.");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Menu tidak valid. Pilih menu 1, 2, atau 3.");
                    break;
            }

            System.out.print("Kembali ke menu? (y/n): ");
            next = sc.nextLine();
            if (next.equalsIgnoreCase("n")) {
                System.out.println("Terima kasih. Program selesai.");
                break;
            }
        }
    }
}
