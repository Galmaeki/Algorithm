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

        String b = a
            .replace("c=","1")
            .replace("c-","1")
            .replace("dz=","1")
            .replace("d-","1")
            .replace("lj","1")
            .replace("nj","1")
            .replace("s=","1")
            .replace("z=","1");

        System.out.println(b.length());

    }

}