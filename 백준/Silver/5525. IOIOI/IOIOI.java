import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb1 = new StringBuilder();
        int answer =0;
        sb1.append("I");

        int ioi = Integer.parseInt(br.readLine());
        br.readLine();
        String target = br.readLine();

        for (int i = 0; i < ioi; i++) {
            sb1.append("O").append("I");
        }

        String a = sb1.toString();

        for (int i = 0; i < target.length(); i++) {
            if(target.substring(i,target.length()).startsWith(a)) answer++;
            if(target.substring(i,target.length()).length()<a.length()) break;
        }

        System.out.println(answer);
    }
}