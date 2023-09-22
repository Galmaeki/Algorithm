import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> al = new ArrayList<>();
        int max = 0;
        double sum = 0;
        int count = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < count; i++) {
            int a = Integer.parseInt(st.nextToken());
            al.add(a);
            if(a>max){
                max = a;
            }
        }

        for (Integer i : al) {
            sum+= ((double)i/(double)max) *100;
        }
        System.out.println(sum/count);
    }
}