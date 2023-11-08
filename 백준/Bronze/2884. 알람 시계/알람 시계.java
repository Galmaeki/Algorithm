import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb =new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int hou=Integer.parseInt(st.nextToken());
        int min=Integer.parseInt(st.nextToken())-45;

        if(min<0){
            min+=60;
            hou--;
        }

        if(hou<0)
            hou+=24;

        System.out.println(hou+" "+min);
    }
}