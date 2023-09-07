import java.io.*;
import java.util.*;

public class Main {
    static int[] count = {0, 0};
    static boolean isWhite = true;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] board = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};

        String[] boards = new String[board[0]];

        for (int i = 0; i < board[0]; i++) {
            boards[i] = br.readLine();
        }

        int result = 2000000000;

        isWhite = true;
        for (int i = 0; i <= board[0] - 8; i++) {
            for (int j = 0; j <= board[1] - 8; j++) {
                int count1 = boardCheck(boards, i, j);
                result = result<count1?result:count1;
            }
        }

        isWhite = false;
        for (int i = 0; i <= board[0] - 8; i++) {
            for (int j = 0; j <= board[1] - 8; j++) {
                int count2 = boardCheck(boards, i, j);
                result = result<count2?result:count2;
            }
        }

        System.out.println(result);
    }

    static int boardCheck(String[] boards, int x, int y) {
        int count = 0;
        boolean start = isWhite;

        for (int i = x; i < x + 8; i++) {
            for (int j = y; j < y + 8; j++) {
                if (!cellCheck(boards[i].charAt(j), start)) {
                    count++;
                }
                start = !start;
            }
            start = !start;
        }

        return count;
    }

    static boolean cellCheck(char c, boolean start) {
        boolean r = true;
        switch (c) {
            case 'W':
                if (start) {
                    r = true;
                } else {
                    r = false;
                }
                break;
            default:
                if (start) {
                    r = false;
                } else {
                    r = true;
                }
                break;
        }
        return r;
    }
}