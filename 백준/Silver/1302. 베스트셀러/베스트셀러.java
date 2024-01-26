import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        HashMap<String,Integer> hm = new HashMap<>();
        ArrayList<String> al = new ArrayList<>();
        int many = 0;

        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            String str = br.readLine();
            int counter = hm.getOrDefault(str, 0)+1;
            if(many<counter) many=counter;
            hm.put(str, counter);
        }

        for (String s : hm.keySet()) {
            if(hm.get(s)==many){
                al.add(s);
            }
        }

        Collections.sort(al);

        System.out.println(al.get(0));
    }
}