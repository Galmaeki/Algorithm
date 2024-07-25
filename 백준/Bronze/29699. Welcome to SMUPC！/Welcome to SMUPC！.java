import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());

        String a = "WelcomeToSMUPC";

        try {
            System.out.println(a.charAt(n%14-1));
        }catch (Exception e){
            System.out.println("C");
        }
    }
}