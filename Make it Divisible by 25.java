import java.util.*;

public class Main {
    static int minOperations(String n, String target) {
        int ops=0;
        int j=target.length()-1;
        for(int i=n.length()-1;i>=0;i--){
            if(n.charAt(i)==target.charAt(j)){
                j--;
                if(j<0)break;
            }else ops++;
        }
        if(j>=0)ops=Integer.MAX_VALUE;
        return ops;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- > 0){
            String n=sc.next();
            String[] targets={"00","25","50","75"};
            int ans=Integer.MAX_VALUE;
            for(String target:targets)
                ans=Math.min(ans,minOperations(n,target));
            System.out.println(ans);
        }
    }
}