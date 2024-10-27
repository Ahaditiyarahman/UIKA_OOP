//package ahaditiyarahman;
import java.util.Scanner;
public class FaktorialRekursif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int input = sc.nextInt();
        System.out.println(input + "! = " + faktorial(input));
    }
    private static int faktorial(int n){
        if (n == 0 || n == 1){
            return 1;
        }
        return n * faktorial(n-1);
    }
}