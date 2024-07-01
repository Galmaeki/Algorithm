import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {

    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int[] board;
    static HashSet<Integer> diagonal1;
    static HashSet<Integer> diagonal2;
    static Integer n;
    static int ans = 0;
    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());
        board = new int[n];
        int[] arr = new int[n];

        solution(0);

        System.out.println(ans);
    }

    private static void solution(int i) {
        if(i == n){
            ans++;
            return;
        }
        for (int j = 0; j < n; j++) {
            board[i] = j;
            if(check(i)){
                solution(i+1);
            }
        }
    }

    private static boolean check(int i) {
        for (int j = 0; j < i; j++) {
            if(board[j]==board[i]) return false;
            else if(Math.abs(i-j) == Math.abs(board[i]-board[j])) return false;
        }
        return true;
    }
}