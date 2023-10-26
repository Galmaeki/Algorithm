import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int max =0;
        int min = 0;

        String mxStr = str.replace('5','6');
        String mnStr = str.replace('6','5');

        String[] mxNums = mxStr.split(" ");
        String[] mnNums = mnStr.split(" ");

        max = Integer.parseInt(mxNums[0])+Integer.parseInt(mxNums[1]);
        min = Integer.parseInt(mnNums[0])+Integer.parseInt(mnNums[1]);


        System.out.println(min+" "+max);
    }
}