import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] answers = new int[10];
        int a,b,c;
        a=Integer.parseInt(br.readLine());
        b=Integer.parseInt(br.readLine());
        c=Integer.parseInt(br.readLine());
        int mul = a*b*c;
        String str = ""+mul;
        char[] arr = str.toCharArray();
        for(char ch:arr){
            answers[ch-48]++;
        }
        for(int nu:answers){
            System.out.println(nu);
        }
    }
}