//package ahaditiyarahman;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("f(n) = f(n-1) + f(n-2)");
        System.out.print("n = ");
        int N = input.nextInt();
        for (int i = 0; i < N; i++) {
            System.out.print(fib(i) + " ");
        }
    }
    private static long fib(int n){
        if (n <= 1)
            return n;
        //fib(n) = fib(n-1) - fib(n-2)
        return fib(n - 1) + fib(n - 2);
    }
}