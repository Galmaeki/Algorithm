import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        String s = br.readLine();

        s = s.replace("C","");
        s = s.replace("A","");
        s = s.replace("M","");
        s = s.replace("B","");
        s = s.replace("R","");
        s = s.replace("I","");
        s = s.replace("D","");
        s = s.replace("G","");
        s = s.replace("E","");

        System.out.println(s);
    }
}