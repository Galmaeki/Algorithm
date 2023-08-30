import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<People> al = new ArrayList<>();
        int count = Integer.parseInt(br.readLine());
        for (int i = 0; i < count; i++) {
            al.add(new People(br.readLine()));
        }
        Collections.sort(al);
        for(People p:al){
            System.out.println(p.toString());
        }
    }
    static class People implements Comparable<People>{
        public int age;
        public String name;
        public People(String str){
            String[] s = str.split(" ");
            age = Integer.parseInt(s[0]);
            name = s[1];
        }
        public String toString(){
            return age +" "+name;
        }

        @Override
        public int compareTo(People o) {
            return age-o.age;
//            return o.name.compareTo(name);
        }
    }
}