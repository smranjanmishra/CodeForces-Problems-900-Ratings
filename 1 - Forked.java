import java.util.*;
 
public class Main {
    static int[] dx = {-1, 1, -1, 1};
    static int[] dy = {-1, -1, 1, 1};
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long a = sc.nextLong(), b = sc.nextLong();
            long x_king = sc.nextLong(), y_king = sc.nextLong();
            long x_queen = sc.nextLong(), y_queen = sc.nextLong();
            
            Set<String> king_hits = new HashSet<>();
            Set<String> queen_hits = new HashSet<>();
 
            for (int j = 0; j < 4; j++) { 
                king_hits.add((x_king + dx[j] * a) + "#" + (y_king + dy[j] * b));
                king_hits.add((x_king + dx[j] * b) + "#" + (y_king + dy[j] * a));
 
                queen_hits.add((x_queen + dx[j] * a) + "#" + (y_queen + dy[j] * b));
                queen_hits.add((x_queen + dx[j] * b) + "#" + (y_queen + dy[j] * a));
            }
 
            int ans = 0;
            for (String position : king_hits) 
                if (queen_hits.contains(position)) 
                    ans++;
 
            System.out.println(ans);
        }
    }
}
 
// tc - O(8*log2(8)) = O(8*3) = O(24)
// sc - O(8)