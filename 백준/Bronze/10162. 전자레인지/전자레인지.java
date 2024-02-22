import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int second = Integer.parseInt(br.readLine());
        int a=0,b=0,c=0;

        if(second>=300){
            a=second/300;
            second%=300;
        }
        if(second>=60){
            b=second/60;
            second%=60;
        }
        c=second/10;
        second%=10;

        if(second==0){
            System.out.println(a+" "+b+" "+c);
        }else{
            System.out.println(-1);
        }

    }
}