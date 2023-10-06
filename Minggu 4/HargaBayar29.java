import java.util.Scanner;
public class HargaBayar29{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int harga, jumlah, jmlHal;
        double dis, total, bayar,jmlDis;
        String merkBuku;



        System.out.println("Masukkan merk buku");
        merkBuku= input.nextLine();
        System.out.println("Masukkan jumlah halaman buku");
        jmlHal= input.nextInt();
        System.out.println("Masukkan harga barang yang dibeli");
        harga= input.nextInt();
        System.out.println("Masukkan jumlah barang yang dibeli");
        jumlah= input.nextInt();
        System.out.println("Masukkan diskon");
        dis = input.nextDouble();




        total= harga*jumlah;
        jmlDis= total*dis;
        bayar= total - jmlDis;

        System.out.println("Diskon yang anda dapatkan adalah" +jmlDis);
        System.out.println("Jumlah yang harus dibayar adalah" +bayar);
    
        


    }
}