import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String,Integer> hm = new HashMap<>();
        boolean bool = false;

        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String fruit = st.nextToken();
            int quan = Integer.parseInt(st.nextToken());

            hm.put(fruit,hm.getOrDefault(fruit,0)+quan);
        }

        for (String s : hm.keySet()) {
            if(hm.get(s)==5){
                bool = true;
            }
        }

        System.out.println(bool?"YES":"NO");
    }
}