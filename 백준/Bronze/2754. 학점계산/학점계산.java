import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        String gr = br.readLine();

        double yourScore;

        if ("A+".equals(gr)) yourScore = 4.3;
        else if ("A0".equals(gr)) yourScore = 4.0;
        else if ("A-".equals(gr)) yourScore = 3.7;
        else if ("B+".equals(gr)) yourScore = 3.3;
        else if ("B0".equals(gr)) yourScore = 3.0;
        else if ("B-".equals(gr)) yourScore = 2.7;
        else if ("C+".equals(gr)) yourScore = 2.3;
        else if ("C0".equals(gr)) yourScore = 2.0;
        else if ("C-".equals(gr)) yourScore = 1.7;
        else if ("D+".equals(gr)) yourScore = 1.3;
        else if ("D0".equals(gr)) yourScore = 1.0;
        else if ("D-".equals(gr)) yourScore = 0.7;
        else yourScore = 0.0;

        System.out.println(yourScore);
    }
}
