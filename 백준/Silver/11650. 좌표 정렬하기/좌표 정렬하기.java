import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        ArrayList<Wich> al = new ArrayList<>();

        int[][] w = new int[count][2];

        for(int i=0;i<count;i++){
            String[] s = br.readLine().split(" ");
            w[i][0]=Integer.parseInt(s[0]);
            w[i][1]=Integer.parseInt(s[1]);
        }

        for (int[] ints : w) {
            al.add(new Wich(ints));
        }

        Collections.sort(al);

        for (Wich wich : al) {
            System.out.println(wich.x+" "+wich.y);
        }
    }

    public static class Wich implements Comparable<Wich>{
        int x,y;
        public Wich(int[] x){
            this.x = x[0];
            this.y = x[1];
        }

        @Override
        public int compareTo(Wich o) {
            if(x==o.x)
                return y-o.y;
            return x-o.x;
        }
    }
}