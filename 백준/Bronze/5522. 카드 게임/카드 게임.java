import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int a = 0;
        for (int i = 0; i < 5; i++) {
            a+=Integer.parseInt(br.readLine());
        }

        System.out.println(a);
    }
}