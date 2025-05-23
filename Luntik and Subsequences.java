import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- > 0) {
            int n=sc.nextInt();
            long[] a=new long[n];
            for(int i=0;i<n;i++)a[i]=sc.nextLong();
            int ones=0,zeros=0;
            for(int i=0;i<n;i++){
                if(a[i]==1)ones++;
                else if(a[i]==0)zeros++;
            }
            long ways=(long)Math.pow(2,zeros)*ones;
            System.out.println(ways);
        }
    }
}