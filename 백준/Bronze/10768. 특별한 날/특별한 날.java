import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
       Date d = new Date(2024,2,18);

        if(d.compareTo(new Date(2024,a,b))<0) System.out.println("After");
        else if(d.compareTo(new Date(2024,a,b))==0) System.out.println("Special");
        else System.out.println("Before");
    }
}