import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int rock = Integer.parseInt(br.readLine());
        System.out.println(rock%2==1?"CY":"SK");
    }
}