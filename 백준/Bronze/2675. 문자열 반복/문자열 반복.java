import java.io.*;

public class Main{
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        for (int i = 0; i < count; i++) {
            solution(br.readLine());
        }
        System.out.println(sb);
        }

    private static void solution(String s) {
        String[] st = s.split(" ");
        for(int j = 0;j<st[1].length();j++){
            for (int i = 0; i < Integer.parseInt(st[0]); i++) {
                sb.append(st[1].charAt(j));
            }
        }
        sb.append("\n");
    }
}