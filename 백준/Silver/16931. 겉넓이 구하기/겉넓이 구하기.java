import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int x;
    static int y;
    static int a;
    static int[][] square;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());

        square = new int[x][y];
        for (int i = 0; i < x; i++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());

            for (int j = 0; j < y; j++) {
                square[i][j] = Integer.parseInt(st1.nextToken());
            }
        }

        front();
        back();
        left();
        right();
        top();

        System.out.println(a);
    }

    private static void right() {
        int last;
        for (int i = x; i > 0; i--) {
            last = 0;
            for (int j = y; j > 0; j--) {
                if (square[i-1][j-1] > last) {
                    int big = square[i-1][j-1] > last ? square[i-1][j-1] - last : last - square[i-1][j-1];
                    a += big;
                }
                last = square[i-1][j-1];
            }
        }
    }

    private static void front() {
        int last;
        for (int i = 0; i < y; i++) {
            last = 0;
            for (int j = 0; j < x; j++) {
                if (square[j][i] > last) {
                    int big = square[j][i] > last ? square[j][i] - last : last - square[j][i];
                    a += big;
                }
                last=square[j][i];
            }
        }
    }

    private static void back() {
        int last;
        for (int i = y; i > 0; i--) {
            last = 0;
            for (int j = x; j > 0; j--) {
                if (square[j - 1][i - 1] > last) {
                    int big = square[j-1][i-1] > last ? square[j-1][i-1] - last : last - square[j-1][i-1];
                    a += big;
                }
                last=square[j-1][i-1];
            }
        }
    }

    private static void left() {
        int last;
        for (int i = 0; i < x; i++) {
            last = 0;
            for (int j = 0; j < y; j++) {
                if (square[i][j] > last) {
                    int big = square[i][j] > last ? square[i][j] - last : last - square[i][j];
                    a += big;
                }
                last = square[i][j];
            }
        }
    }

    private static void top() {
        int top = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (square[i][j] != 0) top++;
            }
        }

        a += top * 2;
    }
}
