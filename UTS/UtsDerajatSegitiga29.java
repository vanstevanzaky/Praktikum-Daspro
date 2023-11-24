import java.util.Scanner;

public class UtsDerajatSegitiga29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan tiga sudut segitiga:");
        System.out.print("Sudut 1: ");
        int sudut1 = input.nextInt();
        System.out.print("Sudut 2: ");
        int sudut2 = input.nextInt();
        System.out.print("Sudut 3: ");
        int sudut3 = input.nextInt();

       
        if (sudut1 + sudut2 + sudut3 == 180) {
          
            if (sudut1 > 0 && sudut2 > 0 && sudut3 > 0) {
                
                if (sudut1 == 90 || sudut2 == 90 || sudut3 == 90) {
                    System.out.println("Segitiga ini SIKU-SIKU.");
                } else {
                    System.out.println("Segitiga ini BUKAN SIKU-SIKU.");
                }
            } else {
                System.out.println("Sudut harus lebih besar dari 0° dan kurang dari 180°.");
            }
        } else {
            System.out.println("Nilai input sudut tidak sesuai.");
        }

       
    }
}
