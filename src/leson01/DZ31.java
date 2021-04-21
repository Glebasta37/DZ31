package leson01;

public class DZ31 {
    public static void main(String[] args) {
        System.out.println(sun(20, 30));
        System.out.println(multy(20, 30));
        System.out.println(subt(20, 30));
        System.out.println(div(20, 30));
        System.out.println(convert(1));
        System.out.println(convert1(10));
        print("cocaty");


    }

    public static int sun(int n1, int n2) {
        int res = n1 + n2;
        return res;
    }

    public static int multy(int n1, int n2) {
        int res = n1 * n2;
        return res;

    }

    public static int subt(int n1, int n2) {
        int res = n2 - n1;
        return res;
    }

    public static int div(int n1, int n2) {
        int res = n1 / n2;
        return res;
    }

    public static double convert(int n1) {
        double res = n1 * 0.83;
        return res;
    }

    public static double convert1(int n1) {
        double res = n1 + n1 * 0.1;
        return res;
    }

    public static void print(String str) {
       String res = str;
        System.out.println(res);
        System.out.println(res);
        System.out.println(res);
        System.out.println(res);
    }

}


