import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        int max = 0,mel = 0;

        max +=Integer.parseInt(st1.nextToken())*3;
        max +=Integer.parseInt(st1.nextToken())*20;
        max +=Integer.parseInt(st1.nextToken())*120;
        mel +=Integer.parseInt(st2.nextToken())*3;
        mel +=Integer.parseInt(st2.nextToken())*20;
        mel +=Integer.parseInt(st2.nextToken())*120;

        if (max > mel) System.out.println("Max");
        else if (max < mel) System.out.println("Mel");
        else System.out.println("Draw");
    }
}