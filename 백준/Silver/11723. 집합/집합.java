import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int a = Integer.parseInt(br.readLine());
        Set<Integer> s = new HashSet<>();

        for (int i = 0; i < a; i++) {
            String str = br.readLine();
            String[] command = str.split(" ");

            if (command[0].equals("add"))
                s.add(Integer.parseInt(command[1]));

            else if (command[0].equals("remove"))
                s.remove(Integer.parseInt(command[1]));

            else if (command[0].equals("check"))
                sb.append(s.contains(Integer.parseInt(command[1])) ? 1 : 0).append("\n");

            else if (command[0].equals("toggle")) {
                if(s.contains(Integer.parseInt(command[1])))
                    s.remove(Integer.parseInt(command[1]));
                else
                    s.add(Integer.parseInt(command[1]));
            }

            else if (command[0].equals("all"))
                s.addAll(Set.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20));

            else if (command[0].equals("empty"))
                s.clear();

        }

        System.out.println(sb);

    }
}