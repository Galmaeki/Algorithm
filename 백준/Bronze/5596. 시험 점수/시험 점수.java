import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int minkuk = 0;
        int manse = 0;
        StringTokenizer minst = new StringTokenizer(br.readLine());
        StringTokenizer manst = new StringTokenizer(br.readLine());

        for (int i = 0; i < 4; i++) {
            minkuk+=Integer.parseInt(minst.nextToken());
        }

        for (int i = 0; i < 4; i++) {
            manse+=Integer.parseInt(manst.nextToken());
        }

        System.out.println(minkuk<manse?manse:minkuk);
    }
}