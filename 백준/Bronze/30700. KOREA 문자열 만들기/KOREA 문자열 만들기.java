import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char arr[] = {'K','O','R','E','A'};
        int n = 0;
        int answer = 0;
        for (char c : br.readLine().toCharArray()) {
            if(arr[n]==c){
                if(n<4){
                    n++;
                }else{
                    n=0;
                }
                answer++;
            }
        }

        System.out.print(answer);
    }
}
