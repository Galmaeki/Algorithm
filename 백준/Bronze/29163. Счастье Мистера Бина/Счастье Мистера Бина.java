import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        Integer c = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int happy=0,sad =0;
        for (int i = 0; i <c; i++) {
            if(Integer.parseInt(st.nextToken())%2==0) happy++;
            else sad++;
        }

        System.out.println(happy>sad?"Happy":"Sad");
    }
}