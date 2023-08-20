import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a,b,c;
        a= Integer.parseInt(br.readLine());
        b= Integer.parseInt(br.readLine());
        c= Integer.parseInt(br.readLine());
        if((a+b+c)!=180){System.out.println("Error");}
        else if(a!=b&&b!=c&&a!=c){System.out.println("Scalene");}
        else if(a==b&&b==c){System.out.println("Equilateral");}
        else {System.out.println("Isosceles");}
    }
}