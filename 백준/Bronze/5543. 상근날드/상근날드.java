import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int burger = 2001;
        int drink = 2001;

        int price;
        for (int i = 0; i < 3; i++) {
            price = Integer.parseInt(br.readLine());
            if(burger>price) burger = price;
        }

        price = 2001;

        for (int i = 0; i < 2; i++) {
            price = Integer.parseInt(br.readLine());
            if(drink>price) drink = price;
        }


        System.out.println(burger+drink-50);
    }
}