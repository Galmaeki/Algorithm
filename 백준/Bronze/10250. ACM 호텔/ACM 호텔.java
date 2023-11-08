import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb =new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            StringTokenizer st =new StringTokenizer(br.readLine());
            int h = Integer.parseInt(st.nextToken());st.nextToken();
            int c = Integer.parseInt(st.nextToken());

            if (c%h ==0){
                    sb.append((h*100)+(c/h)).append("\n");
            }else{
                sb.append((c%h)*100+(c/h)+1).append("\n");
            }


        }

        System.out.println(sb);
    }
}