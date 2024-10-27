//package tugas2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Olahraga {
    public static void main(String[] args) {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        String Berat = null;
        String Tinggi = null;
        try {
            System.out.print("Masukkan berat anda : ");
            Berat = bfr.readLine();
            System.out.print("Masukkan tinggi anda : ");
            Tinggi = bfr.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int BeratBadan = Integer.valueOf(Berat).intValue();
        int TinggiBadan = Integer.valueOf(Tinggi).intValue();
        if (BeratBadan >= 80 && TinggiBadan >= 150){
            System.out.println("Olahraga angkat berat");
        } else if (BeratBadan >= 80 && TinggiBadan < 150){
            System.out.println("Olahraga sepeda");
        } else if (BeratBadan < 80 && TinggiBadan >= 150){
            System.out.println("Olahraga renang");
        } else if (BeratBadan < 80 && TinggiBadan < 150) {
            System.out.println("Olahraga senam");
        } else {
            System.out.println("Input tidak valid");
        }
    }
}
