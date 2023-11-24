import java.util.Scanner;

public class UtsNilai29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan bulat N (N > 0): ");
        int N = input.nextInt();

        if (N <= 0) {
            System.out.println("N harus lebih dari 0.");
        } else {
            int sum = 0;
            for (int i = 1; i <= N; i++) {
                int kuadrat = i * i;
                sum += kuadrat;
            }

            System.out.println("Hasil penjumlahan N bilangan kuadrat pertama adalah: " + sum);
        }

    }
}





