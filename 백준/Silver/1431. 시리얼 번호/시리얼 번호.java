import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int c = Integer.parseInt(br.readLine());
        ArrayList<Guitar> al = new ArrayList<>();

        for (int i = 0; i < c; i++) {
            al.add(new Guitar(br.readLine()));
        }

        Collections.sort(al);

        for (Guitar guitar : al) {
            sb.append(guitar.toString()).append("\n");
        }

        System.out.println(sb);
    }

    static class Guitar implements Comparable<Guitar> {
        String name;
        int hap;

        public String toString(){
            return name;
        }

        public Guitar(String s) {
            name = s;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) >= '0' && s.charAt(i) <= '9') hap += s.charAt(i) - '0';
            }
        }

        @Override
        public int compareTo(Guitar o) {
            if (o.name.length() != name.length())
                return name.length()-o.name.length();
            if (o.hap != hap)
                return hap - o.hap;
            else
                return name.compareTo(o.name);
        }
    }
}
