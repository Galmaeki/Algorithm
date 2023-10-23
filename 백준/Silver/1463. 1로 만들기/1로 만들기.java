import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int start = Integer.parseInt(br.readLine());
        int answers[] = new int [start+1];

        for (int i = 2; i <= start; i++) {
            answers[i] = answers[i-1]+1;
            if(i%3==0)
                answers[i]= Math.min(answers[i],answers[i/3]+1);
            if(i%2==0)
                answers[i]= Math.min(answers[i],answers[i/2]+1);

        }
        
        System.out.println(answers[start]);
    }
}