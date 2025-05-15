import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            long x = sc.nextLong();
 
            long minSum = (k * (k + 1)) / 2;
            long maxSum = (n * (n + 1)) / 2 - ((n - k) * (n - k + 1)) / 2;
 
            if (x >= minSum && x <= maxSum) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
 
// tc - O(1)
// sc - O(1)    