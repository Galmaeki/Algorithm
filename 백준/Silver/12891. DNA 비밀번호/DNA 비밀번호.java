import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int[] arr = {0, 0, 0, 0};
    static int[] check = {0, 0, 0, 0};

    public static void main(String[] args) throws IOException {
        int answer = 0;
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int strLength = Integer.parseInt(st1.nextToken());
        int size = Integer.parseInt(st1.nextToken());
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int start = -1, end = size - 1;


        for (int i = 0; i < 4; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < strLength - size + 1; i++) {
            if (i == 0) {
                for (int j = 0; j < size; j++) {
                    checkerAdd(str.charAt(j));
                }
            } else {
                checkerSub(str.charAt(start));
                checkerAdd(str.charAt(end));
            }

            if (checkArray()) answer++;

            start++;
            end++;
        }

        System.out.println(answer);
    }

    private static boolean checkArray() {
        for (int i = 0; i < 4; i++) {
            if (arr[i] > check[i]) return false;
        }
        return true;
    }

    private static void checkerAdd(char c) {
        if (c == 'A') check[0]++;
        else if (c == 'C') check[1]++;
        else if (c == 'G') check[2]++;
        else if (c == 'T') check[3]++;
    }

    private static void checkerSub(char c) {

        if (c == 'A') check[0]--;
        else if (c == 'C') check[1]--;
        else if (c == 'G') check[2]--;
        else if (c == 'T') check[3]--;
    }
}