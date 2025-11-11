import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
boolean flag = false;
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        if(n==1){
            for (int i = 0; i < 7; i++) {
                int x = Integer.parseInt(st.nextToken());
                if(x!=i+2) flag = true;
            }

            System.out.println(flag?"mixed":"ascending");
        }else if(n==8){
            for (int i = 0; i < 7; i++) {
                int x = Integer.parseInt(st.nextToken());
                if(x!=7-i) flag = true;
            }

            System.out.println(flag?"mixed":"descending");
        }
        else System.out.println("mixed");
    }
}