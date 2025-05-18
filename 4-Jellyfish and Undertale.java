import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            int n = sc.nextInt();
            long[] x = new long[n];
            for (int i = 0; i < n; i++) { 
                x[i] = sc.nextLong();
            }
 
            long maxTime = b;
            for (int i = 0; i < n; i++) { 
                maxTime += Math.min(x[i], a - 1);
            }
 
            System.out.println(maxTime);
        }
    }
}
 
// tc - O(n) 
// sc - O(n) 