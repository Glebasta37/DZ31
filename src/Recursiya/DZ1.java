package Recursiya;

public class DZ1 {
    public static void main(String[] args) {
        System.out.println(fib(10));
    }
    public  static int fib (int n) {
        if (n==0) return 0;
        if (n==1) return 1;
        return fib(n-2) + fib(n-1);

    }
}
