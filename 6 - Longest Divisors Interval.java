import java.util.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        BigInteger[] lcm = new BigInteger[61];
        lcm[1] = BigInteger.ONE;
        for(int i = 2; i <= 60; i++) {
            lcm[i] = lcm[i - 1].multiply(BigInteger.valueOf(i)).divide(lcm[i - 1].gcd(BigInteger.valueOf(i)));
        }

        while(t-- > 0) {
            BigInteger n = new BigInteger(sc.next());
            int ans = 1;
            for(int i = 1; i <= 60; i++) {
                if(n.mod(lcm[i]).equals(BigInteger.ZERO)) {
                    ans = i;
                }
            }
            System.out.println(ans);
        }
    }
}

// tc - O(1)
// sc - O(1)