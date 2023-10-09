import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer = 0;

        String[] nums = br.readLine().split("-");
        int[] answers = new int[nums.length];

        for (int i=0;i<nums.length;i++) {
            String number[] = nums[i].split("\\+");
            answers[i] = Arrays.stream(number).mapToInt(Integer::parseInt).sum();
        }

        for (int i=0;i<answers.length;i++) {
            if(i==0)
                answer+=answers[i];
            else
                answer-=answers[i];
        }

        System.out.println(answer);
    }
}