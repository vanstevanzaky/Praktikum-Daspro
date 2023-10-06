import java.util.Scanner;
public class Gaji29{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int jmlMasuk, jmlTdkMasuk, TotGaji;
        int gaji, potGaji;

        System.out.println("Masukkan Jumlah Hari Kerja Anda");
        jmlMasuk=input.nextInt();
        System.out.println("Masukkan Jumlah Hari Tidak Masuk Kerja Anda");
        jmlTdkMasuk=input.nextInt();
        System.out.println("Masukkan gaji anda");
        gaji= input.nextInt();
        System.out.println("Masukkan potongan gaji anda");
        potGaji= input.nextInt();

        TotGaji= (jmlMasuk*gaji)-(jmlTdkMasuk*potGaji);
        System.out.println("Gaji yang anda terima adalah" +TotGaji);



    }
    
}