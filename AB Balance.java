import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- > 0){
            String s=sc.next();
            int n=s.length();
            if(s.charAt(0)!=s.charAt(n-1)){
                char[] arr=s.toCharArray();
                if(arr[0]=='a')arr[0]='b';
                else arr[0]='a';
                s=new String(arr);
            }
            System.out.println(s);
        }
    }
}
