import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long t=sc.nextLong();
        while(t-- > 0) {
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++) {
                a[i]=sc.nextInt(); 
            }
            Map<Integer,Integer> mp=new HashMap<>();
            for(int i=0;i<n;i++) {
                mp.put(a[i],mp.getOrDefault(a[i],0)+1); 
            }
            int freq=0;
            for(int val:mp.values()) {
                freq=Math.max(freq,val);
            }
            int op=0;
            while(freq<n) { 
                op++; 
                if(freq*2<=n) {
                    op+=freq; 
                    freq*=2;
                } 
                else {
                    op+=n-freq; 
                    freq=n;
                }
            }
            System.out.println(op);
        }
    }
}
 
// tc - O(nlog2(n)) = O(10^5*log2(10^5)) = O(2*10^6)
// sc - O(n) = O(10^5)