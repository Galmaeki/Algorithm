import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int a =0;
        for (char c : br.readLine().toCharArray()) {
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') a++;
        }
        System.out.print(a);
    }
}
