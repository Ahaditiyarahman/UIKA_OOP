//package ahaditiyarahman;
import java.util.Scanner;
public class ReverseArray {
    static int[] Array = new int[10];
    static int PanjangArray = 10;
    public static void main(String[] args) {
        for (int i=0; i<PanjangArray; i++){
            System.out.print("Masukkan angka ke-" + (i+1) + ": ");
            Array[i] = inputAngka();
        }
        System.out.print("Array dalam urutan asli : ");
        for (int j=0; j<PanjangArray; j++){
            System.out.print(Array[j] + (" "));
        }
        terbalik(Array, PanjangArray);
    }
    static void terbalik(int[] Array, int PanjangArray){
        int i, k, t;
        for (i=0; i<PanjangArray/2; i++){
            t = Array[i];
            Array[i] = Array[PanjangArray - i - 1];
            Array[PanjangArray - i - 1 ] = t;
        }
        System.out.print("\nArray dalam urutan terbalik : ");
        for (k=0; k<PanjangArray; k++){
            System.out.print(Array[k] + " ");
        }
    }
    static int inputAngka(){
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}