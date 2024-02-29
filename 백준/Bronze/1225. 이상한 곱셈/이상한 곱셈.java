import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        long answer = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());

        char[] A = st.nextToken().toCharArray();
        char[] B = st.nextToken().toCharArray();

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                answer+=(A[i]-'0')*(B[j]-'0');
            }
        }

        System.out.println(answer);
    }
}