import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[26];
        
        for (int i = 0; i < 26; i++) {
            arr[i] = -1;
        }

        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (arr[c - 'a'] == -1) {
                arr[c - 'a'] = i;
            }
        }

        Arrays.stream(arr).forEach(v -> sb.append(v).append(" "));

        System.out.println(sb);
    }
}

