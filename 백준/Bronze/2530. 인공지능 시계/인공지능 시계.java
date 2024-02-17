import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());

        int addS = Integer.parseInt(br.readLine());

        h += addS / 3600;
        addS %= 3600;
        m += addS / 60;
        s += addS % 60;

        if (s >= 60) {
            s -= 60;
            m++;
        }
        if(m>=60){
            m-=60;
            h++;
        }
        if(h>=24){
            h%=24;
        }
        System.out.println(h + " " + m + " " + s);
    }
}