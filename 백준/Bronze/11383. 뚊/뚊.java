import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static         boolean check = false;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        String[] target = new String[a];
        String[] answer = new String[a];

        for (int i = 0; i < a; i++) {
            target[i]=br.readLine();
        }

        for (int i = 0; i < a; i++) {
            answer[i]=br.readLine();
        }

        for (int i = 0; i < a; i++) {
            check(target[i],answer[i]);
        }

        sb.append(!check?"Eyfa":"Not Eyfa");
        System.out.println(sb);
    }

    private static void check(String target,String answer) {
        char[] t = target.toCharArray();
        char[] a = answer.toCharArray();

        for (int i = 0; i < t.length; i++) {
            if(t[i]!=a[i*2]||t[i]!=a[i*2+1])
            {check = true;
                break;
            }
        }

    }

}