import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int r = Integer.parseInt(br.readLine());

        for(int i=0;i<r;i++){
            int day = Integer.parseInt(br.readLine());
            int money = 0;

            for(int j=0;j<day;j++){
                int max = 0;

                String[] n = br.readLine().split(" ");

                for(String x:n){
                    int c = Integer.parseInt(x);
                    if(max<c)
                        max = c;
                }

                money+=max;
            }

            sb.append(money).append("\n");
        }

        System.out.println(sb);
    }
}