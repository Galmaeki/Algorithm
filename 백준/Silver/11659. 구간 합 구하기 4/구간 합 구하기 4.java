import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int nums = Integer.parseInt(st.nextToken());
        int count = Integer.parseInt(st.nextToken());
        int[] sums = new int[nums+1];
        sums[0]=0;

        StringTokenizer st2 = new StringTokenizer(br.readLine());

        for (int i = 0; i < nums; i++) {
            sums[i+1]=sums[i]+Integer.parseInt(st2.nextToken());
        }

        for (int i = 0; i < count; i++) {
            StringTokenizer st3 = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st3.nextToken());
            int end = Integer.parseInt(st3.nextToken());

            if(start==1){
                sb.append(sums[end]);
            }else{
                sb.append(sums[end]-sums[start-1]);
            }
            sb.append("\n");
        }

        sb.setLength(sb.length()-1);
        System.out.println(sb);
    }
}