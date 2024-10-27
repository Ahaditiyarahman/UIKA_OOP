//package pertemuan_3;
import java.util.Scanner;

public class MainPersegi {
	//Main entry point
	public static void main	(String args[]) {
		
		//Create scanner untuk input
		Scanner input = new Scanner(System.in);
		//input panjang
		System.out.print("Masukkan panjang persegi = ");
		int panjang = input.nextInt();
		//input lebar
		System.out.print("Masukkan lebar persegi = ");
		int lebar = input.nextInt();
		
		System.out.println("Luas = " + persegi.luas(panjang,lebar));
		System.out.println("Keliling = " + persegi.keliling(panjang,lebar));
	}
}