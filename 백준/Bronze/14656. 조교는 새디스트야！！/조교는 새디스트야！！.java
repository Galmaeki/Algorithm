import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        int answer = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<count;i++){
            if(!(Integer.parseInt(st.nextToken())==i+1)){
                answer++;
            }
        }

        System.out.println(answer);
    }
}