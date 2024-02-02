import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> al1 = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();
        int a = 0;

        for (int i = 0; i < 4; i++) {
            al1.add(Integer.parseInt(br.readLine()));
        }

        for (int i = 0; i < 2; i++) {
            al2.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(al1);
        Collections.sort(al2);

        a+=al1.get(1);
        a+=al1.get(2);
        a+=al1.get(3);
        a+=al2.get(1);

        System.out.println(a);
    }
}