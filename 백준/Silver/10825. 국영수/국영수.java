import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int count = Integer.parseInt(br.readLine());
        ArrayList<Grade> al = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            al.add(new Grade(br.readLine()));
        }
        Collections.sort(al);
        for (Grade g:al) {
            sb.append(g.name).append("\n");
        }
        System.out.println(sb);
    }

    static class Grade implements Comparable<Grade>{
        public String name;
        public int kor,eng,mat;

        @Override
        public int compareTo(Grade g) {
            if(kor != g.kor) return g.kor-kor;
            if(eng != g.eng) return eng-g.eng;
            if(mat != g.mat) return g.mat-mat;
            return name.compareTo(g.name);
        }

        public Grade(String br){
            String[] strings = br.split(" ");
            name = strings[0];
            kor = Integer.parseInt(strings[1]);
            eng = Integer.parseInt(strings[2]);
            mat = Integer.parseInt(strings[3]);
        }
    }
}