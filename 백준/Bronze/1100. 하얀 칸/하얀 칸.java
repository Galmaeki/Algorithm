import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int answer = 0;
        boolean startWhite = true;
        for (int i = 0; i < 8; i++) {
            String board = br.readLine();
            boolean white = startWhite;

            for (int j = 0; j < 8; j++) {
                if(white&&board.charAt(j)=='F') answer++;
                white=!white;
            }
            startWhite=!startWhite;
        }
        System.out.println(answer);
    }
}