import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sbX = new StringBuilder(st.nextToken());
        StringBuilder sbY = new StringBuilder(st.nextToken());
        int X = Integer.parseInt(sbX.reverse().toString());
        int Y = Integer.parseInt(sbY.reverse().toString());
        StringBuilder sbA = new StringBuilder();
        sbA.append(X+Y);

        System.out.println(Integer.parseInt(sbA.reverse().toString()));
    }
}