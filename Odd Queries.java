import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            long n = sc.nextLong();
            long q = sc.nextLong();
            long[] a = new long[(int) n];
 
            for (int i = 0; i < n; i++) // n
                a[i] = sc.nextLong();
 
            long oldSum = 0;
            for (int i = 0; i < n; i++) // n
                oldSum += a[i];
 
            long[] prefixSum = new long[(int) n + 1];
            for (int i = 1; i <= n; i++) // n
                prefixSum[i] = prefixSum[i - 1] + a[i - 1];
 
            while (q-- > 0) // q
            {
                long l = sc.nextLong();
                long r = sc.nextLong();
                long k = sc.nextLong();
 
                long sumToRemove = prefixSum[(int) r] - prefixSum[(int) l - 1];
                long sumToAdd = (r - l + 1) * k;
                long totalSum = oldSum - sumToRemove + sumToAdd;
 
                if (totalSum % 2 == 1)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
        }
    }
}


// tc - O(n+q) 
// sc - O(n)