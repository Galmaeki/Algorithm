import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            String line = br.readLine();
            if(line.equals("0 0 0"))
                break;

            check(line);
            sb.append("\n");
        }

        System.out.println(sb);
    }

    static void check(String s){
        ArrayList<Double> al = new ArrayList<>();

        for(String st : s.split(" ")){
            al.add(Double.parseDouble(st));
        }

        Collections.sort(al);

        if((al.get(0)*al.get(0))+(al.get(1)*al.get(1))==(al.get(2)*al.get(2)))
            sb.append("right");
        else
            sb.append("wrong");
    }
}