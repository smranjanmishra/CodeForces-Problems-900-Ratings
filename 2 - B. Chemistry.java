import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
 
        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            String s = sc.next();
 
            int[] freq = new int[26];
            for (int i = 0; i < n; i++) { // n
                freq[s.charAt(i) - 'a']++;
            }
 
            long odd = 0;
            for (int i = 0; i < 26; i++) { // 26
                if (freq[i] % 2 != 0) {
                    odd++;
                }
            }
 
            if (odd > k + 1) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
 
// tc - O(n)
// sc - O(n)