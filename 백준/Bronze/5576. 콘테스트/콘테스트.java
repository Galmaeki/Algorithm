import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> W = new ArrayList<>();
        ArrayList<Integer> K = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            W.add(Integer.parseInt(br.readLine()));
        }
        for (int i = 0; i < 10; i++) {
            K.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(W);
        Collections.sort(K);

        System.out.println(W.get(9)+W.get(8)+W.get(7)+" "+(K.get(9)+K.get(8)+K.get(7)));
    }
}