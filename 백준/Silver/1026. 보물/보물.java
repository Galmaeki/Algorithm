import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> al1 = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();
        int sum =0;

        int count = Integer.parseInt(br.readLine());

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        for (int i = 0; i < count; i++) {
            al1.add(Integer.parseInt(st1.nextToken()));
        }

        for (int i = 0; i < count; i++) {
            al2.add(Integer.parseInt(st2.nextToken()));
        }

        Collections.sort(al1);
        Collections.sort(al2,Comparator.reverseOrder());

        for (int i = 0; i < count; i++) {
            sum+=al1.get(i)*al2.get(i);
        }

        System.out.println(sum);
    }
}