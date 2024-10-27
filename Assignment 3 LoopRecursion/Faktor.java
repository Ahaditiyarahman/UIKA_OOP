//package ahaditiyarahman;
import java.util.Scanner;
public class Faktor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int angka = input.nextInt();
        int i = 1;
        while( i <= angka){
            if (angka % i == 0){
                System.out.print(i + " ");
            }
            i++;
        }
    }
}