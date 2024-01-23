import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String str = br.readLine();
        while (!str.equals("# 0 0")) {
            boolean isJunior = true;
            String[] arr = str.split(" ");
            if (Integer.parseInt(arr[1]) > 17) isJunior = false;
            if (Integer.parseInt(arr[2]) >= 80) isJunior = false;

            sb.append(arr[0]).append(" ").append(isJunior ? "Junior" : "Senior").append("\n");
            str = br.readLine();
        }

        System.out.print(sb);
    }
}