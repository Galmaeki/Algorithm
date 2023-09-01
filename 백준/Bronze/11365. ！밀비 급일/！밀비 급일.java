import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true){
            String str = br.readLine();
            int a=str.length()-1;
            if(str.equals("END")){
                break;
            }

            for(int i=a;i>=0;i--){
                sb.append(str.charAt(i));
                if(i==0){
                    sb.append("\n");
                }
            }
        }
        System.out.println(sb.substring(0,sb.length()-1));
    }
}