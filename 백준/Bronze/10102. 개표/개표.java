import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        br.readLine();
        int a=0,b=0;

        String str = br.readLine();

        for (char c : str.toCharArray()) {
            if(c=='A') a++;
            else b++;
        }

        if(a>b) System.out.println("A");
        else if (a<b) System.out.println("B");
        else System.out.println("Tie");

    }
}