import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String st = br.readLine();

        int[] alpha = new int[26];

        for (int i = 0; i < alpha.length; i++) {
            alpha[i]=-1;
        }

        for(int i=0;i<st.length();i++){
            if(alpha[st.charAt(i)-97]==-1) {
                alpha[st.charAt(i) - 97] = i;
            }
        }

        for (int i : alpha) {
            sb.append(i).append(" ");
        }

        sb.setLength(sb.length()-1);
        System.out.println(sb);
    }
}