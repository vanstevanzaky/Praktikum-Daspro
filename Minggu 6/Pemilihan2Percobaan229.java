import java.util.Scanner;
public class Pemilihan2Percobaan229{
    public static void main(String[] args){
        Scanner input29 = new Scanner(System.in);
        float sudut1, sudut2, sudut3, totalSudut;
        System.out.print("Masukkan sudut 1: ");
        sudut1 = input29.nextFloat();
        System.out.print("Masukkan sudut 2: ");
        sudut2 = input29.nextFloat();
        System.out.print("Masukkan sudut 3: ");
        sudut3 = input29.nextFloat();
       
        totalSudut = sudut1 + sudut2 + sudut3;

        if (totalSudut == 180) {
            if (sudut1 > 0 && sudut2 > 0 && sudut3 > 0) {
                if (sudut1 == 90 || sudut2 == 90 || sudut3 == 90) {
                    System.out.println("Segitiga tersebut adalah segitiga siku-siku");
                } else if (sudut1 == sudut2 && sudut2 == sudut3) {
                    System.out.println("Segitiga tersebut adalah segitiga sama sisi");
                } else if (sudut1 == sudut2 || sudut2 == sudut3 || sudut1 == sudut3) {
                    System.out.println("Segitiga tersebut adalah segitiga sama kaki");
                } else {
                    System.out.println("Segitiga tersebut adalah segitiga sembarang");
                }
            } else {
                System.out.println("Sudut-sudut harus positif.");
            }
        } else {
            System.out.println("Bukan Segitiga");
        
        }
    }
}