//package ahaditiyarahman;
import java.util.Scanner;
public class AvgArray {
    public static void main(String[] args) {
        System.out.print("Masukkan jumlah elemen array : ");
        int Ukuran = inputAngka();
        int[] Array = new int[Ukuran];
        for (int i=0; i < Ukuran; i++) {
            System.out.print("Masukkan elemen ke-" + (i + 1) + ": ");
            Array[i] = inputAngka();
        }
        Average(Array, Ukuran);
    }
    static void Average(int[] Array, int Ukuran){
        double average = 0.0;
        for (int avg=0; avg<Ukuran; avg++){
            average = average + Array[avg];
        }
        average = average / Ukuran;
        System.out.println("Rata-rata: " + average);
        System.out.print("Nilai lebih besar dari rata-rata: ");
        for (int i=0; i<Ukuran;i++){
            if (Array[i] > average){
                System.out.print(Array[i] + " ");
            }
        }
    }
    static int inputAngka(){
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}