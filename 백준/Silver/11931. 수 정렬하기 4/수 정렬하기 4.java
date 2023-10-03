import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> al = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            al.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(al, Comparator.reverseOrder());

        for (Integer integer : al) {
            sb.append(integer).append("\n");
        }

        sb.setLength(sb.length()-1);

        System.out.println(sb);
    }
}