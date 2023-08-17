import java.io.*;

public class Main{
 public static void main(String[] args) throws IOException{
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     String a = br.readLine();
     String[] answer = a.split(" ");
     int c= 0;
        for(String b:answer){
            if(!b.equals(""))
                c++;
        }
        System.out.println(c);
 }
}