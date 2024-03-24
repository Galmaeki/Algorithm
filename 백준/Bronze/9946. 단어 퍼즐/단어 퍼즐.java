import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int caseCount = 1;

    public static void main(String[] args) throws IOException {
        String str;
        while(!(str = br.readLine()).equals("END")){
            String target = br.readLine();
            solution(str,target);
        }
        System.out.println(sb);
    }

    private static void solution(String main, String target){
        int[] mains = new int[26];
        int[] targets = new int[26];

        for(char c : main.toCharArray()){
            mains[c-'a']++;
        }
        for (char c : target.toCharArray()) {
            targets[c-'a']++;
        }

        sb.append("Case ").append(caseCount).append(": ");
        if(Arrays.equals(mains,targets)){
            sb.append("same");
        }else{
            sb.append("different");
        }
        sb.append("\n");
        caseCount++;
    }
}