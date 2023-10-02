import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int hour = Integer.parseInt(st.nextToken());
        int min =  Integer.parseInt(st.nextToken());

        int addMin = Integer.parseInt(br.readLine());

        hour+=addMin/60;

        min+=addMin%60;
        if(min>=60){
            hour++;
            min-=60;
        }

        if(hour>=24){
            hour=hour%24;
        }

        System.out.println(hour+" "+min);
    }
}