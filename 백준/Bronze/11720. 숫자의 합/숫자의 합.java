import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        int sum = 0;
        char[] ch = br.readLine().toCharArray();
        for (char c:ch) {
            sum+=(c-48);
        }
        System.out.println(sum);
        }
}