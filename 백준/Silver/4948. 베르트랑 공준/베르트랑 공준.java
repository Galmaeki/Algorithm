import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[] primeN = new boolean[250000];

        primeN[0]=true;
        primeN[1]=true;

        for (int i = 2; i*i <= 249999; i++) {
            if(primeN[i]) continue;

            for (int j = i*i; j <= 249999; j+=i) {
                primeN[j]=true;
            }
        }

        String str = br.readLine();
        while(!str.equals("0")){
            int N = Integer.parseInt(str);
            int a = 0;

            for (int i = N+1; i <= N * 2; i++) {
                if(!primeN[i]) a++;
            }
            sb.append(a).append("\n");

            str = br.readLine();
        }

        System.out.println(sb);
    }
}