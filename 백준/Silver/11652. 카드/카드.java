import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {

    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int a = Integer.parseInt(br.readLine());
        HashMap<Long, Integer> hm = new HashMap<>();
        for (int i = 0; i < a; i++) {
            long str = Long.parseLong(br.readLine());
            hm.put(str,hm.getOrDefault(str,0)+1);
        }

        int max = -1;
        long maxLong=0;

        for (long s : hm.keySet()) {
            if(hm.get(s)>max){
                max = hm.get(s);
                maxLong = s;
            }else if(hm.get(s)==max){
                maxLong = Math.min(s, maxLong);
            }
        }
        System.out.println(maxLong);
    }
}