import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int count = Integer.parseInt(br.readLine());
        int cute = 0, notCute = 0;
        for (int i = 0; i < count; i++) {
            if (Integer.parseInt(br.readLine()) == 1) cute++;
            else notCute++;
        }
        System.out.println(cute > notCute ? "Junhee is cute!" : "Junhee is not cute!");
    }
}