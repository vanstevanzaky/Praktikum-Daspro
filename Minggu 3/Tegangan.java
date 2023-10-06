import java.util.Scanner;
public class Tegangan{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int R1,R2,R3,R4, I;
        double Rparalel, Rtotal, v;
        System.out.println("Masukkan R1: ");
        R1 = sc.nextInt();
        System.out.println("Masukkan R2: ");
        R2 = sc.nextInt();
        System.out.println("Masukkan R3: ");
        R3 = sc.nextInt();

        Rparalel = 1.0 / ((1.0/R1) + (1.0/R2) + (1.0/R3));
        System.out.println ("Masukkan R4: ");
        R4 = sc.nextInt();

        Rtotal = Rparalel + R4;
        System.out.println("Rtotal = " +Rtotal);
        System.out.println("Masukaan I; ");
        I = sc.nextInt();

        v = I * Rtotal;
        System.out.println("V =" +v);



    }
}