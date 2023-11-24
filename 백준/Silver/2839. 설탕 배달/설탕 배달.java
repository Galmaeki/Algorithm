import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int target = Integer.parseInt(br.readLine());
        int ans;

        if (target%5==0) ans=target/5;
        else {
            ans = -1;
            for (int i = 1; i*5 < target; i++) {
                if((target-(i*5))%3==0) ans = i+((target-(i*5))/3);
            }
            if(ans==-1&&target%3==0) ans =  target/3;
        }

        System.out.println(ans);
    }
}