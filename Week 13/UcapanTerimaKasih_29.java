import java.util.Scanner;
public class UcapanTerimaKasih_29{

    public static String PenerimaUcapan(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan NAMA orang yang ingin Anda beri ucapan: ");
        String namaOrang = sc.nextLine();
        sc.close();
        return namaOrang;
    }

    public static String UcapanTerimaKasih(){
        String nama = PenerimaUcapan();
      
        return "Thank you "+nama+" for being the best teacher in the world.\n"+
        "You isnpired in me a love for learning and made me feel like I could ask you anything.";
    }
    public static void UcapanTambahan(String ucapan){
        String tambahan = UcapanTerimaKasih();

        System.out.println(tambahan +"\n"+ucapan);
    }
    
    public static void main(String[] args) {
        String ucapan = "I love forever";
        UcapanTambahan(ucapan);
    }

}