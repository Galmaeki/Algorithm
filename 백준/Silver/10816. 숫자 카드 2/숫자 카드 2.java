import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> cards = new ArrayList<>();
        HashMap<Integer,Integer> hm = new HashMap<>();

        br.readLine();
        StringTokenizer st1 = new StringTokenizer(br.readLine());

        while(st1.hasMoreTokens()){
            cards.add(Integer.parseInt(st1.nextToken()));
        }

        for (Integer card : cards) {
            hm.put(card,hm.getOrDefault(card,0)+1);
        }

        br.readLine();

        StringTokenizer st2 = new StringTokenizer(br.readLine());

        while(st2.hasMoreTokens()){
            Integer a = hm.get(Integer.parseInt(st2.nextToken()));
            if(a!=null){
                sb.append(a);
            }else{
                sb.append(0);
            }
            sb.append(" ");
        }

        sb.setLength(sb.length()-1);

        System.out.println(sb);
    }
}