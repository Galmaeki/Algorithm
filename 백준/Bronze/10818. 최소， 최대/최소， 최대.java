import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        int max = -1000000;
        int min = 1000000;
        String[] read = br.readLine().split(" ");
        for (String a : read) {
            if (max < Integer.parseInt(a))
                max = Integer.parseInt(a);
            if (min > Integer.parseInt(a))
                min = Integer.parseInt(a);
        }
        System.out.println(min +" " + max);
    }
}