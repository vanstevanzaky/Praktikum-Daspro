import java.util.Scanner;
public class Pemilihan2Percobaan129{
    public static void main(String[] args){
    Scanner input29 = new Scanner(System.in);
    System.out.print("Masukkan tahun: ");
    int tahun = input29.nextInt();
    boolean isKabisat = false;

    if ((tahun % 4) == 0) {
        if ((tahun % 100) != 0) {
            isKabisat = true;
        } else if ((tahun % 400) == 0) {
            isKabisat = true;
        }
    }

    if (isKabisat) {
        System.out.println("Tahun Kabisat");
    } else {
        System.out.println("Bukan Tahun Kabisat");
    }

    }
    
}