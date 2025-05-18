import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0) {
            long n = sc.nextLong();
            String s = sc.next();
            long maxLen = 1;
            long currLen = 1;
 
            for(int i=1; i<n; i++) {
                if(s.charAt(i) == s.charAt(i-1)) {
                    currLen++;
                } 
                else {
                    maxLen = Math.max(maxLen, currLen);
                    currLen = 1;
                }
            }
 
            maxLen = Math.max(maxLen, currLen);
            System.out.println(maxLen + 1);
            t--;
        }
    }
}
 
// tc - O(n) = O(100)
// sc - O(n) = O(100)