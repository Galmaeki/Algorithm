import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int vac = Integer.parseInt(br.readLine());
        int korW = Integer.parseInt(br.readLine());
        int matW = Integer.parseInt(br.readLine());
        int korP = Integer.parseInt(br.readLine());
        int matP = Integer.parseInt(br.readLine());
        int korD = korW/korP;
        if(korW%korP!=0) korD++;
        int matD = matW/matP;
        if(matW%matP!=0) matD++;

        System.out.println(matD>korD?vac-matD:vac-korD);
    }
}