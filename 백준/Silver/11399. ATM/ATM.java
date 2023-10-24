import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> al = new ArrayList<>();
        int answer = 0;
        int count = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] num = new int[count];

        for (int i = 0; i < count; i++) {
            al.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(al);
        num[0]=al.get(0);
        answer+=num[0];
        for (int i = 1; i < count; i++) {
            num[i]=num[i-1]+al.get(i);
            answer+=num[i];
        }
        
        System.out.println(answer);
    }
}