import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int happy = 0, sad = 0;

        String str = br.readLine();

        if (str.length() < 3) System.out.println("none");
        else {
            for (int i = 0; i < str.length() - 2; i++) {
                String t = str.substring(i, i + 3);
                if (t.equals(":-)")) happy++;
                if (t.equals(":-(")) sad++;
            }

            if (happy == sad && happy != 0) System.out.println("unsure");
            else if (happy == sad && happy == 0) System.out.println("none");
            else if (happy > sad) System.out.println("happy");
            else System.out.println("sad");
        }
    }
}