import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] teams = new int[9];
        int rating = 1;
        boolean flag=false;
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        String[] lines = new String[r];

        for (int i = 0; i < r; i++) {
            lines[i] = br.readLine();
        }

        for (int j = c-2; j > 0; j--) {
            for (int i = 0; i < r; i++) {
                char w = lines[i].charAt(j);
                if(w !='.'&&teams[w-49]==0){
                    teams[w-49]= rating;
                    flag = true;
                }
            }

            if(flag){
                rating++;
                flag = false;
            }
                }

        for (int team : teams) {
            System.out.println(team);
        }
    }
}