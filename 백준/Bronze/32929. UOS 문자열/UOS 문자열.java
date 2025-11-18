import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        long n = Long.parseLong(br.readLine())%3;
        
        if(n==0) System.out.println("S");
        else if (n==1) System.out.println("U");
        else if (n==2) System.out.println("O");
    }
}

