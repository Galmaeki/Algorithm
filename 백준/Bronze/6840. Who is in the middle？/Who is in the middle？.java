import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.IntStream;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(Integer.parseInt(br.readLine()));
        al.add(Integer.parseInt(br.readLine()));
        al.add(Integer.parseInt(br.readLine()));
        
        al.sort(Comparator.naturalOrder());

        System.out.println(al.get(1));
    }
}


