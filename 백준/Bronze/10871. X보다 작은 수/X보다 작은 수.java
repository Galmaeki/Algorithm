import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());

        StringTokenizer st1 = new StringTokenizer(br.readLine());

        for (int i = 0; i < count; i++) {
            int num = Integer.parseInt(st1.nextToken());
            if(num<target){
                sb.append(num).append(" ");
            }
        }

        sb.setLength(sb.length()-1);
        System.out.println(sb);
    }
}