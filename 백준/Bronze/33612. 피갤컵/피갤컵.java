import java.io.*;

public class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = (Integer.parseInt(br.readLine())-1)*7;
        
        int year = 2024, mon = 8+n;
        year +=(mon-1)/12;
        mon =(mon-1)%12+1;
        System.out.println(year+" "+mon);
    }
}