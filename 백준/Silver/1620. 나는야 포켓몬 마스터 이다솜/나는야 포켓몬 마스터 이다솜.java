import java.io.*;
import java.util.*;

public class Main{
    static int a = 0;
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        HashMap<String,Integer > hm = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int index = Integer.parseInt(st.nextToken());
        int quest = Integer.parseInt(st.nextToken());
        String[] pokemons = new String[index+1];

        for (int i = 0; i < index; i++) {
            String s = br.readLine();
            pokemons[i+1] = s;
            hm.put(s,i+1);
        }

        for (int i = 0; i < quest; i++) {
            String s = br.readLine();

            if(isNumber(s)){
                sb.append(pokemons[a]).append("\n");
            }else{
                sb.append(hm.get(s)).append("\n");
            }
        }
        
        sb.setLength(sb.length()-1);

        System.out.println(sb);
    }

    public static boolean isNumber(String s){
        try{
            a=Integer.parseInt(s);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}