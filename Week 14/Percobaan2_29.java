import java.util.Scanner;
public class Percobaan2_29 {

    static int hitungPangkat(int x, int y){
        if (y == 0) {
            return (1);
        } else {
            return (x * hitungPangkat(x, y -1));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bilangan;
        int pangkat;

        System.out.print("Bilangan yang dihitung: ");
        bilangan = sc.nextInt();
        System.out.print("Pangkat: ");
        pangkat = sc.nextInt();

        int hasil = hitungPangkat(bilangan, pangkat);
        System.out.print("Deret perhitungan pangkat: ");
        for (int i = pangkat; i > 0; i--) {
            System.out.print(bilangan + "x");
        }
        System.out.print(bilangan + " = " + hasil);
    }
  
}