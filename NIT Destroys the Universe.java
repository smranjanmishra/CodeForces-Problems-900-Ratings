import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            long n = sc.nextLong();
            long[] a = new long[(int)n];
            for(int i=0;i<n;i++) a[i]=sc.nextLong();
 
            int countZero=0;
            for(int i=0;i<n;i++) {
                if(a[i]==0) countZero++;
            }
 
            boolean foundZero=false;
            int left=0,right=(int)n-1;
            while(left<n && a[left]==0) left++;
            while(right>=0 && a[right]==0) right--;
 
            for(int i=left;i<=right;i++) {
                if(a[i]==0) foundZero=true;
            }
 
            if(countZero==n) System.out.println(0);
            else if(!foundZero) System.out.println(1);
            else System.out.println(2);
        }
    }
}

// TC : O(n)
// SC : O(n)