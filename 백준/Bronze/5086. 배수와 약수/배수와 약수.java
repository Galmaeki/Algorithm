import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    //18258 큐
    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        solution();
        System.out.println(sb);
    }

    private static void solution() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        if(x==y&&x==0) return;
        else {
            if(y%x==0){
                sb.append("factor").append("\n");
            }else if(x%y==0){
                sb.append("multiple").append("\n");
            }else{
                sb.append("neither").append("\n");
            }
            solution();
        }
    }
}