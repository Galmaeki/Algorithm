import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a= Integer.parseInt(br.readLine());
        for(int i =0;i<9;i++)
            System.out.println(a+" * "+(i+1)+" = "+(a*(i+1)));
    }
}