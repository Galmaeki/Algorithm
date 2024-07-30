import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        String[] a = br.readLine().split("/");

        int b = Integer.parseInt(a[0])+Integer.parseInt(a[2]);
        int d = Integer.parseInt(a[1]);
        System.out.println(b<d||d==0?"hasu":"gosu");
    }

}