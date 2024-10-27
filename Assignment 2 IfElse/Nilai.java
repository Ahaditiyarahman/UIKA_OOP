//package tugas2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Nilai {
    public static void main(String[] args) {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        String nilai = null;
        System.out.print("Masukkan Nilai anda :  ");
        try {
            nilai = bfr.readLine();
        } catch (IOException e){
            e.printStackTrace();
        }
        int Data = Integer.valueOf(nilai).intValue();
        if (Data >= 90 && Data <= 100){
            System.out.println("Grade A");
        } else if ( Data >= 80 && Data <= 89){
            System.out.println("Grade B");
        } else if ( Data >= 70 && Data <= 79){
            System.out.println("Grade C");
        } else if ( Data >= 60 && Data <=69){
            System.out.println("Grade D");
        } else if ( Data >=0 && Data < 60){
            System.out.println("Grade E");
        } else {
            System.out.println("Input tidak valid");
        }
    }
}

