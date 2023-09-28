import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String str = br.readLine();
            if(str.equals("0"))
                break;

            check(str);
        }
        
        sb.setLength(sb.length()-1);
        
        System.out.println(sb);
    }

    private static void check(String str) {
        char[] c = str.toCharArray();
        boolean sw = true;

        for (int i = 0; i < c.length / 2; i++) {
            if(!(c[i]==c[c.length-1-i])){
                sw=false;
                break;
            }
        }

        sb.append(sw?"yes":"no").append("\n");
    }
}