import java.io.*;
import java.util.*;

public class cp1 {
    static long gcd(long a, long b) {
        while (b != 0) {
            long temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            long[] v = new long[n];

            for (int i = 0; i < n; i++) {
                v[i] = sc.nextLong();
            }
            if (n == 1) {
                System.out.println(v[0]);
            } else {
                System.out.println(gcd(v[0], v[n - 1]));
            }
        }
        sc.close();
    }
}