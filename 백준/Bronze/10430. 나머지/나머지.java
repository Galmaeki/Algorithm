import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int a,b,c;
        a= Integer.parseInt(str[0]);
        b= Integer.parseInt(str[1]);
        c= Integer.parseInt(str[2]);
        System.out.println((a+b)%c);
        System.out.println(((a%c) + (b%c))%c);
        System.out.println((a*b)%c);
        System.out.println( ((a%c) * (b%c))%c);
    }
}