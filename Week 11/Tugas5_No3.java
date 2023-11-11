import java.util.Scanner;

public class Tugas5_No3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Masukkan angka: ");
        int angka = sc.nextInt(); //inputan angka

        for(int i = 1; i <= angka; i++){ //perulangan baris
            for(int j = 1; j <= angka; j++){ //perulangan kolom
                if(i > 1 && i < angka && j > 1 && j < angka ){ //kondisi ketika angka pertama dan akhir tanpa spasi
                    System.out.print("  "); //pemberian
                }
                else{
                    System.out.print(angka+" ");
                }
            } 
            System.out.println();
        }
    }
}