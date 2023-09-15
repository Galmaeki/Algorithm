import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> st = new Stack<>();

        int count = Integer.parseInt(br.readLine());
        int[] num = new int[count];

        for (int i = 0; i < count; i++) {
            num[i]=Integer.parseInt(br.readLine());
        }

        for (int i : num) {
            if(i!=0){
                st.push(i);
            }else{
                st.pop();
            }
        }

        System.out.println(st.stream().mapToInt(Integer::intValue).sum());
    }
}