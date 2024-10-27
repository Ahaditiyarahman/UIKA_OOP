//package pertemuan_3;

public class persegi {
	//Attribute
	int panjang;
	int lebar;
	
	//Method menghitung Luas
	public static int luas(int panjang, int lebar) {
		int hitungLuas = panjang * lebar;
		return hitungLuas;
	}
	
	//Method menghitung Keliling
	public static int keliling (int panjang, int lebar) {
		int hitungKeliling = 2 * (panjang + lebar);
		return hitungKeliling;
	}
}