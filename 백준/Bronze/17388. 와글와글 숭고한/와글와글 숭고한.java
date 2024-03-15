import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] uni = new int[3];
        int min = 101,ind=-1, sum = 0;
        uni[0] = Integer.parseInt(st.nextToken());
        uni[1] = Integer.parseInt(st.nextToken());
        uni[2] = Integer.parseInt(st.nextToken());


        for (int i = 0; i < 3; i++) {
            if(min>uni[i]){
                ind = i;
                min = uni[i];
            }
            sum+=uni[i];
        }

        if(sum>=100) System.out.println("OK");
        else {
            switch (ind){
                case 0 : System.out.println("Soongsil"); break;
                case 1 : System.out.println("Korea");break;
                default : System.out.println("Hanyang");
            }
        }
    }
}