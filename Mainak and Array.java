import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            long[] v=new long[n];
            for(int i=0;i<n;i++)v[i]=sc.nextLong();
            long ans=v[n-1]-v[0];
            for(int i=1;i<n;i++)ans=Math.max(ans,v[i]-v[0]);
            for(int i=0;i<n-1;i++)ans=Math.max(ans,v[n-1]-v[i]);
            for(int i=0;i<n-1;i++)ans=Math.max(ans,v[i]-v[i+1]);
            System.out.println(ans);
        }
    }
}
 
// TC = O(n)
// SC = O(n)