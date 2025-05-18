import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long t=sc.nextLong();
        while(t-- >0){
            long n=sc.nextLong();
            if(n<4 || n%2==1) System.out.println(-1);
            else{
                long minBuses=(n+5)/6;
                long maxBuses=n/4;
                System.out.println(minBuses+" "+maxBuses);
            }
        }
    }
}

// TC : O(1)
// SC : O(1)