import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            boolean ans = false;

            long newA = 2 * b - c;
            if (newA > 0 && newA % a == 0) {
                ans = true;
            }

            long newB = (a + c) / 2;
            if ((c - a) % 2 == 0 && newB > 0 && newB % b == 0) {
                ans = true;
            }

            long newC = 2 * b - a;
            if (newC > 0 && newC % c == 0) {
                ans = true;
            }

            if (ans) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}