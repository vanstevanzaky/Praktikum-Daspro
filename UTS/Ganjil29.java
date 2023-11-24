import java.util.Scanner;

public class Ganjil29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan bulat N (N > 0): ");
        int N = input.nextInt();

        if (N <= 0) {
            System.out.println("N harus lebih dari 0.");
        } else {
            int jumlahGanjil = 0;

            while (N > 0) {
                int digit = N % 10;  
                if (digit % 2 != 0) {  
                    jumlahGanjil++;
                }
                N = N / 10;  
            }

            System.out.println("Jumlah digit ganjil dalam bilangan N = " + jumlahGanjil);
        }

    }
}
