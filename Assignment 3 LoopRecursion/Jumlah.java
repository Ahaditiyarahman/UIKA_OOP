//package ahaditiyarahman;
import java.util.Scanner;
public class Jumlah {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int input;
        do {
            System.out.print("Masukkan angka (0 untuk berhenti) : ");
            input = sc.nextInt();
            total = total + input;
        } while (input != 0 );
        System.out.println("Total dari angka yang dimasukkan adalah : " + total);
    }
}