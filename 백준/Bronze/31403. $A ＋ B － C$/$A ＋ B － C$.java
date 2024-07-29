import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        String a = br.readLine();
        String b = br.readLine();
        String c= br.readLine();

        System.out.println(Integer.parseInt(a)+Integer.parseInt(b)-Integer.parseInt(c));
        System.out.println(Integer.parseInt(a+b) - Integer.parseInt(c));

    }

}