import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int a,b;
        a= Integer.parseInt(br.readLine());
        b= Integer.parseInt(br.readLine());
        System.out.println(a*b);
    }
}