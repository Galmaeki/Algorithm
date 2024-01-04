import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int count = Integer.parseInt(st1.nextToken());
        int reward = Integer.parseInt(st1.nextToken());

        int[] peoples = new int[count];
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < count; i++) {
            peoples[i]= Integer.parseInt(st2.nextToken());
        }

        Arrays.sort(peoples);
        System.out.println(peoples[peoples.length-reward]);
    }
}